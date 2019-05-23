package com.opiniondonkey.op;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        final Button signUpBtn = findViewById(R.id.signUpBtn);
        final Button signIn = findViewById(R.id.signIn);
        final Pair<View, String> p1 = Pair.create((View)signUpBtn, "signUpButton");
        final Pair<View, String> p2 = Pair.create((View)signIn, "signInButton");
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                //ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                //        SignInActivity.this, p1, p2);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(SignInActivity.this, p1, p2);
                startActivity(intent, options.toBundle());
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // TODO: add sign in function on click of signIn
            }
        });
    }

}
