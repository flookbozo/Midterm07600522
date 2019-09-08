package com.example.midterm07600522;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String user = intent.getStringExtra("userMaster");
        if(user.equals("bbb")){
            setContentView(R.layout.activity_profile);
            Toast.makeText(
                    ProfileActivity.this,
                    R.string.welcome,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
