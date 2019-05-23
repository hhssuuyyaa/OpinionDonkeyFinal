package com.poll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button mc = (Button) findViewById(R.id.button);
        Button yn = (Button) findViewById(R.id.button2);
        Button rat = (Button) findViewById(R.id.button3);


        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mc1 = new Intent(Home.this,mc.class);
                startActivity(mc1);

            }
        });


        yn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yn1 = new Intent(Home.this,yn.class);
                startActivity(yn1);

            }
        });


        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rat1 = new Intent(Home.this,rat.class);
                startActivity(rat1);

            }
        });


    }
}
