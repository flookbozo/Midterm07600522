package com.example.midterm07600522;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private static final String UserMaster = "bbb";
    private static final String PassMaster = "222";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEdit =findViewById(R.id.user_editText);
                EditText passwordEdit = findViewById(R.id.Password_editText2);

                String inputUser = userEdit.getText().toString();
                String inputPass = passwordEdit.getText().toString();
                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                if(inputUser.equals(UserMaster) && inputPass.equals(PassMaster)){
                    intent.putExtra("userMaster", "bbb");
                    startActivity(intent);
                }
                else{
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Error")
                            .setMessage(R.string.login_fail)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).show();
                }
            }
        });
    }
}
