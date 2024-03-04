package com.example.maddd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class searchdisease extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchdisease);

        RelativeLayout relativeSoreThroat = findViewById(R.id.relativeSoreThroat);
        RelativeLayout relativeFever = findViewById(R.id.relativeFever);
        RelativeLayout relativeHeadaches = findViewById(R.id.relativeHeadaches);
        RelativeLayout relativeMenstrualCramp= findViewById(R.id.relativeMenstrualCramp);
        RelativeLayout relativeMusclepainandinflamation = findViewById(R.id.relativeMusclepainandinflamation);
        RelativeLayout relativeJaundice = findViewById(R.id.relativeJaundice);
        RelativeLayout relativeSugar = findViewById(R.id.relativeSugar);
        RelativeLayout relativeSkinirritation = findViewById(R.id.relativeSkinirritaion);
        RelativeLayout relativeKidneyStone = findViewById(R.id.relativeKidneyStone);
        RelativeLayout relativeHeartdisease = findViewById(R.id.relativeHeartDisease);

        RelativeLayout relativeLowBloodPressure= findViewById(R.id.relativeLowBloodPressure);

        RelativeLayout relativeCold = findViewById(R.id.relativeCold);
        relativeCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Cold
                Intent intent = new Intent(searchdisease.this, cold_treatment.class);
                startActivity(intent);
            }
        });


        relativeSoreThroat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this, sore_throat.class);
                startActivity(intent);
            }
        });
        relativeHeadaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,headaches_treatment .class);
                startActivity(intent);
            }
        });
        relativeFever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,fever_treatment .class);
                startActivity(intent);
            }
        });
        relativeSkinirritation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,skin_treatment .class);
                startActivity(intent);
            }
        });
        relativeSugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,sugar_treatment .class);
                startActivity(intent);
            }
        });
        relativeKidneyStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,kidneystone .class);
                startActivity(intent);
            }
        });
        relativeMenstrualCramp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,menstrual_cramp_treatment .class);
                startActivity(intent);
            }
        });
        relativeMusclepainandinflamation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,muscle_pain_treatment .class);
                startActivity(intent);
            }
        });

        relativeJaundice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,jaundice .class);
                startActivity(intent);
            }
        });
        relativeLowBloodPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,lowbloodpressure_treatment.class);
                startActivity(intent);
            }
        });
        relativeHeartdisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,heart_disease_treatment .class);
                startActivity(intent);
            }
        });
        relativeLowBloodPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Sore Throat
                Intent intent = new Intent(searchdisease.this,lowbloodpressure_treatment .class);
                startActivity(intent);
            }
        });


    }
}
