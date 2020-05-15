package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class dual extends AppCompatActivity {


    ImageButton rock1_ib;
    ImageButton paper1_ib;
    ImageButton scissors1_ib ;
    ImageButton rock2_ib;
    ImageButton paper2_ib;
    ImageButton scissors2_ib ;

    TextView dualscore1_tv;
    TextView player1_tv;
    TextView sglrounds_tv;

    TextView dualscore2_tv;
    TextView player2_tv;



    int plyscore1 =0 ;
    int plyscore2  =0;
    String name1,name2;
    int limit ;
    int round=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dual) ;




                rock1_ib=(ImageButton) findViewById(R.id.rock1_ib) ;
                 paper1_ib=(ImageButton) findViewById(R.id.paper1_ib) ;
                 scissors1_ib=(ImageButton) findViewById(R.id.scissors1_ib) ;
                 rock2_ib=(ImageButton) findViewById(R.id.rock2_ib) ;
                 paper2_ib=(ImageButton) findViewById(R.id.paper2_ib) ;
                 scissors2_ib=(ImageButton) findViewById(R.id.scissors2_ib) ;



            dualscore1_tv=(TextView) findViewById(R.id.dualscore1_tv);
            dualscore2_tv=(TextView) findViewById(R.id.dualscore2_tv);
            player1_tv=(TextView) findViewById(R.id.player1_tv);
            player2_tv=(TextView) findViewById(R.id.player2_tv);
            sglrounds_tv=(TextView) findViewById(R.id.sglrounds_tv) ;


          paper2_ib.setVisibility(View.INVISIBLE);
          rock2_ib.setVisibility(View.INVISIBLE);
          scissors2_ib.setVisibility(View.INVISIBLE);
           dualscore2_tv.setVisibility(View.INVISIBLE);
            player2_tv.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        name1 = intent.getStringExtra("Name 1");
        name2 = intent.getStringExtra("Name 2");
        limit = intent.getIntExtra("Rounds", 3);
         player1_tv.setText(name1);
         player2_tv.setText(name2);
         sglrounds_tv.setText(Integer.toString(limit)+"ROUNDS");

            rock1_ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sglrounds_tv.setText("ROUND " + Integer.toString(round+1));


                    paper1_ib.setVisibility(View.INVISIBLE);
                    rock1_ib.setVisibility(View.INVISIBLE);
                    scissors1_ib.setVisibility(View.INVISIBLE);


                    paper2_ib.setVisibility(View.VISIBLE);
                    rock2_ib.setVisibility(View.VISIBLE);
                    scissors2_ib.setVisibility(View.VISIBLE);
                    dualscore2_tv.setVisibility(View.VISIBLE);
                    player2_tv.setVisibility(View.VISIBLE);

                    paper2_ib.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                            score2();
                            dualscore2_tv.setText("POINTS :"+ Integer.toString(plyscore2));
                            Toast.makeText(dual.this,"PAPER WRAPS ROCK", Toast.LENGTH_SHORT).show();

                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            paper1_ib.setVisibility(View.VISIBLE);
                            rock1_ib.setVisibility(View.VISIBLE);
                            scissors1_ib.setVisibility(View.VISIBLE);
                            round_check();
                            if(round==limit)
                            {   paper1_ib.setVisibility(View.INVISIBLE);
                                rock1_ib.setVisibility(View.INVISIBLE);
                                scissors1_ib.setVisibility(View.INVISIBLE);
                                paper2_ib.setVisibility(View.INVISIBLE);
                                rock2_ib.setVisibility(View.INVISIBLE);
                                scissors2_ib.setVisibility(View.INVISIBLE);

                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);
                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);

                                Intent intent2 = new Intent(dual.this, dualresult.class);
                                intent2.putExtra("name1", name1);
                                intent2.putExtra("points1", plyscore1);
                                intent2.putExtra("name2", name2);
                                intent2.putExtra("points2", plyscore2);

                                startActivity(intent2);
                            }

                        }
                    });

                    rock2_ib.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Toast.makeText(dual.this, "DRAW", Toast.LENGTH_SHORT).show();
                            dualscore1_tv.setText("POINTS :" + Integer.toString(plyscore1));
                            dualscore2_tv.setText("POINTS :" + Integer.toString(plyscore2));
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            paper1_ib.setVisibility(View.VISIBLE);
                            rock1_ib.setVisibility(View.VISIBLE);
                            scissors1_ib.setVisibility(View.VISIBLE);
                            round_check();
                            if(round==limit)
                            {    paper1_ib.setVisibility(View.INVISIBLE);
                                rock1_ib.setVisibility(View.INVISIBLE);
                                scissors1_ib.setVisibility(View.INVISIBLE);
                                paper2_ib.setVisibility(View.INVISIBLE);
                                rock2_ib.setVisibility(View.INVISIBLE);
                                scissors2_ib.setVisibility(View.INVISIBLE);
                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);
                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);

                                Intent intent2 = new Intent(dual.this, dualresult.class);
                                intent2.putExtra("name1", name1);
                                intent2.putExtra("points1", plyscore1);
                                intent2.putExtra("name2", name2);
                                intent2.putExtra("points2", plyscore2);

                                startActivity(intent2);
                            }

                        }
                    });


                    scissors2_ib.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            score1();
                            dualscore1_tv.setText("POINTS :"+ Integer.toString(plyscore1));
                            Toast.makeText(dual.this, "ROCK CRUSHES SCISSORS", Toast.LENGTH_SHORT).show();
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            paper1_ib.setVisibility(View.VISIBLE);
                            rock1_ib.setVisibility(View.VISIBLE);
                            scissors1_ib.setVisibility(View.VISIBLE);
                            round_check();
                            if(round==limit)
                            {    paper1_ib.setVisibility(View.INVISIBLE);
                                rock1_ib.setVisibility(View.INVISIBLE);
                                scissors1_ib.setVisibility(View.INVISIBLE);
                                paper2_ib.setVisibility(View.INVISIBLE);
                                rock2_ib.setVisibility(View.INVISIBLE);
                                scissors2_ib.setVisibility(View.INVISIBLE);
                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);
                                rock2_ib.setEnabled(false);
                                paper2_ib.setEnabled(false);
                                scissors2_ib.setEnabled(false);

                                Intent intent2 = new Intent(dual.this, dualresult.class);
                                intent2.putExtra("name1", name1);
                                intent2.putExtra("points1", plyscore1);
                                intent2.putExtra("name2", name2);
                                intent2.putExtra("points2", plyscore2);

                                startActivity(intent2);
                            }

                        }
                    });
                }
            });

        paper1_ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sglrounds_tv.setText("ROUND "+Integer.toString(round+1));

                paper1_ib.setVisibility(View.INVISIBLE);
                rock1_ib.setVisibility(View.INVISIBLE);
                scissors1_ib.setVisibility(View.INVISIBLE);


                paper2_ib.setVisibility(View.VISIBLE);
                rock2_ib.setVisibility(View.VISIBLE);
                scissors2_ib.setVisibility(View.VISIBLE);
                dualscore2_tv.setVisibility(View.VISIBLE);
                player2_tv.setVisibility(View.VISIBLE);

                paper2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dualscore1_tv.setText("POINTS :" + Integer.toString(plyscore1));
                        dualscore2_tv.setText("POINTS :" + Integer.toString(plyscore2));
                        Toast.makeText(dual.this,"DRAW", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round==limit)
                        {    paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }
                    }
                });

                rock2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        score2();
                        dualscore2_tv.setText("POINTS :"+ Integer.toString(plyscore2));
                        Toast.makeText(dual.this, "PAPER WRAPS ROCK", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round==limit)
                        {    paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }

                    }
                });


                scissors2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        score2();
                        dualscore2_tv.setText("POINTS :"+ Integer.toString(plyscore2));
                        Toast.makeText(dual.this, "SCISSORS CUT PAPER", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round==limit)
                        {   paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }

                    }
                });
            }
        });


        scissors1_ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sglrounds_tv.setText("ROUNDS "+Integer.toString(round+1));

                paper1_ib.setVisibility(View.INVISIBLE);
                rock1_ib.setVisibility(View.INVISIBLE);
                scissors1_ib.setVisibility(View.INVISIBLE);


                paper2_ib.setVisibility(View.VISIBLE);
                rock2_ib.setVisibility(View.VISIBLE);
                scissors2_ib.setVisibility(View.VISIBLE);
                dualscore2_tv.setVisibility(View.VISIBLE);
                player2_tv.setVisibility(View.VISIBLE);

                paper2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        score1();
                        dualscore1_tv.setText("POINTS :" + Integer.toString(plyscore1));
                        Toast.makeText(dual.this, "SCISSORS CUT PAPER", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round== limit)
                        {     paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }
                    }
                });

                rock2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        score2();
                        dualscore2_tv.setText("POINTS :" + Integer.toString(plyscore2));
                        Toast.makeText(dual.this, "ROCK CRUSHES SCISSORS", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round== limit)
                        {    paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }

                    }
                });


                scissors2_ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dualscore1_tv.setText("POINTS :" + Integer.toString(plyscore1));
                        dualscore2_tv.setText("POINTS :" + Integer.toString(plyscore2));
                        Toast.makeText(dual.this, "ROCK CRUSHES SCISSORS", Toast.LENGTH_SHORT).show();
                        paper2_ib.setVisibility(View.INVISIBLE);
                        rock2_ib.setVisibility(View.INVISIBLE);
                        scissors2_ib.setVisibility(View.INVISIBLE);
                        paper1_ib.setVisibility(View.VISIBLE);
                        rock1_ib.setVisibility(View.VISIBLE);
                        scissors1_ib.setVisibility(View.VISIBLE);
                        round_check();
                        if(round==limit)
                        {   paper1_ib.setVisibility(View.INVISIBLE);
                            rock1_ib.setVisibility(View.INVISIBLE);
                            scissors1_ib.setVisibility(View.INVISIBLE);
                            paper2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setVisibility(View.INVISIBLE);
                            scissors2_ib.setVisibility(View.INVISIBLE);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);
                            rock2_ib.setEnabled(false);
                            paper2_ib.setEnabled(false);
                            scissors2_ib.setEnabled(false);

                            Intent intent2 = new Intent(dual.this, dualresult.class);
                            intent2.putExtra("name1", name1);
                            intent2.putExtra("points1", plyscore1);
                            intent2.putExtra("name2", name2);
                            intent2.putExtra("points2", plyscore2);

                            startActivity(intent2);
                        }
                    }


                });


            }
        });









        }




      public void score1 ()
    {
        plyscore1++ ;
    }

    public void score2 ()
    {
        plyscore2++  ;
    }
    public void round_check ()
    {
        round++;
    }
}