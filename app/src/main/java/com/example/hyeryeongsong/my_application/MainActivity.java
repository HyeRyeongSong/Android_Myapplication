package com.example.hyeryeongsong.my_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        Intent intent = new Intent(this, bt1_Activity.class);
        startActivity(intent);
    }

    void bt2_clicked(View v)
    {
        Intent intent = new Intent(this, bt2_Activity.class);
        startActivity(intent);
    }
    void bt3_clicked(View v)
    {
        Intent intent = new Intent(this, bt3_Activity.class);
        startActivity(intent);
    }
}
