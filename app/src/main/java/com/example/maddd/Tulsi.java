package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tulsi extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulsi);
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);
        ;
        txtdesp.setText("Description");
        edtdesp.setText("The tulsi plant has many medicinal properties. The leaves are a nerve tonic and also sharpen memory. They promote the removal of the catarrhal matter and phlegm from the bronchial tube. The leaves strengthen the stomach and induce copious perspiration. The seed of the plant are mucilaginous.");
        txtuse.setText("uses");
       edtuse.setText(">> Tulsi is an important constituent of many Ayurvedic cough syrups and expectorants. It helps to mobilize mucus in bronchitis and asthma. Chewing tulsi leaves relieves cold and flu.\n\n " +
                ">> Water boiled with basil leaves can be taken as drink in case of sore throat. This water can also be used as a gargle.\n\n" +
                ">> Basil has strengthening effect on the kidney. In case of renal stone the juice of basil leaves and honey, if taken regularly for 6 months it will expel them via the urinary tract.");

    }
}