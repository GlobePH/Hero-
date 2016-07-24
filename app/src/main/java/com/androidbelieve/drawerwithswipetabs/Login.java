package com.androidbelieve.drawerwithswipetabs;

/**
 * Created by mervin on 7/24/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Login extends Activity{

    EditText username;
    EditText  password;
    Button login;
    //Connection connect;
    //Statement stmt;
    //ResultSet rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.button);

    }


    public void login2(View view) {
        if (username.getText().toString().equals("tags") &&
                password.getText().toString().equals("tags")) {
            Toast.makeText(getApplicationContext(), "Welcome",
                    Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this, MainActivity.class));
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        if (username.getText().toString().equals("tags") &&
                password.getText().toString().equals("tags")) {
            Toast.makeText(getApplicationContext(), "TEMPORARY",
                    Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this, MainActivity.class));
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
        }
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}