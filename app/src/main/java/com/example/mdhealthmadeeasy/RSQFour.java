package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RSQFour extends AppCompatActivity {

    public Spinner spinnerA, spinnerB;
    public Button btnSubmit;
    public final String correctAnsA = "Obesity";
    public final String correctAnsB = "Fiber";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_s_q_four);

        spinnerA = findViewById(R.id.ch4_rq_1);
        spinnerB = findViewById(R.id.ch4_rq_2);
        btnSubmit = findViewById(R.id.ch4_RQSubmitBtn);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctAnsA.equals(String.valueOf(spinnerA.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerA.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerA.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAnsB.equals(String.valueOf(spinnerB.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerB.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerB.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
