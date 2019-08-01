package com.example.example03_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 通过ID找到TextView对象
        mTextView = (TextView) findViewById(R.id.textView);
        // 设置TextView的显示内容
        String showText = "欢迎来到Android的世界";
        mTextView.setText(showText);
    }
}
