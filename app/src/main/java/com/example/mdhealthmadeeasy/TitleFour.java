package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_four);

        // BTN to go to chapter 1's Pic story and Read Ques
        Button chapter1Btn = findViewById(R.id.Chapter1PSbtn);
        chapter1Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("PS: Chapter One Button Clicked");
                Intent toChapter1PicStory = new Intent(getApplicationContext(), PicStoryOne.class);
                startActivity(toChapter1PicStory);

            }
        });

        // BTN to go to chapter 2's Pic story and Read Ques
        Button chapter2Btn = findViewById(R.id.Chapter2PSbtn);
        chapter2Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("PS: Chapter Two Button Clicked");
                Intent toChapter2PicStory = new Intent(getApplicationContext(), PicStoryTwo.class);
                startActivity(toChapter2PicStory);

            }
        });

        // BTN to go to chapter 3's Pic story and Read Ques
        Button chapter3Btn = findViewById(R.id.Chapter3PSbtn);
        chapter3Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("PS: Chapter Three Button Clicked");
                Intent toChapter3PicStory = new Intent(getApplicationContext(), PicStoryThree.class);
                startActivity(toChapter3PicStory);

            }
        });

        // BTN to go to chapter 4's Pic story and Read Ques
        Button chapter4Btn = findViewById(R.id.Chapter4PSbtn);
        chapter4Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("PS: Chapter Four Button Clicked");
                Intent toChapter4PicStory = new Intent(getApplicationContext(), PicStoryFour.class);
                startActivity(toChapter4PicStory);

            }
        });

        // BTN to go to chapter 5's Pic story and Read Ques
        Button chapter5Btn = findViewById(R.id.Chapter5PSbtn);
        chapter5Btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("PS: Chapter Five Button Clicked");
                Intent toChapter5PicStory = new Intent(getApplicationContext(), PicStoryFive.class);
                startActivity(toChapter5PicStory);

            }
        });


    }
}
