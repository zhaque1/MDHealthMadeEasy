package com.example.mdhealthmadeeasy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);

         final EditText email_id = findViewById(R.id.email_login);
         final EditText password = findViewById(R.id.password_input);


        Button buttonOne = findViewById(R.id.loginBtn);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                System.out.println(email_id.getText());
                System.out.println(password.getText());

                if(password.getText().length() >= 8){

                    Intent activity2Intent = new Intent(getApplicationContext(), Table_Of_Contents.class);
                    startActivity(activity2Intent);
                }

                else {
                    Toast.makeText(getApplicationContext(), "Password too short, must be at least 8 chars",
                            Toast.LENGTH_SHORT).show();
                    password.setBackgroundColor(Color.RED);
                }

            }
        });

    }

}
