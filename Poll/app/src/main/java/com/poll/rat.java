package com.poll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class rat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rat);

        SmileRating smileRating = (SmileRating) findViewById(R.id.sm);
        final EditText Ques = (EditText)findViewById(R.id.Q);

        Globals a = (Globals)getApplication();
        Ques.setText(a.getData2());
        Ques.setEnabled(false);



        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselecetd) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(rat.this,"Bad",Toast.LENGTH_LONG).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(rat.this,"Good",Toast.LENGTH_LONG).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(rat.this,"Great",Toast.LENGTH_LONG).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(rat.this,"Okay",Toast.LENGTH_LONG).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(rat.this,"Terrible",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });


        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(rat.this,"Selected Rating is"+level,Toast.LENGTH_LONG).show();

                Intent i = new Intent(rat.this,Home.class);
                startActivity(i);



            }
        });

    }
}
