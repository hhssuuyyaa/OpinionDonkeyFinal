package com.opiniondonkey.op;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        final Button signUp = findViewById(R.id.signUp);
        final Button signInBtn = findViewById(R.id.signInBtn);
        final Pair<View, String> p1 = Pair.create((View)signUp, "signUpButton");
        final Pair<View, String> p2 = Pair.create((View)signInBtn, "signInButton");
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                //ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                //        SignInActivity.this, p1, p2);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(SignUpActivity.this, p1, p2);
                startActivity(intent, options.toBundle());
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // TODO: add sign in function on click of signUp
            }
        });
    }

}
