package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HyeRyeongSong on 2017. 11. 23..
 */

public class bt1_Activity extends Activity
{
    DBHandler controller;

    EditText editText;
    int R_value;
    int G_value;
    int B_value;

    View tmp_view;

    boolean valid = false;

    //extends Activity에 있는 거 가져다가 쓰는 것이므로 @Override 꼭 써줘야 함
    //안 그러면 충돌남
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt1_screen);

        controller = new DBHandler(getApplicationContext());

        editText = (EditText)findViewById(R.id.Edit_R_value);

        Intent intent = getIntent();

        R_value = Integer.parseInt(intent.getStringExtra("RED"));
        G_value = Integer.parseInt(intent.getStringExtra("GREEN"));
        B_value = Integer.parseInt(intent.getStringExtra("BLUE"));

        tmp_view = (View)findViewById(R.id.t_frame);
        tmp_view.setBackgroundColor(Color.rgb(R_value, G_value, B_value));
    }

    public void apply_b_clicked(View v)
    {
        R_value = Integer.parseInt(editText.getText().toString());

        if(R_value>=0 && R_value<=255)
        {
            tmp_view.setBackgroundColor(Color.rgb(R_value, G_value, B_value));
            valid = true;
        }
        else
        {
            Toast.makeText(this, "R value should be in the range (1 ~ 255)", Toast.LENGTH_SHORT).show();
            valid = false;
        }

        editText.setText("");
    }

    @Override
    public void onBackPressed()
    {
        ;
    }

    public void active1_back_clicked(View v)
    {
        Intent returnIntent = new Intent();

        if(valid)
        {
            returnIntent.putExtra("RED", Integer.toString(R_value));

            Log.d("color", "R_Num1 : " + R_value);

            setResult(Activity.RESULT_OK, returnIntent);

            controller.update_R(111,R_value);

            super.onBackPressed();
        }
        else
        {
            Toast.makeText(this, "You should set valid 'R' value!", Toast.LENGTH_SHORT).show();
        }
    }
}
