package com.example.androidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityHelloUserName extends AppCompatActivity {
    TextView tv;
    Button b;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_username);
        tv=(TextView)findViewById(R.id.textview);
        b=(Button)findViewById(R.id.button);
        et=(EditText)findViewById(R.id.edittext);
    }
    public void onClick(View view){
        String st=et.getText().toString();
        tv.setText("Hello "+st);
    }
}