package com.example.hyeryeongsong.my_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //java class 와 같은 개념이므로 webView를 동적할당 해줘야 함
        //webView = new WebView(this);
        //activity_main.xml 파일의 화면을 activity에서 실행되는 화면으로 쓰겠다
        setContentView(R.layout.activity_main);
        //webView.loadUrl("https://www.naver.com");
        //setContentView(webView);

        //xml 안의 모든 컴포넌트를 다 View로 취급하기 때문에 Button으로 캐스팅 해줘야 함
        Button btn1 = (Button)findViewById(R.id.btn1);
    }

    void Func(View v)
    {
        //빵을 토스트기에 넣으면 튀어나온다의 의미
        //(context, text, 환경변수)
        Toast.makeText(this, "abcd", Toast.LENGTH_SHORT).show();
    }
}
