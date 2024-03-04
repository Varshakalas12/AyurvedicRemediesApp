package com.example.maddd;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class searchoption extends AppCompatActivity {
    private Button btndisease;
    private Button btnherbal;
    private Button btnBMI;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchoption);
//        getSupportActionBar().setTitle("AYURVEDIC TREATMENT");

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btndisease=findViewById(R.id.btndisease);
        btnherbal=findViewById(R.id.btnherbal);
        btnBMI=findViewById(R.id.btnBMI);

        btndisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchoption.this,searchdisease.class);
                startActivity(intent);
               // finish();
            }
        });
        btnherbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchoption.this,searchplant.class);
                startActivity(intent);
                //finish();
            }
        });
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchoption.this,bmi.class);
                startActivity(intent);
                //finish();
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
           // finish(); // Close the current activity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}