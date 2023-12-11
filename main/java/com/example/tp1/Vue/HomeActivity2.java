package com.example.tp1.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tp1.R;

public class HomeActivity2 extends AppCompatActivity {
   private Button btnconsulter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        btnconsulter = (Button) findViewById(R.id.btnconsulter);
        btnconsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnconsulter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity2.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });


            }
        });
    }
}