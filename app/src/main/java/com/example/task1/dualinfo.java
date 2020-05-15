package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class dualinfo extends AppCompatActivity {


    EditText dualply1name_ed;
    EditText dualply2name_ed;
    EditText dualround_tv ;

    TextView dualply1_tv;
    TextView dualply2_tv ;
    TextView dual_tv;

    Button dualbtn;

    String name1,name2;
    int round1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualinfo);

        dualply1_tv=(TextView) findViewById(R.id.dualply1_tv);
        dualply2_tv=(TextView) findViewById(R.id.dualply2_tv);
        dual_tv=(TextView) findViewById(R.id.dual_tv);

        dualply1name_ed=(EditText) findViewById(R.id.dualply1name_ed) ;
        dualply2name_ed=(EditText) findViewById(R.id.dualply2name_ed) ;
        dualround_tv=(EditText) findViewById(R.id.dualround_tv) ;

        dualbtn=(Button)findViewById(R.id.dualbtn) ;

        dualbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name1 = dualply1name_ed.getText().toString() ;
                name2 = dualply2name_ed.getText().toString() ;
                round1 = Integer.parseInt(dualround_tv.getText().toString());

                Intent intent;
                intent = new Intent(dualinfo.this, dual.class);
                intent.putExtra("Name 1" , name1);
                intent.putExtra("Rounds" , round1) ;
                intent.putExtra("Name 2" , name2);

                startActivity(intent) ;

            }
        });



    }
}
