package com.stanleytin.efsf;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener{

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        imageView.setOnClickListener(this);
        imageView.setImageResource(R.drawable.first);
    }
        int clicks = 0;

    public void onClick(View v){
        if (clicks%2==0) {
            imageView.setImageResource(R.drawable.second);
        } else {
            imageView.setImageResource(R.drawable.first);
        } clicks++;
    }
}