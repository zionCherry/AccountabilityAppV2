package com.example.androidappv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_profile_Page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// creates the next state
        setContentView(R.layout.activity_user_profile_page); // actually changes what is viewed to the resource page state

        //this section handles connecting the user profile to the home page
        Button btnHome = findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
            private void openHomePage()
            {
                Intent intent = new Intent(user_profile_Page.this, MainActivity.class);
                startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });


    }
}
