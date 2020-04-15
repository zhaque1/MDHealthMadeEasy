package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MatchingGame extends AppCompatActivity {

    public Spinner spinner1, spinner2, spinner3;
    public Spinner spinner4, spinner5, spinner6;
    public Spinner spinner7, spinner8;
    public Button btnSubmit;
    public final String correctAns1 = "Appointment";
    public final String correctAns2 = "Fever";
    public final String correctAns3 = "Fiber";
    public final String correctAns4 = "Sodium";
    public final String correctAns5 = "Headache";
    public final String correctAns6 = "Pharmacy";
    public final String correctAns7 = "Health History";
    public final String correctAns8 = "Prescription";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_game);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);
        spinner8 = findViewById(R.id.spinner8);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tada);
        btnSubmit = findViewById(R.id.submitMG_btn);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (correctAns1.equals(String.valueOf(spinner1.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner1.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), spinner1.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns2.equals(String.valueOf(spinner2.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner2.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner2.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns3.equals(String.valueOf(spinner3.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner3.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner3.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns4.equals(String.valueOf(spinner4.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner4.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner4.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns5.equals(String.valueOf(spinner5.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner5.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner5.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns6.equals(String.valueOf(spinner6.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner6.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner6.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }
                if (correctAns7.equals(String.valueOf(spinner7.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner7.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner7.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }

                if (correctAns8.equals(String.valueOf(spinner8.getSelectedItem()))){
                    Toast.makeText(getApplicationContext(), spinner8.getSelectedItem() + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), spinner8.getSelectedItem() + " TRY AGAIN",
                            Toast.LENGTH_SHORT).show();

                }


                mp.start();
            }
        });


    }
}
