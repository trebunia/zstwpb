package com.zstwpb.faultmapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String LOGIN = "com.zstwpb.faultmapp.LOGIN";
    public static final String PASSWORD = "com.zstwpb.faultmapp.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void singIn(View view){
        EditText login_field = (EditText) findViewById(R.id.editText);
        String login = login_field.getText().toString();
        EditText password_field = (EditText) findViewById(R.id.editText2);
        String password = password_field.getText().toString();
        if (login.equals("user") && password.equals("user")) {
            Intent intent = new Intent(this, MenuActivity.class);
            intent.putExtra(LOGIN, login);
            intent.putExtra(PASSWORD, password);
            startActivity(intent);
        }
        else{
            Context context = getApplicationContext();
            CharSequence text = "Login failed!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, -220);
            toast.show();
        }
    }
}
