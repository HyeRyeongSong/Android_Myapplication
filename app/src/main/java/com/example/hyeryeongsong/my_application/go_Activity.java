package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by HyeRyeongSong on 2017. 11. 30..
 */

public class go_Activity extends Activity
{
    String words;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.go_screen);

        //MainActivity에서 사용한 intent는 A에서 B로 넘어가는 역할이라면
        //여기에서는
        //나를 호출한 intent가 뭐인지를 알려주는 역할
        Intent intent = getIntent();

        words = intent.getStringExtra("words");

        Log.d("words", words);

        TextView tv = (TextView)findViewById(R.id.go_words);
        tv.setText(words);
    }

    @Override
    public void onBackPressed()
    {}

    public void activeGo_back_clicked(View v)
    {
        super.onBackPressed();
    }
}
