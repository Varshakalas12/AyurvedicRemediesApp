package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Brahmi extends AppCompatActivity {

    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brahmi);
        // Replace "your_layout" with the actual layout file name
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        txtdesp.setText("Description");
        edtdesp.setText("It is a small, succulent ( stems adapted to store water), glabrous (smooth), creeping or prostrate (branches above the ground) annual herb.1It is also known as Herpestis monniera, water hyssop (small bushy) and is locally known as Jalanimba or brahmi in India ");
        txtuse.setText("uses");
        edtuse.setText(" Brahmi may have sedative properties that may help induce sleep. Some studies suggested that the extract of the whole brahmi plant might have sedative and tranquillising (reduces anxiety, tension, fear) effects on animals. Therefore, brahmi may induce sleep and may also be helpful for insomnia ");
    }
}
