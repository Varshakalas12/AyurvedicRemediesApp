package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Neem extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neem);
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        txtdesp.setText("Description");
        edtdesp.setText("\"Neem is a fast-growing tree that can reach a height of 15–20 metres (49–66 ft), rarely to 35–40 metres (115–130 ft). It is evergreen, but in severe drought it may shed most or nearly all of its leaves. The branches are wide and spreading.it is believed to be good for one's health. Neem gum is a rich source of protein. In Myanmar, young neem leaves and flower buds are boiled with tamarind fruit to soften its bitterness and eaten as a vegetable. Pickled neem leaves are also eaten with tomato and fish paste sauce in Myanmar");
        txtuse.setText("uses");
        edtuse.setText("it is believed to be good for one's health. Neem gum is a rich source of protein. In Myanmar, young neem leaves and flower buds are boiled with tamarind fruit to soften its bitterness and eaten as a vegetable. Pickled neem leaves are also eaten with tomato and fish paste sauce in Myanmar.\");\n" +
                "        herbalPlantsRow.setUses(\">> It is considered a major component in Ayurvedic  and Unani medicine and is particularly prescribed for skin diseases. \\n\\n\" +");
    }
}