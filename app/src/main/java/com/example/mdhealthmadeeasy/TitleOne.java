package com.example.mdhealthmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;


public class TitleOne extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    // linear layouts for each word
    public LinearLayout ch1_word1, ch1_word2, ch1_word3,ch1_word4, ch1_word5, ch1_word6, ch1_word7,
            ch1_word8, ch1_word9,ch1_word10;
    public LinearLayout ch2_word1, ch2_word2, ch2_word3,ch2_word4, ch2_word5, ch2_word6, ch2_word7;
    public LinearLayout ch3_word1, ch3_word2, ch3_word3,ch3_word4, ch3_word5, ch3_word6, ch3_word7,
            ch3_word8, ch3_word9,ch3_word10,ch3_word11,ch3_word12;
    public LinearLayout ch4_word1, ch4_word2, ch4_word3,ch4_word4, ch4_word5, ch4_word6;

    // image buttons for sound clips
    public ImageButton ch1_word1_sc, ch1_word2_sc, ch1_word3_sc,ch1_word4_sc, ch1_word5_sc, ch1_word6_sc,
            ch1_word7_sc, ch1_word8_sc, ch1_word9_sc,ch1_word10_sc;
    public ImageButton ch2_word1_sc, ch2_word2_sc, ch2_word3_sc,ch2_word4_sc, ch2_word5_sc, ch2_word6_sc,
            ch2_word7_sc;
    public ImageButton ch3_word1_sc, ch3_word2_sc, ch3_word3_sc,ch3_word4_sc, ch3_word5_sc, ch3_word6_sc,
            ch3_word7_sc, ch3_word8_sc, ch3_word9_sc,ch3_word10_sc,ch3_word11_sc,ch3_word12_sc;
    public ImageButton ch4_word1_sc, ch4_word2_sc, ch4_word3_sc,ch4_word4_sc, ch4_word5_sc, ch4_word6_sc;

    // media player objs for sound clips
    public MediaPlayer ch1_word1_sound, ch1_word2_sound, ch1_word3_sound,ch1_word4_sound, ch1_word5_sound,
            ch1_word6_sound, ch1_word7_sound, ch1_word8_sound, ch1_word9_sound,ch1_word10_sound;
    public MediaPlayer ch2_word1_sound, ch2_word2_sound, ch2_word3_sound,ch2_word4_sound, ch2_word5_sound,
            ch2_word6_sound, ch2_word7_sound;
    public MediaPlayer ch3_word1_sound, ch3_word2_sound, ch3_word3_sound,ch3_word4_sound, ch3_word5_sound,
            ch3_word6_sound, ch3_word7_sound, ch3_word8_sound, ch3_word9_sound,ch3_word10_sound,
            ch3_word11_sound,ch3_word12_sound;
    public MediaPlayer ch4_word1_sound, ch4_word2_sound, ch4_word3_sound,ch4_word4_sound,
            ch4_word5_sound, ch4_word6_sound;

    public Button match_game_btn;

    public Spinner filter_optionsSpinner;
    String[] filter_options = { "NONE", "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_one);

        initMembers();

        filter_optionsSpinner = findViewById(R.id.filterSpinner);
        filter_optionsSpinner.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,filter_options);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filter_optionsSpinner.setAdapter(aa);

        // on click listenrs for sound clip btns
        ch1_word1_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word1_sound.start();
            }
        });

        ch1_word2_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word2_sound.start();
            }
        });

        ch1_word3_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word3_sound.start();
            }
        });

        ch1_word4_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word4_sound.start();
            }
        });

        ch1_word5_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word5_sound.start();
            }
        });

        ch1_word6_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word6_sound.start();
            }
        });

        ch1_word7_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word7_sound.start();
            }
        });

        ch1_word8_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word8_sound.start();
            }
        });

        ch1_word9_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word9_sound.start();
            }
        });

        ch1_word10_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1_word10_sound.start();
            }
        });

        ch2_word1_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word1_sound.start();
            }
        });

        ch2_word2_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word2_sound.start();
            }
        });

        ch2_word3_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word3_sound.start();
            }
        });

        ch2_word4_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word4_sound.start();
            }
        });

        ch2_word5_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word5_sound.start();
            }
        });

        ch2_word6_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word6_sound.start();
            }
        });

        ch2_word7_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2_word7_sound.start();
            }
        });

        ch3_word1_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word1_sound.start();
            }
        });

        ch3_word2_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word2_sound.start();
            }
        });

        ch3_word3_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word3_sound.start();
            }
        });

        ch3_word4_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word4_sound.start();
            }
        });

        ch3_word5_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word5_sound.start();
            }
        });

        ch3_word6_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word6_sound.start();
            }
        });

        ch3_word7_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word7_sound.start();
            }
        });

        ch3_word8_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word8_sound.start();
            }
        });

        ch3_word9_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word9_sound.start();
            }
        });

        ch3_word10_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word10_sound.start();
            }
        });

        ch3_word11_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word11_sound.start();
            }
        });

        ch3_word12_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch3_word12_sound.start();
            }
        });

        ch4_word1_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word1_sound.start();
            }
        });

        ch4_word2_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word2_sound.start();
            }
        });

        ch4_word3_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word3_sound.start();
            }
        });

        ch4_word4_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word4_sound.start();
            }
        });

        ch4_word5_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word5_sound.start();
            }
        });

        ch4_word6_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch4_word6_sound.start();
            }
        });

        // onclicklistner for matching game btn
        match_game_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Matching game Button Clicked");
                Intent toMatchingGame = new Intent(getApplicationContext(), MatchingGame.class);
                startActivity(toMatchingGame);
            }
        });
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        //Toast.makeText(getApplicationContext(),filter_options[position] , Toast.LENGTH_LONG).show();

        if(filter_options[position].equals("NONE"))
        {
            ch1_word1.setVisibility(View.VISIBLE);
            ch1_word2.setVisibility(View.VISIBLE);
            ch1_word3.setVisibility(View.VISIBLE);
            ch1_word4.setVisibility(View.VISIBLE);
            ch1_word5.setVisibility(View.VISIBLE);
            ch1_word6.setVisibility(View.VISIBLE);
            ch1_word7.setVisibility(View.VISIBLE);
            ch1_word8.setVisibility(View.VISIBLE);
            ch1_word9.setVisibility(View.VISIBLE);
            ch1_word10.setVisibility(View.VISIBLE);

            ch2_word1.setVisibility(View.VISIBLE);
            ch2_word2.setVisibility(View.VISIBLE);
            ch2_word3.setVisibility(View.VISIBLE);
            ch2_word4.setVisibility(View.VISIBLE);
            ch2_word5.setVisibility(View.VISIBLE);
            ch2_word6.setVisibility(View.VISIBLE);
            ch2_word7.setVisibility(View.VISIBLE);

            ch3_word1.setVisibility(View.VISIBLE);
            ch3_word2.setVisibility(View.VISIBLE);
            ch3_word3.setVisibility(View.VISIBLE);
            ch3_word4.setVisibility(View.VISIBLE);
            ch3_word5.setVisibility(View.VISIBLE);
            ch3_word6.setVisibility(View.VISIBLE);
            ch3_word7.setVisibility(View.VISIBLE);
            ch3_word8.setVisibility(View.VISIBLE);
            ch3_word9.setVisibility(View.VISIBLE);
            ch3_word10.setVisibility(View.VISIBLE);
            ch3_word11.setVisibility(View.VISIBLE);
            ch3_word12.setVisibility(View.VISIBLE);

            ch4_word1.setVisibility(View.VISIBLE);
            ch4_word2.setVisibility(View.VISIBLE);
            ch4_word3.setVisibility(View.VISIBLE);
            ch4_word4.setVisibility(View.VISIBLE);
            ch4_word5.setVisibility(View.VISIBLE);
            ch4_word6.setVisibility(View.VISIBLE);

        }
        else if(filter_options[position].equals("Chapter 1"))
        {
            ch1_word1.setVisibility(View.VISIBLE);
            ch1_word2.setVisibility(View.VISIBLE);
            ch1_word3.setVisibility(View.VISIBLE);
            ch1_word4.setVisibility(View.VISIBLE);
            ch1_word5.setVisibility(View.VISIBLE);
            ch1_word6.setVisibility(View.VISIBLE);
            ch1_word7.setVisibility(View.VISIBLE);
            ch1_word8.setVisibility(View.VISIBLE);
            ch1_word9.setVisibility(View.VISIBLE);
            ch1_word10.setVisibility(View.VISIBLE);

            ch2_word1.setVisibility(View.GONE);
            ch2_word2.setVisibility(View.GONE);
            ch2_word3.setVisibility(View.GONE);
            ch2_word4.setVisibility(View.GONE);
            ch2_word5.setVisibility(View.GONE);
            ch2_word6.setVisibility(View.GONE);
            ch2_word7.setVisibility(View.GONE);

            ch3_word1.setVisibility(View.GONE);
            ch3_word2.setVisibility(View.GONE);
            ch3_word3.setVisibility(View.GONE);
            ch3_word4.setVisibility(View.GONE);
            ch3_word5.setVisibility(View.GONE);
            ch3_word6.setVisibility(View.GONE);
            ch3_word7.setVisibility(View.GONE);
            ch3_word8.setVisibility(View.GONE);
            ch3_word9.setVisibility(View.GONE);
            ch3_word10.setVisibility(View.GONE);
            ch3_word11.setVisibility(View.GONE);
            ch3_word12.setVisibility(View.GONE);

            ch4_word1.setVisibility(View.GONE);
            ch4_word2.setVisibility(View.GONE);
            ch4_word3.setVisibility(View.GONE);
            ch4_word4.setVisibility(View.GONE);
            ch4_word5.setVisibility(View.GONE);
            ch4_word6.setVisibility(View.GONE);
        }
        else if(filter_options[position].equals("Chapter 2"))
        {
            ch1_word1.setVisibility(View.GONE);
            ch1_word2.setVisibility(View.GONE);
            ch1_word3.setVisibility(View.GONE);
            ch1_word4.setVisibility(View.GONE);
            ch1_word5.setVisibility(View.GONE);
            ch1_word6.setVisibility(View.GONE);
            ch1_word7.setVisibility(View.GONE);
            ch1_word8.setVisibility(View.GONE);
            ch1_word9.setVisibility(View.GONE);
            ch1_word10.setVisibility(View.GONE);

            ch2_word1.setVisibility(View.VISIBLE);
            ch2_word2.setVisibility(View.VISIBLE);
            ch2_word3.setVisibility(View.VISIBLE);
            ch2_word4.setVisibility(View.VISIBLE);
            ch2_word5.setVisibility(View.VISIBLE);
            ch2_word6.setVisibility(View.VISIBLE);
            ch2_word7.setVisibility(View.VISIBLE);

            ch3_word1.setVisibility(View.GONE);
            ch3_word2.setVisibility(View.GONE);
            ch3_word3.setVisibility(View.GONE);
            ch3_word4.setVisibility(View.GONE);
            ch3_word5.setVisibility(View.GONE);
            ch3_word6.setVisibility(View.GONE);
            ch3_word7.setVisibility(View.GONE);
            ch3_word8.setVisibility(View.GONE);
            ch3_word9.setVisibility(View.GONE);
            ch3_word10.setVisibility(View.GONE);
            ch3_word11.setVisibility(View.GONE);
            ch3_word12.setVisibility(View.GONE);

            ch4_word1.setVisibility(View.GONE);
            ch4_word2.setVisibility(View.GONE);
            ch4_word3.setVisibility(View.GONE);
            ch4_word4.setVisibility(View.GONE);
            ch4_word5.setVisibility(View.GONE);
            ch4_word6.setVisibility(View.GONE);
        }
        else if(filter_options[position].equals("Chapter 3"))
        {
            ch1_word1.setVisibility(View.GONE);
            ch1_word2.setVisibility(View.GONE);
            ch1_word3.setVisibility(View.GONE);
            ch1_word4.setVisibility(View.GONE);
            ch1_word5.setVisibility(View.GONE);
            ch1_word6.setVisibility(View.GONE);
            ch1_word7.setVisibility(View.GONE);
            ch1_word8.setVisibility(View.GONE);
            ch1_word9.setVisibility(View.GONE);
            ch1_word10.setVisibility(View.GONE);

            ch2_word1.setVisibility(View.GONE);
            ch2_word2.setVisibility(View.GONE);
            ch2_word3.setVisibility(View.GONE);
            ch2_word4.setVisibility(View.GONE);
            ch2_word5.setVisibility(View.GONE);
            ch2_word6.setVisibility(View.GONE);
            ch2_word7.setVisibility(View.GONE);

            ch3_word1.setVisibility(View.VISIBLE);
            ch3_word2.setVisibility(View.VISIBLE);
            ch3_word3.setVisibility(View.VISIBLE);
            ch3_word4.setVisibility(View.VISIBLE);
            ch3_word5.setVisibility(View.VISIBLE);
            ch3_word6.setVisibility(View.VISIBLE);
            ch3_word7.setVisibility(View.VISIBLE);
            ch3_word8.setVisibility(View.VISIBLE);
            ch3_word9.setVisibility(View.VISIBLE);
            ch3_word10.setVisibility(View.VISIBLE);
            ch3_word11.setVisibility(View.VISIBLE);
            ch3_word12.setVisibility(View.VISIBLE);

            ch4_word1.setVisibility(View.GONE);
            ch4_word2.setVisibility(View.GONE);
            ch4_word3.setVisibility(View.GONE);
            ch4_word4.setVisibility(View.GONE);
            ch4_word5.setVisibility(View.GONE);
            ch4_word6.setVisibility(View.GONE);
        }
        else if(filter_options[position].equals("Chapter 4"))
        {
            ch1_word1.setVisibility(View.GONE);
            ch1_word2.setVisibility(View.GONE);
            ch1_word3.setVisibility(View.GONE);
            ch1_word4.setVisibility(View.GONE);
            ch1_word5.setVisibility(View.GONE);
            ch1_word6.setVisibility(View.GONE);
            ch1_word7.setVisibility(View.GONE);
            ch1_word8.setVisibility(View.GONE);
            ch1_word9.setVisibility(View.GONE);
            ch1_word10.setVisibility(View.GONE);

            ch2_word1.setVisibility(View.GONE);
            ch2_word2.setVisibility(View.GONE);
            ch2_word3.setVisibility(View.GONE);
            ch2_word4.setVisibility(View.GONE);
            ch2_word5.setVisibility(View.GONE);
            ch2_word6.setVisibility(View.GONE);
            ch2_word7.setVisibility(View.GONE);

            ch3_word1.setVisibility(View.GONE);
            ch3_word2.setVisibility(View.GONE);
            ch3_word3.setVisibility(View.GONE);
            ch3_word4.setVisibility(View.GONE);
            ch3_word5.setVisibility(View.GONE);
            ch3_word6.setVisibility(View.GONE);
            ch3_word7.setVisibility(View.GONE);
            ch3_word8.setVisibility(View.GONE);
            ch3_word9.setVisibility(View.GONE);
            ch3_word10.setVisibility(View.GONE);
            ch3_word11.setVisibility(View.GONE);
            ch3_word12.setVisibility(View.GONE);

            ch4_word1.setVisibility(View.VISIBLE);
            ch4_word2.setVisibility(View.VISIBLE);
            ch4_word3.setVisibility(View.VISIBLE);
            ch4_word4.setVisibility(View.VISIBLE);
            ch4_word5.setVisibility(View.VISIBLE);
            ch4_word6.setVisibility(View.VISIBLE);
        }


    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void initMembers(){

        match_game_btn = findViewById(R.id.playMatchingGameBtn);

        // chapter 1 words
        ch1_word1 = findViewById(R.id.chapter1_w1);
        ch1_word2 = findViewById(R.id.chapter1_w2);
        ch1_word3 = findViewById(R.id.chapter1_w3);
        ch1_word4 = findViewById(R.id.chapter1_w4);
        ch1_word5 = findViewById(R.id.chapter1_w5);
        ch1_word6 = findViewById(R.id.chapter1_w6);
        ch1_word7 = findViewById(R.id.chapter1_w7);
        ch1_word8 = findViewById(R.id.chapter1_w8);
        ch1_word9 = findViewById(R.id.chapter1_w9);
        ch1_word10 = findViewById(R.id.chapter1_w10);

        ch1_word1_sc = findViewById(R.id.apt_sc_btn);
        ch1_word2_sc = findViewById(R.id.check_up_sc_btn);
        ch1_word3_sc = findViewById(R.id.co_pay_sc_btn);
        ch1_word4_sc = findViewById(R.id.emergency_sc_btn);
        ch1_word5_sc = findViewById(R.id.health_ins_sc_btn);
        ch1_word6_sc = findViewById(R.id.medical_int_sc_btn);
        ch1_word7_sc = findViewById(R.id.pcc_sc_btn);
        ch1_word8_sc = findViewById(R.id.ucc_sc_btn);
        ch1_word9_sc = findViewById(R.id.health_clinic_sc_btn);
        ch1_word10_sc = findViewById(R.id.health_dept_sc_btn);

        ch1_word1_sound = MediaPlayer.create(this, R.raw.appointment);
        ch1_word2_sound = MediaPlayer.create(this, R.raw.checkup);
        ch1_word3_sound = MediaPlayer.create(this, R.raw.copay);
        ch1_word4_sound = MediaPlayer.create(this, R.raw.emergency);
        ch1_word5_sound = MediaPlayer.create(this, R.raw.healthinsurance);
        ch1_word6_sound = MediaPlayer.create(this, R.raw.medint);
        ch1_word7_sound = MediaPlayer.create(this, R.raw.primcarecenter);
        ch1_word8_sound = MediaPlayer.create(this, R.raw.urgentcarecenter);
        ch1_word9_sound = MediaPlayer.create(this, R.raw.healthclinic);
        ch1_word10_sound = MediaPlayer.create(this, R.raw.healthdept);

        // chapter 2 words
        ch2_word1 = findViewById(R.id.chapter2_w1);
        ch2_word2 = findViewById(R.id.chapter2_w2);
        ch2_word3 = findViewById(R.id.chapter2_w3);
        ch2_word4 = findViewById(R.id.chapter2_w4);
        ch2_word5 = findViewById(R.id.chapter2_w5);
        ch2_word6 = findViewById(R.id.chapter2_w6);
        ch2_word7 = findViewById(R.id.chapter2_w7);

        ch2_word1_sc = findViewById(R.id.allergy_sc_btn);
        ch2_word2_sc = findViewById(R.id.fever_sc_btn);
        ch2_word3_sc = findViewById(R.id.headache_sc_btn);
        ch2_word4_sc = findViewById(R.id.health_hist_sc_btn);
        ch2_word5_sc = findViewById(R.id.medicine_sc_btn);
        ch2_word6_sc = findViewById(R.id.sore_throat_sc_btn);
        ch2_word7_sc = findViewById(R.id.symptoms_sc_btn);

        ch2_word1_sound = MediaPlayer.create(this, R.raw.allergy);
        ch2_word2_sound = MediaPlayer.create(this, R.raw.fever);
        ch2_word3_sound = MediaPlayer.create(this, R.raw.headache);
        ch2_word4_sound = MediaPlayer.create(this, R.raw.healthhistory);
        ch2_word5_sound = MediaPlayer.create(this, R.raw.medicine);
        ch2_word6_sound = MediaPlayer.create(this, R.raw.sorethroat);
        ch2_word7_sound = MediaPlayer.create(this, R.raw.symptoms);

        // chapter 3 words
        ch3_word1 = findViewById(R.id.chapter3_w1);
        ch3_word2 = findViewById(R.id.chapter3_w2);
        ch3_word3 = findViewById(R.id.chapter3_w3);
        ch3_word4 = findViewById(R.id.chapter3_w4);
        ch3_word5 = findViewById(R.id.chapter3_w5);
        ch3_word6 = findViewById(R.id.chapter3_w6);
        ch3_word7 = findViewById(R.id.chapter3_w7);
        ch3_word8 = findViewById(R.id.chapter3_w8);
        ch3_word9 = findViewById(R.id.chapter3_w9);
        ch3_word10 = findViewById(R.id.chapter3_w10);
        ch3_word11 = findViewById(R.id.chapter3_w11);
        ch3_word12 = findViewById(R.id.chapter3_w12);

        ch3_word1_sc = findViewById(R.id.generic_sc_btn);
        ch3_word2_sc = findViewById(R.id.label_sc_btn);
        ch3_word3_sc = findViewById(R.id.otc_sc_btn);
        ch3_word4_sc = findViewById(R.id.pharmacy_sc_btn);
        ch3_word5_sc = findViewById(R.id.pharmacist_sc_btn);
        ch3_word6_sc = findViewById(R.id.prescription_sc_btn);
        ch3_word7_sc = findViewById(R.id.tsp_sc_btn);
        ch3_word8_sc = findViewById(R.id.ml_sc_btn);
        ch3_word9_sc = findViewById(R.id.tbsp_sc_btn);
        ch3_word10_sc = findViewById(R.id.vaccine_sc_btn);
        ch3_word11_sc = findViewById(R.id.immunization_sc_btn);
        ch3_word12_sc = findViewById(R.id.side_effect_sc_btn);

        ch3_word1_sound = MediaPlayer.create(this, R.raw.genericsoundclip);
        ch3_word2_sound = MediaPlayer.create(this, R.raw.label);
        ch3_word3_sound = MediaPlayer.create(this, R.raw.overthecounter);
        ch3_word4_sound = MediaPlayer.create(this, R.raw.pharmacysc);
        ch3_word5_sound = MediaPlayer.create(this, R.raw.pharmacist);
        ch3_word6_sound = MediaPlayer.create(this, R.raw.prescription);
        ch3_word7_sound = MediaPlayer.create(this, R.raw.teaspoon);
        ch3_word8_sound = MediaPlayer.create(this, R.raw.mlsc);
        ch3_word9_sound = MediaPlayer.create(this, R.raw.tablespoon);
        ch3_word10_sound = MediaPlayer.create(this, R.raw.vaccine);
        ch3_word11_sound = MediaPlayer.create(this, R.raw.immunization);
        ch3_word12_sound = MediaPlayer.create(this, R.raw.sideeffect);

        // chapter 4 words
        ch4_word1 = findViewById(R.id.chapter4_w1);
        ch4_word2 = findViewById(R.id.chapter4_w2);
        ch4_word3 = findViewById(R.id.chapter4_w3);
        ch4_word4 = findViewById(R.id.chapter4_w4);
        ch4_word5 = findViewById(R.id.chapter4_w5);
        ch4_word6 = findViewById(R.id.chapter4_w6);

        ch4_word1_sc = findViewById(R.id.fiber_sc_btn);
        ch4_word2_sc = findViewById(R.id.nutrient_sc_btn);
        ch4_word3_sc = findViewById(R.id.obesity_sc_btn);
        ch4_word4_sc = findViewById(R.id.recipe_sc_btn);
        ch4_word5_sc = findViewById(R.id.sodium_sc_btn);
        ch4_word6_sc = findViewById(R.id.vitamins_sc_btn);

        ch4_word1_sound = MediaPlayer.create(this, R.raw.fiber);
        ch4_word2_sound = MediaPlayer.create(this, R.raw.nutrient);
        ch4_word3_sound = MediaPlayer.create(this, R.raw.obesity);
        ch4_word4_sound = MediaPlayer.create(this, R.raw.recipe);
        ch4_word5_sound = MediaPlayer.create(this, R.raw.sodium);
        ch4_word6_sound = MediaPlayer.create(this, R.raw.vitamins);

    }

}
