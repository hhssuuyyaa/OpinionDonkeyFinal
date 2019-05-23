package com.poll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class ynresult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ynresult);
        final DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();



        final ProgressBar pg = (ProgressBar)findViewById(R.id.progressBar);
        EditText q = (EditText) findViewById(R.id.q);
        final TextView da = (TextView) findViewById(R.id.da);
        Globals a = (Globals)getApplication();




        rootRef.addValueEventListener(new ValueEventListener() {
            int y,z,total,percent;
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    variables res = postSnapshot.getValue(variables.class);
                    y = res.getyc();
                    z= res.getnc();

                    total =y+z;
                    percent = (y/total)*100;
                    pg.setProgress(percent);
                    da.setText(percent +"percent");


                }
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Toast.makeText(ynresult.this,"ERROR",Toast.LENGTH_LONG).show();
            }
        });


        q.setText(a.getData2());
        q.setEnabled(false);



    }
    @Override
    public void onBackPressed(){

        Intent i = new Intent(ynresult.this,Home.class);
        startActivity(i);
    }


}
