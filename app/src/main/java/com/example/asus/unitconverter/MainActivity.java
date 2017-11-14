package com.example.asus.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tmpImg = (ImageView) findViewById(R.id.tmp_img);
        ImageView lengthImg = (ImageView) findViewById(R.id.length_img);
        ImageView forceImg = (ImageView) findViewById(R.id.force_img);
        ImageView speedImg = (ImageView) findViewById(R.id.speed_img);
        ImageView weightImg = (ImageView) findViewById(R.id.weight_img);

        tmpImg.setOnClickListener(this);
        lengthImg.setOnClickListener(this);
        forceImg.setOnClickListener(this);
        speedImg.setOnClickListener(this);
        weightImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tmp_img:
                Intent intent1 = new Intent(getApplicationContext(), Temperature.class);
                startActivity(intent1);
                break;
            case R.id.length_img:
                Intent intent2 = new Intent(getApplicationContext(), Length.class);
                startActivity(intent2);
                break;
            case R.id.force_img:
                Intent intent3 = new Intent(getApplicationContext(), Force.class);
                startActivity(intent3);
                break;
            case R.id.speed_img:
                Intent intent4 = new Intent(getApplicationContext(), Speed.class);
                startActivity(intent4);
                break;
            case R.id.weight_img:
                Intent intent5 = new Intent(getApplicationContext(), Weight.class);
                startActivity(intent5);
                break;
        }
    }
}
