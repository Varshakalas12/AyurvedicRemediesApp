package com.example.maddd;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class loginActivity2 extends AppCompatActivity {
    private Button reg;
    private Button login;
    // private Button button;
    EditText username_var, password_var;
    ProgressDialog progressDialog;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
//        getSupportActionBar().setTitle("LOGIN");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        login = findViewById(R.id.btnLogin);
        username_var = findViewById(R.id.edtemail);        password_var = findViewById(R.id.edtPassword);

        reg = findViewById(R.id.btnRegister);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity2.this, registerActivity2.class);
                startActivity(intent);
                //finish();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username_var.getText().toString();
                String password = password_var.getText().toString();
                progressDialog = new ProgressDialog(loginActivity2.this);
                progressDialog.setCancelable(false);
                progressDialog.setMessage("Logging in...");
                progressDialog.show();

                if (!username.isEmpty()) {
                    username_var.setError((null));

                    if (!password.isEmpty()) {
                        password_var.setError(null);
                        final String username_data = username_var.getText().toString();
                        final String password_data = password_var.getText().toString();

                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        DatabaseReference databaseReference = firebaseDatabase.getReference("datauser");
                        Query check_email = databaseReference.orderByChild("username").equalTo(username_data);
                        check_email.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()) {

                                    username_var.setError(null);
                                    String passcheck = snapshot.child(username_data).child("password").getValue(String.class);
                                    if (passcheck.equals(password_data)) {

                                        password_var.setError(null);

                                        if (progressDialog.isShowing())
                                            progressDialog.dismiss();
                                        //Toast.makeText(loginActivity2.this, "Log In successfull", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(loginActivity2.this, searchoption.class);

                                        startActivity(intent);
                                        //finish();
                                    } else {
                                        password_var.setError("Wrong Password");
                                        progressDialog.dismiss();
                                    }
                                } else {
                                    username_var.setError("username Does not exists");
                                    progressDialog.dismiss();
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    } else {
                        password_var.setError("Please enter password");
                        progressDialog.dismiss();
                    }

                } else {
                    username_var.setError("Please enter username");
                    progressDialog.dismiss();
                }

            }
        });


    }


}