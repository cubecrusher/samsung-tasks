package com.stanleytin.efsf;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView text, res;
    Button sum;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.loginbutton);
        text = findViewById(R.id.title);
        ed1 = findViewById(R.id.usernamebox);
        ed2 = findViewById(R.id.passwordbox);
        res = findViewById(R.id.status);
        sum.setOnClickListener(this);
    }

    public void onClick(View v){
        String goodrestext = "Correct password";
        String badrestext = "Wrong password";
        String goodusername = "GabeNewell";
        String goodpassword = "HalfLife3";
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        if (t1.equals(goodusername)) {
            if (t2.equals(goodpassword)) {
                res.setTextColor(Color.GREEN);
                res.setText(goodrestext);
                ed1.setText("");
                ed2.setText("");
            }
        } else {
            res.setText(badrestext);
            res.setTextColor(Color.RED);
            ed1.setText("");
            ed2.setText("");
        }
    }
}