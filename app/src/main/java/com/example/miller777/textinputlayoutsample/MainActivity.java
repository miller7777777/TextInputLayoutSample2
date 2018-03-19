package com.example.miller777.textinputlayoutsample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextInputLayout layout;
    EditText etSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (TextInputLayout) findViewById(R.id.textInputLayout);
        etSender = (EditText) findViewById(R.id.editTextName);


    }
}
