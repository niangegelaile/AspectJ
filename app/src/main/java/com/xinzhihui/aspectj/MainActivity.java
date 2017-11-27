package com.xinzhihui.aspectj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ToastCut;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testLog();
    }

    @ToastCut
    private void testLog(){
        Log.d(getClass().getSimpleName(),"test");
    }
}
