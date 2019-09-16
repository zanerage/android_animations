package com.mario_antolovic.android_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txthelloWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txthelloWorld = findViewById(R.id.txthelloWorld);

        txthelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Log.i("MyTag","Hello World");
                txthelloWorld.animate().scaleX(10f).setDuration(2000);
            }
        });
    }
}
