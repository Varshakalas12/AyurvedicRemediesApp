package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bitter_leaf extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn5;


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bitter_leaf); // Replace "your_layout" with the actual layout file name
            txtdesp=findViewById(R.id.txtdesp);
            txtuse= findViewById(R.id.txtuse);
            edtdesp=findViewById(R.id.edtdesp);
            edtuse=findViewById(R.id.edtuse);

            txtdesp.setText("Description");
            edtdesp.setText("Vernonia is a genus of about 1000 species of forbs and shrubs in the family Asteraceae. Some species are known as Ironweed. Some species are edible and of economic value. They are known for having intense purple flowers. The genus is named for English botanist William Vernon. There are numerous distinct subgenera and subsections in this genus.");
            txtuse.setText("uses");
           edtuse.setText("amygdalina is well known as a medicinal plant with several uses attributed to it, including for diabetes, fever reduction, and recently a non-pharmaceutical solution to persistent fever, headache, and joint pain associated with AIDS (an infusion of the plant is taken as needed).");

        }
    }


