package com.example.maddd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registerActivity2 extends AppCompatActivity {
   private Button regbtn;
   private EditText username,email,password;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
//        getSupportActionBar().setTitle("REGISTRATION");
           regbtn=findViewById(R.id.regbtn);
           username=findViewById(R.id.username);
           email=findViewById(R.id.email);
           password=findViewById(R.id.password);

           regbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String username1=username.getText().toString();
                   String email1=email.getText().toString();
                   String password1=password.getText().toString();
                   if(!username1.isEmpty()){
                       username.setError((null));
                       if(!email1.isEmpty()){
                           email.setError(null);
                           if(!password1.isEmpty())
                           {
                               password.setError(null);
                               firebaseDatabase=FirebaseDatabase.getInstance();
                               reference=firebaseDatabase.getReference("datauser");
                               String username_s=username.getText().toString();
                               String email_s=email.getText().toString();
                               String password_s=password.getText().toString();

                               storingdata storingdatass=new storingdata(username_s,email_s,password_s);
                               reference.child(username_s).setValue(storingdatass);
                               Toast.makeText(registerActivity2.this, "Successfull", Toast.LENGTH_SHORT).show();
                               Intent intent =new Intent(registerActivity2.this,loginActivity2.class);

                               startActivity(intent);
                               //finish();
                           }
                           else
                           {
                               password.setError("Please enter password");
                           }
                       }
                       else
                       {
                           email.setError("Please enter Email");
                       }
                   }
                   else
                   {
                       username.setError("Please Enter the name");
                   }
               }

           });
    }
    }