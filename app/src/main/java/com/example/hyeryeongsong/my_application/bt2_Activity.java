package com.example.hyeryeongsong.my_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by HyeRyeongSong on 2017. 11. 30..
 */

public class bt2_Activity extends Activity
{
    //extends Activity에 있는 거 가져다가 쓰는 것이므로 @Override 꼭 써줘야 함
    //안 그러면 충돌남
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt2_screen);
    }

    @Override
    public void onBackPressed()
    {
        ;
    }

    public void active1_back_clicked(View v)
    {
        super.onBackPressed();
    }

}
