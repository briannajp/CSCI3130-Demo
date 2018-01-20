package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    //initialize button and text boxes
    EditText textInput;
    Button buttonClick;
    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick = findViewById(R.id.buttonClick);
        textInput = findViewById(R.id.editText);
        textOutput = findViewById(R.id.textView);
    }

    public void button_click(View view)
    {
        //swap the inputted text in the edit text field into text view
        textOutput.setText(textInput.getText());
        textInput.setFocusable(false);
    }

}
