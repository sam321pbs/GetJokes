package com.example.sammengistu.joketellerlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);

        TextView jokeTextView = (TextView)findViewById(R.id.joketeller_joke_textview);
        jokeTextView.setText(getIntent().getStringExtra("JOKE"));
    }

}
