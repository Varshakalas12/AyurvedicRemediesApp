package com.example.maddd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bitter_Gourd extends AppCompatActivity {
    TextView txtuse;
    TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitter_gourd);
        txtdesp=findViewById(R.id.txtdesp);
        txtuse= findViewById(R.id.txtuse);
        edtdesp=findViewById(R.id.edtdesp);
        edtuse=findViewById(R.id.edtuse);

        txtdesp.setText("Description");
        edtdesp.setText("Bitter melon comes in a variety of shapes and sizes. The cultivar common to China is 20–30 cm long, oblong with bluntly tapering ends and pale green in color, with a gently undulating, warty surface. The bitter melon more typical of India has a narrower shape with pointed ends, and a surface covered with jagged, triangular \"teeth\" and ridges. It is green to white in color. Between these two extremes are any number of intermediate forms. Some bear miniature fruit of only 6–10 cm in length, which may be served individually as stuffed vegetables.");
        txtuse.setText("uses");
       edtuse.setText(">> It has been used as a folk remedy for a variety of ailments, particularly stomach complaints.\n\n" +
                ">> Is used as an agent to reduce the blood glucose level.");





    }
}
