package com.stanleytin.efsf;

import androidx.appcompat.app.AppCompatActivity;
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
        sum = findViewById(R.id.sum);
        text = findViewById(R.id.title);
        ed1 = findViewById(R.id.first);
        ed2 = findViewById(R.id.second);
        ed3 = findViewById(R.id.third);
        res = findViewById(R.id.results);
        sum.setOnClickListener(this);
    }

    public void onClick(View v){
        double a,b,c,x,x1,x2;
        String restext;
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        String t3 = ed3.getText().toString();
        a = Double.parseDouble(t1);
        b = Double.parseDouble(t2);
        c = Double.parseDouble(t3);
        double d = (b * b) - (4.0 * a * c);
        if (d<0.0) {
            restext = "No solutions";
            res.setText(restext);
        }
        if (d==0.0) {
            x = (-b)/(2.0*a);
            restext = Double.toString(x);
            res.setText(restext);
        }
        if (d>0.0) {
            x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            restext = String.format("%s %2d", x1, x2);
            res.setText(restext);
        }
    }
}