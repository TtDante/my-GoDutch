package com.example.a13456.myapplication;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText totalmoney,personnum,tip;
    TextView display;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalmoney = (EditText) findViewById(R.id.M_editText);
        personnum = (EditText) findViewById(R.id.P_editText);
        display = (TextView) findViewById(R.id.textView4);
        tip = (EditText) findViewById(R.id.T_editText);
        btn = (Button) findViewById(R.id.button);
    }

    public void btn(View view) {
        double t;
        try {
            double total = Double.parseDouble(totalmoney.getText().toString());
        double per = Double.parseDouble(personnum.getText().toString());
        try{ t = Double.parseDouble(tip.getText().toString());}catch(Exception e){t=0;}
        double pay = (total + total * t / 100) / per;
        pay=Double.valueOf(Math.round(pay*100));
        pay=pay/100;
        display.setText(String.valueOf(pay)+" $");
    }
        catch(Exception e){
            display.setText("please input all items!");
        }
    }
}

