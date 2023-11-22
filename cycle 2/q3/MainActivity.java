package com.example.sjcet.q3c2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebook();
            }
        });
    }

    private void openFacebook() {
        String facebookUrl = "https://www.facebook.com";

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("fb://facewebmodal/f?href=" + facebookUrl));
            startActivity(intent);
        } catch (Exception e) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(facebookUrl));
            startActivity(intent);
        }
    }
}
