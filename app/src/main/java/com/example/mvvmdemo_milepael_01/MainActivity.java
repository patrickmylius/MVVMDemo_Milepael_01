package com.example.mvvmdemo_milepael_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global vars
    Button changeButton, resetButton;
    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Sets Sceneview

        changeButton = (Button)findViewById(R.id.changeButton);//Change button
        editText = (EditText)findViewById(R.id.editText); //EditText, Takes user input
        textView = (TextView)findViewById(R.id.textView); //Textview

        //changeButton on click listener
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString(); //Converts editext to toString
                textView.setText(userInput); //Sets Textview to be editText input


            }
        });
    }
}