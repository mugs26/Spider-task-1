package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sglresult2 extends AppCompatActivity {

    TextView plyresname2_tv;
    TextView respoint2_tv;
    TextView with2_tv;
    TextView status2_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sglresult2);
        plyresname2_tv =(TextView) findViewById(R.id.plyresname2_tv) ;
        respoint2_tv =(TextView) findViewById(R.id.respoint2_tv) ;
        with2_tv = (TextView) findViewById(R.id.with2_tv) ;
        status2_tv =(TextView) findViewById(R.id.with2_tv) ;

        Intent intent = getIntent() ;
        String name =intent.getStringExtra("name") ;
        int points  = intent.getIntExtra("points", 0);


        plyresname2_tv.setText(name);
        respoint2_tv.setText(Integer.toString(points)+" POINT");

    }
}
