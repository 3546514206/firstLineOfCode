package edu.zjnu.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

/**
 * @author: 杨海波
 * @date: 2023-03-04 13:59:30
 * @description: todo
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);
//        resourceId 应该是指整个 listview 列表
        @SuppressLint("ViewHolder") View view ;
//        利用缓存进行优化
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }else {
            view = convertView;
        }
        Button button =view.findViewById(R.id.button);
        TextView text = view.findViewById(R.id.textView);
        button.setText(fruit.getName());
        text.setText(fruit.getName());

        return view;
    }
}
