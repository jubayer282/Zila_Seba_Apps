package com.trodev.zilasebaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    /*declare values*/
    private MaterialCardView ambulanceMC;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*initial this id*/
        ambulanceMC = findViewById(R.id.ambulanceMC);

        /*set on click listener*/
        ambulanceMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Information all Ambulance", Toast.LENGTH_SHORT).show();
            }
        });

    }

}