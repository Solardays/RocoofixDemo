package com.jc.rocoofixdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private HelloHack helloHack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloHack = new HelloHack();
    }

    public void fixed(View view){
        Toast.makeText(this,helloHack.showHello(),Toast.LENGTH_SHORT).show();
    }
}
