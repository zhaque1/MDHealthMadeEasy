package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class TakePartsPartTwo extends AppCompatActivity {

    public Spinner spinnerA, spinnerB, spinnerC;
    public Spinner spinnerD, spinnerE;
    public Button btnSubmit;
    public final String correctAnsA = "A.Medication Name";
    public final String correctAnsB = "B.Directions";
    public final String correctAnsC = "C.Patient";
    public final String correctAnsD = "D.Quantity";
    public final String correctAnsE = "E.Refill Count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_parts_part_two);

        spinnerA = findViewById(R.id.spinnerA);
        spinnerB = findViewById(R.id.spinnerB);
        spinnerC = findViewById(R.id.spinnerC);
        spinnerD = findViewById(R.id.spinnerD);
        spinnerE = findViewById(R.id.spinnerE);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tada);

        btnSubmit = findViewById(R.id.takeParts_partTwo_submitBtn);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

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

                if (correctAnsE.equals(String.valueOf(spinnerE.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerE.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerE.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }


            }
        });

    }
}
