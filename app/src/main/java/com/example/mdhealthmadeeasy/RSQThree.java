package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RSQThree extends AppCompatActivity {

    public RadioGroup question1RG;
    public RadioGroup question2RG;
    public RadioButton sel1;
    public RadioButton sel2;
    public Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_s_q_three);

        question1RG = findViewById(R.id.ch3_RQ_question1);
        question2RG = findViewById(R.id.ch3_RQ_question2);
        submitBtn = findViewById(R.id.ch3_RQSubmitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = question1RG.getCheckedRadioButtonId();
                sel1 = (RadioButton) findViewById(selectedId);
                if (selectedId == R.id.ch3_RQ_b) {
                    Toast.makeText(getApplicationContext(), sel1.getText() + " CORRECT!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), sel1.getText() + " TRY AGAIN", Toast.LENGTH_SHORT).show();

                int selectedId2 = question2RG.getCheckedRadioButtonId();
                sel2 = (RadioButton) findViewById(selectedId2);
                if (selectedId2 == R.id.ch3_RQ_2_a) {
                    Toast.makeText(getApplicationContext(), sel2.getText() + " CORRECT!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), sel2.getText() + " TRY AGAIN", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
