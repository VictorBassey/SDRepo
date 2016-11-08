package com.example.victor.logindatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Victor on 11/4/2016.
 */

public class Display extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");
        TextView tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvUsername.setText(username);
    }
}
