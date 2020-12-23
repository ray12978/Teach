package com.ray.teach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.ray.teach.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private String Tag = "Act1";
    private Button button1;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //儲存狀態
        /** //傳統綁定View架構
         *  setContentView(R.layout.activity_main); //設定要連接的頁面(Activity)
         *  button1 = findViewById(R.id.button);    //設定物件連接的view
         *  TextView textView1 = findViewById(R.id.textView2);
         */


        /**
         *   View Binding 新的綁定View架構，減少程式碼量
         *   activity檔案命名需符合格式
         *   e.g. activity_NAME.xml
         */

        /**Activity[NAME]Binding binding = Activity[NAME]Binding.inflate(getLayoutInflater());*/
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextView textView1 = binding.textView2; //區域物件
        button1 = binding.button;           //全域物件
        Button chAct = binding.chgBtn;     //區域物件

        Log.v(Tag, "onCreate");
        your_function();
        textView1.setText("0");
        button1.setOnClickListener(v -> {       //監聽按鈕事件(lambda格式)
            count++;
            textView1.setText(String.valueOf(count));
        });
        chAct.setOnClickListener(v -> {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
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

    public void onPostResume() {
        super.onPostResume();
        Log.d(Tag, "onPostResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy");
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(Tag, "onConfigurationChanged");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d(Tag, "onContentChanged");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(Tag, "onPostCreate");
    }

    protected void your_function() {
        //do something
        System.out.println("executed");
    }
}