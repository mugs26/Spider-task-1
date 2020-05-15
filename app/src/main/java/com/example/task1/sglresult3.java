package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sglresult3 extends AppCompatActivity {
    TextView plyresname3_tv;
    TextView respoint3_tv;
    TextView with3_tv;
    TextView status3_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sglresult3);
        plyresname3_tv =(TextView) findViewById(R.id.plyresname3_tv) ;
        respoint3_tv =(TextView) findViewById(R.id.respoint3_tv) ;
        with3_tv = (TextView) findViewById(R.id.with3_tv) ;
        status3_tv =(TextView) findViewById(R.id.with3_tv) ;

        Intent intent = getIntent() ;
        String name =intent.getStringExtra("name") ;
        int points  = intent.getIntExtra("points", 0);


        plyresname3_tv.setText(name);
        respoint3_tv.setText(Integer.toString(points)+" POINTS");
    }
}
