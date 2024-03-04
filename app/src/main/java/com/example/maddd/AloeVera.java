package com.example.maddd;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AloeVera extends AppCompatActivity {
    TextView txtuse;
   TextView txtdesp;
    TextView edtuse;
    TextView edtdesp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloe_vera);
      txtdesp=findViewById(R.id.txtdesp);
      txtuse= findViewById(R.id.txtuse);
      edtdesp=findViewById(R.id.edtdesp);
      edtuse=findViewById(R.id.edtuse);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
      txtdesp.setText("Description");
      edtdesp.setText("Aloe vera is a stemless or very short-stemmed succulent plant growing to 60–100 cm (24–39 in) tall, spreading by offsets. The leaves are thick and fleshy, green to grey-green, with some varieties showing white flecks on their upper and lower stem surfaces");
      txtuse.setText("uses");
      edtuse.setText(">> There is some preliminary evidence to suggest that oral administration of aloe vera might be effective in reducing blood glucose in diabetic patients and in lowering blood lipid levels in hyperlipidaemia.\\n\\n\" +\n" +
              "                \">> Aloe vera, called kathalai in Ayurvedic medicine, is used as a multipurpose skin treatment");
    }

}



