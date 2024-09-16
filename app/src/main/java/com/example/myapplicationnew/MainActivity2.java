package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView tmerImage = (ImageView) findViewById(R.id.tmerImage);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // find textview
        TextView tv = findViewById(R.id.tvCdt1);

        // create a new countDown object
        CountDownTimer cdt = new CountDownTimer(4000, 1000) {
            @Override
            //set value for textView
            public void onTick(long millisUntilFinished) {
                String stCountDown = millisUntilFinished / 1000 + "";
                tv.setText(String.valueOf(stCountDown));
            }

            public void onFinish() {
                tv.setText("FINISH!!");
                Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent2);
            }
        }.start();
    }

}