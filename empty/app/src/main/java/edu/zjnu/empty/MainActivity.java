package edu.zjnu.empty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;

import edu.zjnu.empty.entity.User;
import edu.zjnu.empty.utils.NetUtils;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.mybutton);
//        EditText contentTextPanel = findViewById(R.id.contentTextPanel);

        button.setOnClickListener(loginButton -> {
            Log.i(TAG, loginButton.toString());
            Toast.makeText(this, "宝贝老婆罗思雯", Toast.LENGTH_LONG).show();
//            send(loginButton, contentTextPanel);
        });

        Button finishButton = findViewById(R.id.finishButton);
        finishButton.setOnClickListener(v -> finish());

        Button intentDefaultButton = findViewById(R.id.intentDefault);
        intentDefaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DefaultActivity.class);
//                Intent intent = new Intent("edu.zjnu.empty.DefaultActivity");
                String data = "这是传递的数据";
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
    }

    private void send(View loginButton, EditText contentTextPanel) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                User sendUser = new User();
                String request = buildSendUserInfo(sendUser);
                String response = NetUtils.post("http://127.0.0.1:8089/app/user/login", request);
                Log.i(TAG, response);
            }

            private String buildSendUserInfo(User sendUser) {
                sendUser.setId("1");
                sendUser.setName("罗思雯");
                sendUser.setAge("18");
                return JSON.toJSONString(sendUser);
            }

        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Toast.makeText(MainActivity.this, "点击了新增按钮", Toast.LENGTH_LONG).show();
                break;
            case R.id.modify:
                Toast.makeText(MainActivity.this, "点击了修改按钮", Toast.LENGTH_LONG).show();
                break;
            case R.id.delete:
                Toast.makeText(MainActivity.this, "点击了删除按钮", Toast.LENGTH_LONG).show();
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}