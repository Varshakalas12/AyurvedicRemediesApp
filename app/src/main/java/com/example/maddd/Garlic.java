package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Garlic extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn7;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_garlic); // Replace "your_layout" with the actual layout file name

            txtdesp=findViewById(R.id.txtdesp);
            txtuse= findViewById(R.id.txtuse);
            edtdesp=findViewById(R.id.edtdesp);
            edtuse=findViewById(R.id.edtuse);

            txtdesp.setText("Description");
           edtdesp.setText ("Allium sativum, commonly known as garlic, is a species in the onion genus. Garlic is easy to grow and can be grown year-round in mild climates.");
            txtuse.setText("uses");
            edtuse.setText(">> Garlic is also alleged to help regulate blood sugar levels. Regular and prolonged use of therapeutic amounts of aged garlic extracts lower blood homocysteine levels and has been shown to prevent some complications of diabetes mellitus.\n\n" +
                    ">> Garlic was used as an antiseptic to prevent gangrene.\n\n" +
                    ">> Garlic cloves are used as a remedy for infections (especially chest problems), digestive disorders, and fungal infections.");

        }
    }



