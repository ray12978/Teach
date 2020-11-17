package com.ray.teach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private String Tag = "now";
    private Button button1;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //儲存狀態
        setContentView(R.layout.activity_main); //設定要連接的頁面(Activity)
        button1 = findViewById(R.id.button);    //設定物件連接的view
        TextView textView1 = findViewById(R.id.textView2);
        Log.v(Tag, "onCreate");
        your_function();
        textView1.setText("0");
        button1.setOnClickListener(v -> {       //監聽按鈕事件(lambda格式)
            count++;
            textView1.setText(String.valueOf(count));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }

    protected void your_function(){
        //do something
        System.out.println("executed");
    }
}