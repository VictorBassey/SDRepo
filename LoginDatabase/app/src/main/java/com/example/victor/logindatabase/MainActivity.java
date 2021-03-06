package com.example.victor.logindatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnSignUp = (Button) findViewById(R.id.btnSignUp); // change this to create user

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText a = (EditText)findViewById(R.id.TFusername);
                String str = a.getText().toString();

                EditText b = (EditText)findViewById(R.id.TFpassword);
                String pass = b.getText().toString();

                String password = helper.searchPass(str);

                if(pass.equals(password))
                {
                    Intent i = new Intent(getApplicationContext(), Display.class);
                    i.putExtra("Username", str);
                    startActivity(i);
                }
                else
                {
                    Toast loginToast = Toast.makeText(getApplicationContext(), "The login credentials are incorrect.", Toast.LENGTH_SHORT);
                    loginToast.show();
                }


            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), SignUp.class);
                startActivity(i);
            }
        });

    }



}
