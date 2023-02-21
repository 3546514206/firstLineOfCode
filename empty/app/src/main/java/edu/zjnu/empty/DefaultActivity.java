package edu.zjnu.empty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        Button button = findViewById(R.id.returnMainButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                resetTextViewContent();
//                finish();
                jumpMainActivityExplicit(v);
//                jumpMainActivityInExplicit(v);
            }

            private void resetTextViewContent() {
                TextView contentTextView = findViewById(R.id.defaltActivityText);
                contentTextView.setText(data);
            }

            /**
             * 显式intent跳转
             * @param v
             */
            private void jumpMainActivityInExplicit(View v) {
                Intent intent = new Intent("edu.zjnu.empty.MainActivity");
                startActivity(intent);
            }

            private void jumpMainActivityExplicit(View v) {
                Intent intent = new Intent(DefaultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}