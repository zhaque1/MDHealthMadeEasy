package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class TitleThree extends AppCompatActivity {


    public Spinner spinnerA, spinnerB, spinnerC;
    public Spinner spinnerD, spinnerE, spinnerF;
    public Button btnSubmit, goToPartTwoBtn;
    public final String correctAnsA = "A.Head";
    public final String correctAnsB = "B.Shoulder";
    public final String correctAnsC = "C.Back";
    public final String correctAnsD = "D.Arm";
    public final String correctAnsE = "E.Hand";
    public final String correctAnsF = "F.Feet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_three);

        spinnerA = findViewById(R.id.spinnerA);
        spinnerB = findViewById(R.id.spinnerB);
        spinnerC = findViewById(R.id.spinnerC);
        spinnerD = findViewById(R.id.spinnerD);
        spinnerE = findViewById(R.id.spinnerE);
        spinnerF = findViewById(R.id.spinnerF);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tada);

        goToPartTwoBtn = findViewById(R.id.takePartsTwo_btn);
        goToPartTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("go to take parts part 2 Clicked");

                Intent toRoundTwo = new Intent(getApplicationContext(), TakePartsPartTwo.class);
                startActivity(toRoundTwo);
            }
        });

        btnSubmit = findViewById(R.id.takeParts_submitBtn);
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

                if (correctAnsF.equals(String.valueOf(spinnerF.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinnerF.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinnerF.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
