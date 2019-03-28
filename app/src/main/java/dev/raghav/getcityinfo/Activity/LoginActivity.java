package dev.raghav.getcityinfo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import dev.raghav.getcityinfo.MainActivity;
import dev.raghav.getcityinfo.R;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        btn_login=findViewById(R.id.btn_login);


         btn_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                 startActivity(mainIntent);
                 // finish();
             }
         });

    }
}
