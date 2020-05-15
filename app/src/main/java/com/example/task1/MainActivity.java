package com.example.task1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.task1.R.id.mltbtn;
import static com.example.task1.R.id.sglbtn;

public class MainActivity extends AppCompatActivity  {
 Button sglbtn;
    Button mltbtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sglbtn = (Button)findViewById(R.id.sglbtn) ;
        mltbtn = (Button)findViewById(R.id.mltbtn);

        sglbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , sglinfo.class) ;
                startActivity( intent);
            }
        });



            mltbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1;
                    intent1 = new Intent(MainActivity.this , dualinfo.class) ;
                    startActivity( intent1);
                }
            })
            ;


    }


}
