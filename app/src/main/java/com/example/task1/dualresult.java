package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class dualresult extends AppCompatActivity {
    TextView dualresult_tv;
    TextView playerwon_tv;
    TextView playerlost_tv;
    TextView winner_tv;
    TextView loser_tv;
    TextView winnerpoints_tv;
    TextView loserpoints_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualresult);
        dualresult_tv =(TextView) findViewById(R.id.dualrsult_tv) ;
        playerwon_tv =(TextView) findViewById(R.id.playerwon_tv) ;
        playerlost_tv = (TextView) findViewById(R.id.playerlost_tv) ;
        winner_tv =(TextView) findViewById(R.id.winner_tv) ;
        loser_tv =(TextView) findViewById(R.id.loser_tv) ;
        winnerpoints_tv =(TextView) findViewById(R.id.winnerpoints_tv) ;
        loserpoints_tv=(TextView) findViewById(R.id.lostpoints_tv) ;

        Intent intent = getIntent() ;
        String name1 =intent.getStringExtra("name1") ;
        int points1  = intent.getIntExtra("points1", 0);
        String name2=intent.getStringExtra("name2") ;
        int points2  = intent.getIntExtra("points2", 0);

        if(points1>points2) {
            playerwon_tv.setText(name1);
            winnerpoints_tv.setText("POINT" + Integer.toString(points1));
            playerlost_tv.setText(name2);
            loserpoints_tv.setText("POINT" + Integer.toString(points2));
        }

        if(points2>points1) {
            playerwon_tv.setText(name2);
            winnerpoints_tv.setText("POINT" + Integer.toString(points2));
            playerlost_tv.setText(name1);
            loserpoints_tv.setText("POINT" + Integer.toString(points1));


        }

        if(points1==points2){
            loser_tv.setText("WINNER");
            playerwon_tv.setText(name2);
            winnerpoints_tv.setText("POINT" + Integer.toString(points2));
            playerlost_tv.setText(name1);
            loserpoints_tv.setText("POINT" + Integer.toString(points1));

        }

    }


}
