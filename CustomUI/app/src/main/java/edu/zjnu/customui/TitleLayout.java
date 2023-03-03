package edu.zjnu.customui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * @author: 杨海波
 * @date: 2023-03-03 22:55:19
 * @description:
 */
public class TitleLayout extends LinearLayout {


    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        Button edit = findViewById(R.id.edit);
        Button back = findViewById(R.id.back);

//         省略事件响应代码
    }
}
