package com.example.maddd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class searchplant extends AppCompatActivity {
    RelativeLayout relativeAloevera;
    RelativeLayout relativeAmla;
    RelativeLayout relativeBashok;
    RelativeLayout relativeBitterleaf;
    RelativeLayout relativeBitterGourd;
    RelativeLayout relativeBrahmi;
    RelativeLayout relativeGarlic;
    RelativeLayout relativeNeem;
    RelativeLayout relativeTulsi;
 RelativeLayout relativetith_begun;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchplant);
        getSupportActionBar().setTitle("HERBAL PLANT");

        relativeAloevera=findViewById(R.id.relativeAloeVera);
        relativeAmla=findViewById(R.id.relativeAmla);
        relativeBashok=findViewById(R.id.relativebashok);
        relativeBitterleaf=findViewById(R.id.relativeBitterLeaf);
        relativeBitterGourd=findViewById(R.id.relativeBitterGourd);
        relativeBrahmi=findViewById(R.id.relativebrahmi);
        relativeGarlic=findViewById(R.id.relativeGarlic);
        relativeNeem=findViewById(R.id.relativeNeem);
        relativeTulsi=findViewById(R.id.relativeTulsi);
        relativetith_begun=findViewById(R.id.relativetith_begun);
        relativeAloevera.setOnClickListener((new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(searchplant.this,AloeVera.class);
            startActivity(intent);
            //finish();
        }
    }));
        relativeAmla.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Amla.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeBashok.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Bashok.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeBitterleaf.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Bitter_leaf.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeBitterGourd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Bitter_Gourd.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeBrahmi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Brahmi.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeGarlic.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Garlic.class);
                startActivity(intent);
                //finish();
            }
        }));
        relativeNeem.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Neem.class);
                startActivity(intent);
               // finish();
            }
        }));
        relativeTulsi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,Tulsi.class);
                startActivity(intent);
               // finish();
            }
        }));
        relativetith_begun.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(searchplant.this,tith_begun.class);
                startActivity(intent);
                //finish();
            }
        }));

    }
}