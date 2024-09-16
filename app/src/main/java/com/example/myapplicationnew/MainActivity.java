package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView maketingFrase = (ImageView)findViewById(R.id.maketingFrase);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        EditText Username = (EditText) findViewById(R.id.Username);
        Button Loginbutton = (Button) findViewById(R.id.Loginbutton);
        Button signUpButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUpButton = (Button)findViewById(R.id.signUpButton);
        // set button behaviour
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent1);
            }
        });
    }
}