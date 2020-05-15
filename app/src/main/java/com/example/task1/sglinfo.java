package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sglinfo extends AppCompatActivity {

   Button sglinfobtn;
   EditText sglname_tv;
   EditText sglrounds_tv;
   TextView sgl_tv;
   String name1;
   int round1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sglinfo);

        sgl_tv=(TextView) findViewById(R.id.sgl_tv);
        sglname_tv=(EditText) findViewById(R.id.sglname_tv);
        sglrounds_tv=(EditText) findViewById(R.id.sglrounds_tv);
        sglinfobtn=(Button) findViewById(R.id.sglinfobtn) ;


        sglinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1 = sglname_tv.getText().toString() ;
                round1 = Integer.parseInt(sglrounds_tv.getText().toString());

                Intent intent;
                intent = new Intent(sglinfo.this, single.class);
                intent.putExtra("Name" , name1);
                intent.putExtra("Rounds" , round1) ;
                startActivity(intent) ;
            }
        });


    }
}
