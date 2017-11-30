package com.example.hyeryeongsong.my_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void bt1_clicked(View v)
    {
        TextView textView;
        textView = (TextView) findViewById(R.id.text);

        textView.setTextColor(0xffff0000);
    }

    //button1을 누르면 bt1_Activity 파일로 넘어가게 해주는 코드
    //Input parameter

    //Intent intent = new Intent(A, B)
    //startActivity(intent)
    //이렇게 두 줄로 써도 됨

    //Intent(A, B) --> A:context, B:class
    startActivity(new Intent(this, bt1_Activity.class));

    void bt2_clicked(View v)
    {
        TextView textView;
        textView = (TextView) findViewById(R.id.text);

        textView.setTextColor(0xff00ff00);
    }
    void bt3_clicked(View v)
    {
        TextView textView;
        textView = (TextView) findViewById(R.id.text);

        textView.setTextColor(0xff0000ff);
    }

}
