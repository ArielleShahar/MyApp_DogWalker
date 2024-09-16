package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView profileicon = (ImageView) findViewById(R.id.profileicon);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

}