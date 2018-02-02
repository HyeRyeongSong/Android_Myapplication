package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    DBHandler controller;

    final int RED = 1;
    final int GREEN = 2;
    final int BLUE = 3;

    int R_value;
    int G_value;
    int B_value;

    View check_box;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_box = (View)findViewById(R.id.box);

        controller = new DBHandler(getApplicationContext());

        R_value = 0;
        G_value = 0;
        B_value = 0;

        if(controller.countData() == 0)
            controller.insert_color(111,R_value,G_value,B_value);
        else {
            set_color(controller.select_id(111));
        }

        Log.d("DB","call select all");
        controller.select_all();

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(resultCode == Activity.RESULT_OK)
        {
            switch(requestCode)
            {
                case RED:
                    Log.d("color", "R_Num2 : " + data.getStringExtra("RED"));
                    R_value = Integer.parseInt(data.getStringExtra("RED"));
                    check_box.setBackgroundColor(Color.rgb(R_value, G_value, B_value));
                    break;

                case GREEN:
                    Log.d("color", "G_Num2 : " + data.getStringExtra("GREEN"));
                    G_value = Integer.parseInt(data.getStringExtra("GREEN"));
                    check_box.setBackgroundColor(Color.rgb(R_value, G_value, B_value));
                    break;

                case BLUE:
                    Log.d("color", "B_Num2 : " + data.getStringExtra("BLUE"));
                    B_value = Integer.parseInt(data.getStringExtra("BLUE"));
                    check_box.setBackgroundColor(Color.rgb(R_value, G_value, B_value));
                    break;
            }
        }

        if(resultCode == Activity.RESULT_CANCELED)
        {
            Toast.makeText(this, "Activity finished with no return value", Toast.LENGTH_SHORT).show();
        }
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

    public void set_color(Cursor c) {
        R_value = c.getInt(c.getColumnIndex("red"));
        G_value = c.getInt(c.getColumnIndex("green"));
        B_value = c.getInt(c.getColumnIndex("blue"));

        check_box.setBackgroundColor(Color.rgb(R_value,G_value,B_value));
    }


}
