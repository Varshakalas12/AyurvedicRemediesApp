package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Amla extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amla);
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        txtdesp.setText("Description");
       edtdesp.setText("Amla is a place in Madhya Pradesh in India.Amla junction is 38 km from Betul on rail route towards Nagpur . By road Amla is about 35 km from Betul.Amla is bordered to the south by low lying ridges of Deccan Trap. Northwestern part is also a hilly terrain with height up to 843 m from M.S.L. ");
        txtuse.setText("uses");
       edtuse.setText("Although Ayurvedic doctors have a great deal of experience with the use of Amla, little human research is available in the West. Research has been done with amla evaluating its role as an antioxidant, in ulcer prevention, for people with diabetes, for mental and memory effects, and its anti-inflammatory benefits.");
    }
}