package edu.zjnu.uiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Map<String, View> viewMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

        EditText text = findViewById(R.id.text);
        ImageView imageView = findViewById(R.id.imageView);

        viewMap.put("button", button);
        viewMap.put("text", text);
        viewMap.put("imageView", imageView);
    }

    @Override
    public void onClick(View v) {
        EditText text = (EditText) viewMap.get("text");
        String toastContent = null;
        if (text != null) {
            toastContent = text.getText().toString();
        }
        Toast.makeText(this, toastContent, Toast.LENGTH_LONG).show();
    }
}