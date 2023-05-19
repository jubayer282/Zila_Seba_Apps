package com.trodev.zilasebaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    /*declare values*/
    private MaterialCardView companyMc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*initial this id*/
        companyMc = findViewById(R.id.companyMc);

        /*set on click listener*/
        companyMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Trodev", Toast.LENGTH_SHORT).show();
            }
        });

    }

}