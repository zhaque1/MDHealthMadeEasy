package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Table_Of_Contents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__of__contents);

        // Title 1
        Button titleOneBtn = findViewById(R.id.titleOneBtn);
        titleOneBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Title One Button Clicked");

                Intent toTitleOne = new Intent(getApplicationContext(), TitleOne.class);
                startActivity(toTitleOne);

            }
        });

        // Title 2
        Button titleTwoBtn = findViewById(R.id.titleTwoBtn);
        titleTwoBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Title Two Button Clicked");

                Intent toTitleTwo = new Intent(getApplicationContext(), TitleTwo.class);
                startActivity(toTitleTwo);

            }
        });

        // Title 3
        Button titleThreeBtn = findViewById(R.id.titleThreeBtn);
        titleThreeBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Title Three Button Clicked");

                Intent toTitleThree = new Intent(getApplicationContext(), TitleThree.class);
                startActivity(toTitleThree);

            }
        });

        // Title 4
        Button titleFourBtn = findViewById(R.id.titleFourBtn);
        titleFourBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Title Four Button Clicked");

                Intent toTitleFour = new Intent(getApplicationContext(), TitleFour.class);
                startActivity(toTitleFour);

            }
        });

        // Title 5
        Button titleFiveBtn = findViewById(R.id.titleFiveBtn);
        titleFiveBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Title Five Button Clicked");

                Intent toTitleFive = new Intent(getApplicationContext(), TitleFive.class);
                startActivity(toTitleFive);

            }
        });


    }
}
