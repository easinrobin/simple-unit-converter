package com.example.asus.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    Button btn1;
    EditText tmpInput;
    TextView txt1;
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        btn1 = (Button) findViewById(R.id.btn_temp);
        tmpInput = (EditText) findViewById(R.id.tmp_input);
        txt1 = (TextView) findViewById(R.id.tempText4);
        txt2 = (TextView) findViewById(R.id.tempText6);


    }
    public void btnConvert(View v){
        try{
            double celsius, fahr,kelvin;
            celsius = Double.parseDouble(tmpInput.getText().toString());
            fahr = celsius*1.8+32;
            kelvin = celsius + 273.15;
            txt1.setText(Double.toString(fahr));
            txt2.setText(Double.toString(kelvin));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
