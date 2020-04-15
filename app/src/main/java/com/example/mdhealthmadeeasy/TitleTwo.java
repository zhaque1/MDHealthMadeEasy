package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TitleTwo extends AppCompatActivity {

    public EditText editText0_2, editText0_3, editText0_4, editText0_5;
    public EditText editText1_1;
    public EditText editText2_1, editText2_3;
    public EditText editText3_1, editText3_2, editText3_4;
    public EditText editText4_1, editText4_2, editText4_4;
    public EditText editText5_1, editText5_2, editText5_4;
    public EditText editText6_1, editText6_2, editText6_4;
    public EditText editText7_2, editText7_4;
    public EditText editText8_2;
    public String word1, word2, word3, word4, word5;
    public Button submitBtn;
    public int correctCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_two);

        correctCount = 0;

        editText0_2 = findViewById(R.id.block0_2);
        editText0_3 = findViewById(R.id.block0_3);
        editText0_4 = findViewById(R.id.block0_4);
        editText0_5 = findViewById(R.id.block0_5);
        editText1_1 = findViewById(R.id.block1_1);
        editText2_1 = findViewById(R.id.block2_1);
        editText2_3 = findViewById(R.id.block2_3);
        editText3_1 = findViewById(R.id.block3_1);
        editText3_2 = findViewById(R.id.block3_2);
        editText3_4 = findViewById(R.id.block3_4);
        editText4_1 = findViewById(R.id.block4_1);
        editText4_2 = findViewById(R.id.block4_2);
        editText4_4 = findViewById(R.id.block4_4);
        editText5_1 = findViewById(R.id.block5_1);
        editText5_2 = findViewById(R.id.block5_2);
        editText5_4 = findViewById(R.id.block5_4);
        editText6_1 = findViewById(R.id.block6_1);
        editText6_2 = findViewById(R.id.block6_2);
        editText6_4 = findViewById(R.id.block6_4);
        editText7_2 = findViewById(R.id.block7_2);
        editText7_4 = findViewById(R.id.block7_4);
        editText8_2 = findViewById(R.id.block8_2);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.tada);

        submitBtn = findViewById(R.id.submitBtn_CW1);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

                word1 = "C" + editText0_2.getText().toString().toUpperCase() + editText0_3.getText().toString().toUpperCase() +
                        editText0_4.getText().toString().toUpperCase() + editText0_5.getText().toString().toUpperCase();

                word2 = "C" + editText1_1.getText().toString().toUpperCase() + editText2_1.getText().toString().toUpperCase() +
                        editText3_1.getText().toString().toUpperCase() + editText4_1.getText().toString().toUpperCase() +
                        editText5_1.getText().toString().toUpperCase() + editText6_1.getText().toString().toUpperCase();

                word3 = "F" + editText2_1.getText().toString().toUpperCase() + "V" +
                        editText2_3.getText().toString().toUpperCase() + "R";

                word4 = "V" + editText3_2.getText().toString().toUpperCase() + editText4_2.getText().toString().toUpperCase() +
                        editText5_2.getText().toString().toUpperCase() + editText6_2.getText().toString().toUpperCase() +
                        editText7_2.getText().toString().toUpperCase() + editText8_2.getText().toString().toUpperCase();

                word5 = "R" + editText3_4.getText().toString().toUpperCase() + editText4_4.getText().toString().toUpperCase() +
                        editText5_4.getText().toString().toUpperCase() + editText6_4.getText().toString().toUpperCase() +
                        editText7_4.getText().toString().toUpperCase();

                if(word1.equals("COPAY")){

                    ++correctCount;
                    Toast.makeText(getApplicationContext(), word1 + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), word1 + " NOT CORRECT! TRY AGAIN!!",
                            Toast.LENGTH_SHORT).show();
                }

                if(word2.equals("CHECKUP")){

                    ++correctCount;
                    Toast.makeText(getApplicationContext(), word2 + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), word2 + " NOT CORRECT! TRY AGAIN!!",
                            Toast.LENGTH_SHORT).show();
                }

                if(word3.equals("FEVER")){

                    ++correctCount;
                    Toast.makeText(getApplicationContext(), word3 + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), word3 + " NOT CORRECT! TRY AGAIN!!",
                            Toast.LENGTH_SHORT).show();
                }

                if(word4.equals("VACCINE")){

                    ++correctCount;
                    Toast.makeText(getApplicationContext(), word4 + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), word4 + " NOT CORRECT! TRY AGAIN!!",
                            Toast.LENGTH_SHORT).show();
                }

                if(word5.equals("RECIPE")){

                    ++correctCount;
                    Toast.makeText(getApplicationContext(), word5 + " CORRECT!!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), word5 + " NOT CORRECT! TRY AGAIN!!",
                            Toast.LENGTH_SHORT).show();
                }

                if(correctCount == 5) {
                    Toast.makeText(getApplicationContext(), " On to the next round !!",
                            Toast.LENGTH_SHORT).show();
                    Intent toTitleTwoRd2 = new Intent(getApplicationContext(), TitleTwoRoundTwo.class);
                    startActivity(toTitleTwoRd2);
                }
            }
        });


    }
}
