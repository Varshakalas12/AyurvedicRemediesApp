package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tith_begun extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tith_begun);

        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        txtdesp.setText("Description");
        edtdesp.setText("The plant is usually 2 or 3 m in height and 2 cm in basal diameter, but may reach 5m in height and 8 cm in basal diameter. The shrub usually has a single stem at ground level, but it may branch on the lower stem. The stem bark is gray and nearly smooth with raised lenticels. The inner bark has a green layer over an ivory color (Little and others 1974). The plants examined by the author, growing on firm soil, had weak taproots and well-developed laterals. The roots are white.");
        txtuse.setText("uses");
        edtuse.setText("It is used in Fever, coughs, loss of appetite, leprosy, heartdisorders. Juice obtained from whole plant istaken orally.Entering of thorn in any part of the body. Rootsare inserted into a banana fruit and taken orally in the morning (thorns come out by themselvesfollowing this procedure).");
    }
}