package com.poll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText Q = (EditText)findViewById(R.id.Q);
        Globals a = (Globals)getApplication();
        a.setData2(Q.getText().toString());


        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Globals a = (Globals)getApplication();
                a.setData2(Q.getText().toString());

                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);

            }
        });

    }
}
