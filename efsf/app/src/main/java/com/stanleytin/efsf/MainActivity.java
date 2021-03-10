package com.stanleytin.efsf;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    String goodrestext = "Correct password";
    String badrestext = "Wrong password";
    String Goodusername = "GabeNewell";
    String Goodpassword = "HalfLife3";

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
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        if (t1.equals(Goodusername)) {
            if (t2.equals(Goodpassword)) {
                res.setTextColor(Color.GREEN);
                res.setText(goodrestext);
                ed1.setText("");
                ed2.setText("");
            }
        } else {                                                                       // crash here
            Intent act = new Intent(MainActivity.this, RegActivity.class);
            startActivityForResult(act, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case 1:
                res.setText("");
                Goodusername = data.getStringExtra("loginregister");
                ed1.setText(Goodusername);
                ed2.setText("");
                Goodpassword = data.getStringExtra("passregister");
                break;
        }
    }
}