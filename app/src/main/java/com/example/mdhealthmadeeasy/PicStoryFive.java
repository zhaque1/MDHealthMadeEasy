package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PicStoryFive extends AppCompatActivity {

    public RadioGroup question1RG;
    public RadioGroup question2RG;
    public RadioGroup question3RG;

    public RadioButton sel1;
    public RadioButton sel2;
    public RadioButton sel3;

    public Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_story_five);

        question1RG= findViewById(R.id.ch5_question1);
        question2RG= findViewById(R.id.ch5_question2);
        question3RG= findViewById(R.id.ch5_question3);

        submitBtn=(Button)findViewById(R.id.ch5_submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = question1RG.getCheckedRadioButtonId();
                sel1 = (RadioButton) findViewById(selectedId);
                if (selectedId == R.id.ch5_b) {
                    Toast.makeText(getApplicationContext(), sel1.getText() + " CORRECT!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), sel1.getText() + " TRY AGAIN", Toast.LENGTH_SHORT).show();

                int selectedId2 = question2RG.getCheckedRadioButtonId();
                sel2 = (RadioButton) findViewById(selectedId2);
                if (selectedId2 == R.id.ch5_a2) {
                    Toast.makeText(getApplicationContext(), sel2.getText() + " CORRECT!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), sel2.getText() + " TRY AGAIN", Toast.LENGTH_SHORT).show();

                int selectedId3 = question3RG.getCheckedRadioButtonId();
                sel3 = (RadioButton) findViewById(selectedId3);
                if (selectedId3 == R.id.ch5_a3) {
                    Toast.makeText(getApplicationContext(), sel3.getText() + " CORRECT!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), sel3.getText() + " TRY AGAIN", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
