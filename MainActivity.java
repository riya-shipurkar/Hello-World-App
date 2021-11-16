package com.riya.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private String Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Clicking the button
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.blue));
            }
        });
        // Background button
        findViewById(R.id.backgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // change the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        // Text changing button
        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Hello from Riya!");
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));

                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_pink));
            }
        });

        findViewById(R.id.create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (enteredText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("Enter something :)");
                } else
                    {
                    ((TextView) findViewById(R.id.text)).setText(enteredText);
                    }
            }
        });
    }
}