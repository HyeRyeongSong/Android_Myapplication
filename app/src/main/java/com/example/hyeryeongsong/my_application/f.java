package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by HyeRyeongSong on 2017. 11. 23..
 */

public class f extends Activity
{
    //define valuables for this Activity
    ArrayList<Integer> reserve;

    Button button11;
    Button button12;
    Button button21;
    Button button22;
    Button button31;
    Button button32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt1_screen);

        //make an ArrayList for checking it's reserved or not
        reserve = new ArrayList<Integer>();

        //initialize all seat (not reserved yet)
        reserve.add(1);
        reserve.add(1);
        reserve.add(1);
        reserve.add(1);
        reserve.add(1);
        reserve.add(1);

        //connect button in .xml with .java
        button11 = (Button) findViewById(R.id.btn11);
        button12 = (Button) findViewById(R.id.btn12);
        button21 = (Button) findViewById(R.id.btn21);
        button22 = (Button) findViewById(R.id.t_btn22);
        button31 = (Button) findViewById(R.id.btn31);
        button32 = (Button) findViewById(R.id.btn32);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.
                // Do something with the contact here (bigger example below)
                int seatNum = data.getIntExtra("seatNum",-1);
                Log.d("seatNum","seatNum : " + seatNum);

                int color = -1;
                Log.d("color", "color : " + color);

                if(seatNum >= 10) {
                    //it's reserved
                    seatNum -= 10;
                    color = 0xFFFF0000;
                } else if (seatNum >= 0) {
                    //it's not reserved
                    color = 0xFF0000FF;
                } else {
                    Toast.makeText(this,"Wrong Reservation result",Toast.LENGTH_SHORT).show();
                }

                Log.d("seatColor", "color : " + color);

                if(color != -1)
                    Reserve_seat(seatNum, color);
                else {
                    Toast.makeText(this,"Wrong Reservation result",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    //******************************************************************************************************
    // Button controllors
    // RB == Reservation Button
    // RB11 ~ RB32 is the seat

    public void RB11_clicked(View v) {
        int seatNum = 0;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num", 11);
            startActivityForResult(intent, 1);
        }
    }

    public void RB12_clicked(View v) {
        int seatNum = 1;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num", 12);
            startActivityForResult(intent, 1);
        }
    }

    public void RB21_clicked(View v) {
        int seatNum = 2;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num", 21);
            startActivityForResult(intent, 1);
        }
    }

    public void RB22_clicked(View v) {
        int seatNum = 3;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num",22);
            startActivityForResult(intent,1);
        }
    }

    public void RB31_clicked(View v) {
        int seatNum = 4;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num", 31);
            startActivityForResult(intent, 1);
        }
    }

    public void RB32_clicked(View v) {
        int seatNum = 5;

        if(reserve.get(seatNum) == 0) {
            Toast.makeText(this,"This seat is already reserved",Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, bt2_Activity.class);

            intent.putExtra("num", 32);
            startActivityForResult(intent, 1);
        }
    }

    //**********************************************************************************************
    //This function is for change the button's contribution
    //if specific seat is reserved, then change its colr from blue to red
    public void Reserve_seat(int num, int color) {
        switch (num) {
            case 0:
                button11.setBackgroundColor(color);
                reserve.set(num,0);
                break;
            case 1:
                button12.setBackgroundColor(color);
                reserve.set(num,0);
                break;
            case 2:
                button21.setBackgroundColor(color);
                reserve.set(num,0);
                break;
            case 3:
                button22.setBackgroundColor(color);
                reserve.set(num,0);
                break;
            case 4:
                button31.setBackgroundColor(color);
                reserve.set(num,0);
                break;
            case 5:
                button32.setBackgroundColor(color);
                reserve.set(num,0);
                break;
        }
    }
}

