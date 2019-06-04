package com.example.themedtimer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bbutton,gbutton,pbutton,rbutton,next;
    View holderbg,dynamicbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get ids
        next = findViewById(R.id.next);

        bbutton = findViewById(R.id.bbutton);
        gbutton = findViewById(R.id.gbutton);
        pbutton = findViewById(R.id.pbutton);
        rbutton = findViewById(R.id.rbutton);

        holderbg =findViewById(R.id.holderbg);
        dynamicbg = findViewById(R.id.dynamicbg);

        holderbg.setBackgroundResource(R.drawable.greenbg);
        holderbg.setScaleX(3);
        holderbg.setScaleY(3);

        gbutton.setScaleX(1.2f);
        gbutton.setScaleY(1.2f);

        gbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //scale animation
                gbutton.animate().translationY(20).scaleX(1.2f).scaleY(1.2f).setDuration(800).start();

                //default
                bbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                pbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                rbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();

                //change color of next button
                next.setTextColor(Color.parseColor("#25AC0C"));

                //change background color
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();
                dynamicbg.setBackgroundResource(R.drawable.greenbg);
            }
        });

        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //scale animation
                bbutton.animate().translationY(20).scaleX(1.2f).scaleY(1.2f).setDuration(800).start();

                //default
                gbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                pbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                rbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();

                //change color of next button
                next.setTextColor(Color.parseColor("#0500FC"));

                //change background color
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();
                dynamicbg.setBackgroundResource(R.drawable.bluebg);

            }
        });

        pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //scale animation
                pbutton.animate().translationY(20).scaleX(1.2f).scaleY(1.2f).setDuration(800).start();

                //default
                gbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                bbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                rbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();

                //change color of next button
                next.setTextColor(Color.parseColor("#7100C8"));

                //change background color
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();
                dynamicbg.setBackgroundResource(R.drawable.purplebg);
            }
        });

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //scale animation
                rbutton.animate().translationY(20).scaleX(1.2f).scaleY(1.2f).setDuration(800).start();

                //default
                gbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                pbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();
                bbutton.animate().scaleX(1).scaleY(1).setDuration(350).start();

                //change color of next button
                next.setTextColor(Color.parseColor("#FC0000"));

                //change background color
                dynamicbg.animate().scaleX(3).scaleY(3).setDuration(800).start();
                dynamicbg.setBackgroundResource(R.drawable.redbg);
            }
        });
    }
}
