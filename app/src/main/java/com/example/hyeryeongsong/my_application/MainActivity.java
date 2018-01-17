package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    final int RED = 1;
    final int GREEN = 2;
    final int BLUE = 3;

    int R_value;
    int G_value;
    int B_value;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        R_value = 0;
        G_value = 0;
        B_value = 0;
    }

    void bt1_clicked(View v)
    {
        Intent intent = new Intent(this, bt1_Activity.class);

        intent.putExtra("RED", Integer.toString(R_value));
        intent.putExtra("GREEN", Integer.toString(G_value));
        intent.putExtra("BLUE", Integer.toString(B_value));

        startActivityForResult(intent, RED);
    }

    void bt2_clicked(View v)
    {
        Intent intent = new Intent(this, bt2_Activity.class);

        intent.putExtra("RED", Integer.toString(R_value));
        intent.putExtra("GREEN", Integer.toString(G_value));
        intent.putExtra("BLUE", Integer.toString(B_value));

        startActivityForResult(intent, GREEN);
    }
    void bt3_clicked(View v)
    {
        Intent intent = new Intent(this, bt3_Activity.class);

        intent.putExtra("RED", Integer.toString(R_value));
        intent.putExtra("GREEN", Integer.toString(G_value));
        intent.putExtra("BLUE", Integer.toString(B_value));

        startActivityForResult(intent, BLUE);
    }


    void Go_Clicked(View v)
    {
        EditText et = (EditText)findViewById(R.id.t_edit);
        String str = et.getText().toString();

        //{"words" : "~~~(str)~~~"}
        //"words"라는 tag를 떼주는 function을 go_Activity에서 해줌
        Intent intent = new Intent(this, go_Activity.class);

        intent.putExtra("words", str);

        startActivity(intent);
    }

}
