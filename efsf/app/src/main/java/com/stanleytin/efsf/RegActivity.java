package com.stanleytin.efsf;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.Math;

public class RegActivity extends AppCompatActivity{

    TextView reg;
    Button sum;
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        reg = findViewById(R.id.reghint);
        ed1 = findViewById(R.id.username);
        ed2 = findViewById(R.id.password);
        sum = findViewById(R.id.register);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String s1 = ed1.getText().toString();
                String s2 = ed2.getText().toString();
                Intent act = new Intent();
                act.putExtra("loginregister", s1);
                act.putExtra("passregister", s2);
                RegActivity.this.setResult(1, act);
                RegActivity.this.finish();
            }
        }
        );
    }
}
