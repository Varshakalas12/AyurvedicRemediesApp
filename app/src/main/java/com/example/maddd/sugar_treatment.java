package com.example.maddd;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class sugar_treatment extends AppCompatActivity {

 TextView txt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_treatment);
        DatabaseReference databaseRefernce = FirebaseDatabase.getInstance().getReference("datausers").child("Sugar");
        // Get a reference to the "datausers" node in the database
        //mDatabase = FirebaseDatabase.getInstance().getReference().child("datausers");
        txt8= findViewById(R.id.txt8);
        // Retrieve data
        databaseRefernce.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                String suggestion = dataSnapshot.child("SUGGESTION").getValue(String.class);
                String symptoms = dataSnapshot.child("SYMPTOMS").getValue(String.class);
                String treatment = dataSnapshot.child("TREATMENT").getValue(String.class);


                String dataText =
                        "SYMPTOMS: " + symptoms + "\n\n\n"
                                +   "TREATMENT: " + treatment+"\n\n\n"
                                +"SUGGESTION: " + suggestion + "\n\n\n";

                txt8.setText(dataText);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("FirebaseData", "Error: " + error.getMessage());
            }
        });


    }
}