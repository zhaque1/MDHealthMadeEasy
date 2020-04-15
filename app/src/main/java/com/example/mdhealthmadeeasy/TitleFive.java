package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_five);

        // BTN to go to chapter 1's Read/Speaking Ques
        Button chapter1Btn = findViewById(R.id.chapter1RSQBtn);
        chapter1Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("RSQ: Chapter One Button Clicked");
                Intent toChapter1RSQ = new Intent(getApplicationContext(), RSQOne.class);
                startActivity(toChapter1RSQ);

            }
        });

        // BTN to go to chapter 2's  Read/Speaking Ques
        Button chapter2Btn = findViewById(R.id.chapter2RSQBtn);
        chapter2Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("RSQ: Chapter Two Button Clicked");
                Intent toChapter2RSQ = new Intent(getApplicationContext(), RSQTwo.class);
                startActivity(toChapter2RSQ);

            }
        });

        // BTN to go to chapter 3's  Read/Speaking Ques
        Button chapter3Btn = findViewById(R.id.chapter3RSQBtn);
        chapter3Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("RSQ: Chapter Three Button Clicked");
                Intent toChapter3RSQ = new Intent(getApplicationContext(), RSQThree.class);
                startActivity(toChapter3RSQ);

            }
        });

        // BTN to go to chapter 4's  Read/Speaking Ques
        Button chapter4Btn = findViewById(R.id.chapter4RSQBtn);
        chapter4Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("RSQ: Chapter Four Button Clicked");
                Intent toChapter4RSQ = new Intent(getApplicationContext(), RSQFour.class);
                startActivity(toChapter4RSQ);

            }
        });


    }
}
