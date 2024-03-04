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

public class cold_treatment extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_treatment);
        // FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        DatabaseReference databaseRefernce = FirebaseDatabase.getInstance().getReference("datausers").child("cold");
        // Get a reference to the "datausers" node in the database
        //mDatabase = FirebaseDatabase.getInstance().getReference().child("datausers");
        txt = findViewById(R.id.txt);
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

                    txt.setText(dataText);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("FirebaseData", "Error: " + error.getMessage());
            }
        });
    }
}
