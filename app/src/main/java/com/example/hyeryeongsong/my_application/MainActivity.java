package com.example.hyeryeongsong.my_application;

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
