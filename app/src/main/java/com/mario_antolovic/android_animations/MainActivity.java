package com.mario_antolovic.android_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txthelloWorld;
    private TextView txthiworld;
    private boolean isHelloWorldUp;
    private ImageView tiger;
    private ImageView lion;
    private boolean isPictureShowing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txthelloWorld = findViewById(R.id.txthelloWorld);
        txthiworld = findViewById(R.id.txthelloWorld2);
        tiger = findViewById(R.id.tiger);
        lion = findViewById(R.id.lion);

        txthelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Log.i("MyTag","Hello World");
              //  txthelloWorld.animate().alpha(0).setDuration(3000);
              //  txthiworld.animate().alpha(1).setDuration(3000);
                if (isHelloWorldUp==true) {
                    txthelloWorld.animate().alpha(0).setDuration(3000);
                     txthiworld.animate().alpha(1).setDuration(3000);
                     isHelloWorldUp = false;

                }
                else if (!isHelloWorldUp){

                    txthelloWorld.animate().alpha(1).setDuration(3000);
                    txthiworld.animate().alpha(0).setDuration(3000);

                    isHelloWorldUp = true;

                }

            }


        });
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPictureShowing) {
                    tiger.animate().alpha(0).setDuration(3200);
                    lion.animate().alpha(1).setDuration(3200);

                    isPictureShowing = false;
                } else if (!isPictureShowing){
                    tiger.animate().alpha(1).setDuration(3200);
                    lion.animate().alpha(0).setDuration(3200);

                    isPictureShowing = true;
                }
            }
        });

    }
}
