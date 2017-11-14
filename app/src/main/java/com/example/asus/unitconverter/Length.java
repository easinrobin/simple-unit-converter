package com.example.asus.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    Button btn1;
    EditText lengthInput;
    TextView txt1;
    TextView txt2;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        btn1 = (Button) findViewById(R.id.btn_length);
        lengthInput = (EditText) findViewById(R.id.length_input);
        txt1 = (TextView) findViewById(R.id.lengthText4);
        txt2 = (TextView) findViewById(R.id.lengthText6);
        txt3 = (TextView) findViewById(R.id.lengthText8);
    }
    public void btn_convert(View v){
        try{
            double m,km, mi,foot;
            m = Double.parseDouble(lengthInput.getText().toString());
            km = m/1000;
            foot = m*3.28084;
            mi = m*0.00062137;
            txt1.setText(Double.toString(km));
            txt2.setText(Double.toString(mi));
            txt3.setText(Double.toString(foot));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
