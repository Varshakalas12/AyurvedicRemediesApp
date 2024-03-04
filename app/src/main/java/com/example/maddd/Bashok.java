package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bashok extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bashok); // Replace "your_layout" with the actual layout file name
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        txtdesp.setText("Description");
        edtdesp.setText("Bashoka consists of the fresh or dried leaves of Adhatoda Vasica, Nees (N.O. Acanthaceae), a shrub growing in India. The leaves vary from 10 to 15 centimeters in length, and are about 4 centimeters broad; they are opposite, entire, lanceolate, and shortly petiolate, tapering towards both apex and base. When dry they are of a dull brownish-green colour; odour, characteristic; taste, bitter.");
        txtuse.setText("uses");
        edtuse.setText(">It is used in Coughs, mucus, fever. Juice obtained fromcrushed leaves is taken orally.Tuberculosis, passing of blood through themouth due to lung disorders. Dried andpowdered bark is taken orally");

    }
}

