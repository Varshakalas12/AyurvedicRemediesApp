package com.example.maddd;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bmicalc extends AppCompatActivity {
  android.widget.Button mrecalculatebmi;
  TextView mbmidisplay,mbmicategory,mgender;
  Intent intent;
  ImageView mimageview;
  String mbmi;
  float intbmi;

  String height;
  String weight;
  float intheight,intweight;
  RelativeLayout mbackground;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
        getSupportActionBar().setTitle("Result");
        ColorDrawable colorDrawable2=new ColorDrawable(Color.parseColor("#1E1D1D"));
           getSupportActionBar().setBackgroundDrawable(colorDrawable2);

        intent=getIntent();
        mbmidisplay=findViewById(R.id.bmidisplay);
        mbmicategory = findViewById(R.id.genderdisplay);
        mgender=findViewById(R.id.genderdisplay);
        mbackground=findViewById(R.id.contentlayout);
        //mgotomain=findViewById(R.id.gotomain);

        mimageview=findViewById(R.id.imageview1);
        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");


        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;
        intbmi=intweight/(intheight*intheight);


        mbmi=Float.toString(intbmi);
        System.out.println(mbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("Severe Thinness");
            //   mbackground.setBackgroundColor(Color.GRAY);
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.notok);
            //  mimageview.setBackground(colorDrawable2);

        }
        else if(intbmi<16.9 && intbmi>16)
        {
            mbmicategory.setText("Moderate Thinness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.notok);
            //   mimageview.setBackground(colorDrawable2);

        }
        else if(intbmi<18.4 && intbmi>17)
        {
            mbmicategory.setText("Mild Thinness");
            mbackground.setBackgroundColor(R.color.black);
            mimageview.setImageResource(R.drawable.notok);
            //   mimageview.setBackground(colorDrawable2);
        }
        else if(intbmi<24.9 && intbmi>18.5 )
        {
            mbmicategory.setText("Normal");
            mimageview.setImageResource(R.drawable.notok);
            // mbackground.setBackgroundColor(Color.YELLOW);
            //  mimageview.setBackground(colorDrawable2);
        }
        else if(intbmi <29.9 && intbmi>25)
        {
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(R.color.black);
            mimageview.setImageResource(R.drawable.notok);
            //mimageview.setBackground(colorDrawable2);
        }
        else if(intbmi<34.9 && intbmi>30)
        {
            mbmicategory.setText("Obese Class I");
            mbackground.setBackgroundColor(R.color.black);
            mimageview.setImageResource(R.drawable.notok);
            //  mimageview.setBackground(colorDrawable2);
        }
        else
        {
            mbmicategory.setText("Obese Class II");
            mbackground.setBackgroundColor(R.color.black);
            mimageview.setImageResource(R.drawable.notok);
            //  mimageview.setBackground(colorDrawable2);
        }

        //magedisplay.setText("your age is"+intent.getStringExtra("age"));
        //mheightdisplay.setText("Your Height is "+intent.getStringExtra("height"));
        //mweightdisplay.setText("Your Weight is "+intent.getStringExtra("weight"));
        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);

        mrecalculatebmi=findViewById(R.id.recalculatebmi);
        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bmicalc.this,bmi.class);
                startActivity(intent);
                finish();
            }
        });
    }
}