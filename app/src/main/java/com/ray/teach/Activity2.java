package com.ray.teach;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ray.teach.databinding.ActivityMainBinding;
import com.ray.teach.databinding.ActivityPage2Binding;

public class Activity2 extends AppCompatActivity {
    String Tag = "Act2";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityPage2Binding binding = ActivityPage2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());//需在Manifest宣告activity物件
        Log.v(Tag, "onCreate");
        your_function();
        Button chAct = binding.chgBtn2;
        chAct.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
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
