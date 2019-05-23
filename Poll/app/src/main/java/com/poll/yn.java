package com.poll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class yn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yn);

        Button y = (Button)findViewById(R.id.y);
        Button n = (Button) findViewById(R.id.n);
        final EditText tv =(EditText) findViewById(R.id.tv);




        final DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();

        Globals g = (Globals)getApplication();
        String ques = g.getData2();

        tv.setText(ques);
        tv.setEnabled(false);





        y.setOnClickListener(new View.OnClickListener() {
            variables x = new variables();
            int ydata = x.getyc();

            public void onClick(View v) {
                ydata++;
                x.setname("count");
                x.setyc(ydata);
                rootRef.child("count").setValue(x);

                Intent yr= new Intent(yn.this,ynresult.class);
                startActivity(yr);

            }


        });

        n.setOnClickListener(new View.OnClickListener() {
            variables x = new variables();
            int ndata=x.getnc();

            public void onClick(View v) {
                ndata++;
                x.setname("count");
                x.setnc(ndata);
                rootRef.child("count").setValue(x);
                Intent yr1= new Intent(yn.this,ynresult.class);
                startActivity(yr1);

            }



        });





    }
}
