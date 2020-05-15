package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sglresult extends AppCompatActivity {
   TextView plyresname_tv;
   TextView respoint1_tv;
   TextView with1_tv;
   TextView status1_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sglresult);
        plyresname_tv =(TextView) findViewById(R.id.plyresname_tv) ;
        respoint1_tv =(TextView) findViewById(R.id.respoint1_tv) ;
        with1_tv = (TextView) findViewById(R.id.with1_tv) ;
        status1_tv =(TextView) findViewById(R.id.with1_tv) ;

        Intent intent = getIntent() ;
        String name =intent.getStringExtra("name") ;
        int points  = intent.getIntExtra("points", 0);


        plyresname_tv.setText(name);
        respoint1_tv.setText(Integer.toString(points)+" POINTS");

    }
}
