package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class single extends AppCompatActivity {
    Button rockbtn;
    Button paperbtn;
    Button scissorsbtn;

    TextView plyscore_tv;
    TextView cmpscore_tv;
    TextView cmp_tv;
    TextView ply_tv;
    TextView sglrounds_tv ;

    ImageView ply_iv;
    ImageView cmp_iv;

    int humanscore, cmpscore = 0;
    int limit ;
    int rounds=0;
    String name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);


        rockbtn = (Button) findViewById(R.id.rockbtn);
        paperbtn = (Button) findViewById(R.id.paperbtn);
        scissorsbtn = (Button) findViewById(R.id.scissorsbtn);

        plyscore_tv = (TextView) findViewById(R.id.plyscore_tv);
        cmpscore_tv = (TextView) findViewById(R.id.cmpscore_tv);
        cmp_tv = (TextView) findViewById(R.id.cmp_tv);
        ply_tv = (TextView) findViewById(R.id.ply_tv);
        sglrounds_tv = (TextView) findViewById(R.id.sglrounds_tv);

        ply_iv = (ImageView) findViewById(R.id.ply_iv);
        cmp_iv = (ImageView) findViewById(R.id.cmp_iv);

        Intent intent = getIntent();
         name = intent.getStringExtra("Name");
        limit = intent.getIntExtra("Rounds", 3);
        ply_tv.setText(name);
        sglrounds_tv.setText( Integer.toString(limit)+"ROUNDS") ;


        rockbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ply_iv.setImageResource(R.drawable.rock);
                String message = play_turn("rock");
                Toast.makeText(single.this,message, Toast.LENGTH_SHORT).show();


                plyscore_tv.setText("POINTS " + Integer.toString(humanscore));
                cmpscore_tv.setText("SCORE " + Integer.toString(cmpscore));
                sglrounds_tv.setText("ROUND "+ Integer.toString(rounds)) ;
                if(limit==rounds) {
                    if (humanscore > cmpscore) {
                        rockbtn.setEnabled(false);
                        paperbtn.setEnabled(false);
                        scissorsbtn.setEnabled(false);
                        Intent intent1 = new Intent(single.this, sglresult2.class);
                        intent1.putExtra("name", name);
                        intent1.putExtra("points", humanscore);
                        startActivity(intent1);
                    }

                    if (humanscore < cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent2 = new Intent(single.this, sglresult.class);
                        intent2.putExtra("name", name);
                        intent2.putExtra("points", humanscore);
                        startActivity(intent2);
                    }

                    if (humanscore == cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent3 = new Intent(single.this, sglresult3.class);
                        intent3.putExtra("name", name);
                        intent3.putExtra("points", humanscore);
                        startActivity(intent3);


                    }

                }



                     }
        });

        paperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ply_iv.setImageResource(R.drawable.paper);
                String message = play_turn("paper");
                Toast.makeText(single.this,message, Toast.LENGTH_SHORT).show();

                plyscore_tv.setText("POINTS " + Integer.toString(humanscore));
                cmpscore_tv.setText("SCORE " + Integer.toString(cmpscore));
                sglrounds_tv.setText("ROUND " + Integer.toString(rounds)) ;

                if(limit==rounds) {
                    if (humanscore > cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent1 = new Intent(single.this, sglresult2.class);
                        intent1.putExtra("name", name);
                        intent1.putExtra("points", humanscore);
                        startActivity(intent1);
                    }

                    if (humanscore < cmpscore) {
                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent2 = new Intent(single.this, sglresult.class);
                        intent2.putExtra("name", name);
                        intent2.putExtra("points", humanscore);
                        startActivity(intent2);
                    }

                    if (humanscore == cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent3 = new Intent(single.this, sglresult3.class);
                        intent3.putExtra("name", name);
                        intent3.putExtra("points", humanscore);
                        startActivity(intent3);
                    }

                }

                }


        });

        scissorsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ply_iv.setImageResource(R.drawable.scissors);
                String message = play_turn("scissors");
                Toast.makeText(single.this, message, Toast.LENGTH_SHORT).show();

                plyscore_tv.setText("POINTS " + Integer.toString(humanscore));
                cmpscore_tv.setText("SCORE " + Integer.toString(cmpscore));
                sglrounds_tv.setText("ROUND " + Integer.toString(rounds)) ;

                if(limit==rounds) {
                    if (humanscore > cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent1 = new Intent(single.this, sglresult2.class);
                        intent1.putExtra("name", name);
                        intent1.putExtra("points", humanscore);
                        startActivity(intent1);
                    }

                    if (humanscore < cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent2 = new Intent(single.this, sglresult.class);
                        intent2.putExtra("name", name);
                        intent2.putExtra("points", humanscore);
                        startActivity(intent2);
                    }

                    if (humanscore == cmpscore) {

                            rockbtn.setEnabled(false);
                            paperbtn.setEnabled(false);
                            scissorsbtn.setEnabled(false);
                        Intent intent3 = new Intent(single.this, sglresult3.class);
                        intent3.putExtra("name", name);
                        intent3.putExtra("points", humanscore);
                        startActivity(intent3);
                    }

                }

                }

        });


    }

    public String play_turn(String player_choice) {

        rounds++ ;



                  String computer_choice = "";
        Random r;
        r = new Random();
        int computer_choice_number = r.nextInt(3) + 1;
        if (computer_choice_number == 1)
            computer_choice = "rock";
        if (computer_choice_number == 2)
            computer_choice = "paper";
        if (computer_choice_number == 3)
            computer_choice = "scissors";

        if (computer_choice == "rock") {
            cmp_iv.setImageResource(R.drawable.rock);
        }

        if (computer_choice == "paper") {
            cmp_iv.setImageResource(R.drawable.paper);
        }

        if (computer_choice == "scissors") {
            cmp_iv.setImageResource(R.drawable.scissors);
        }

        if (player_choice == computer_choice) {
            return "DRAW";
        }

        if (player_choice == "rock" && computer_choice == "scissors") {
            humanscore++;
            return "YOU WIN , ROCK CRUSHES SCISSORS";
        } else if (player_choice == "rock" && computer_choice == "paper") {
            cmpscore++;
            return "YOU LOSE, PAPER WRAPS AROUND ROCK";
        } else if (player_choice == "scissors" && computer_choice == "rock") {
            cmpscore++;
            return "YOU LOSE , ROCK CRUSHES SCISSORS";
        } else if (player_choice == "scissors" && computer_choice == "paper") {
            humanscore++;
            return "YOU WIN , SCISSORS CUT PAPER";
        } else if (player_choice == "paper" && computer_choice == "scissors") {
            cmpscore++;
            return "YOU LOSE, PAPER GETS CUT BY SCISSORS";
        } else if (player_choice == "paper" && computer_choice == "rock") {
            humanscore++;
            return "YOU WIN , PAPER WRAPS AROUND ROCK";
        } else return "not sure";


    }



}

