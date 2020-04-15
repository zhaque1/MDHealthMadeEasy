package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RSQOne extends AppCompatActivity {

    public Spinner spinnerA, spinnerB, spinnerC;
    public Spinner spinnerD;
    public Button btnSubmit;
    public final String correctAnsA = "Check up";
    public final String correctAnsB = "Primary Care Center";
    public final String correctAnsC = "Appointment";
    public final String correctAnsD = "Emergency";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_s_q_one);

        spinnerA = findViewById(R.id.ch1_rq_1);
        spinnerB = findViewById(R.id.ch1_rq_2);
        spinnerC = findViewById(R.id.ch1_rq_3);
        spinnerD = findViewById(R.id.ch1_rq_4);

        btnSubmit = findViewById(R.id.ch1_RQSubmitBtn);
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

                if (correctAnsC.equals(String.valueOf(spinnerC.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerC.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerC.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAnsD.equals(String.valueOf(spinnerD.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerD.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerD.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
