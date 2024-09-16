package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button BackBtn;
        EditText NameNew = (EditText) findViewById(R.id.NameNew);
        EditText EmailNew = (EditText) findViewById(R.id.EmailNew);
        EditText PasswordNew = (EditText) findViewById(R.id.PasswordNew);

        EditText phoneNew = (EditText) findViewById(R.id.phoneNew);

        EditText city = (EditText) findViewById(R.id.city);
        EditText HomeAddress = (EditText) findViewById(R.id.HomeAddress);

        Button FinishRegistrationBut = (Button)findViewById(R.id.FinishRegistrationBut);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BackBtn = (Button)findViewById(R.id.BackBtn);

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}