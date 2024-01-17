package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
EditText e1,e2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);

        e1=(EditText) findViewById(R.id.txt1);
        e2=(EditText)findViewById(R.id.txt2);
        res=(EditText)findViewById(R.id.eresult);
        //add
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()>0 && e2.getText().length()>0)
                {
                    double num1=Double.parseDouble(e1.getText().toString());
                    double num2=Double.parseDouble(e2.getText().toString());
                    double r=num1+num2;
                    res.setText(Double.toString(r));
                }
                else {
                    Toast.makeText(MainActivity.this,"enter number plz:",Toast.LENGTH_LONG).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()>0 && e2.getText().length()>0)
                {
                    double num1=Double.parseDouble(e1.getText().toString());
                    double num2=Double.parseDouble(e2.getText().toString());
                    double r=num1-num2;
                    res.setText(Double.toString(r));
                }
                else {
                    Toast.makeText(MainActivity.this,"enter number plz:",Toast.LENGTH_LONG).show();
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()>0 && e2.getText().length()>0)
                {
                    double num1=Double.parseDouble(e1.getText().toString());
                    double num2=Double.parseDouble(e2.getText().toString());
                    double r=num1*num2;
                    res.setText(Double.toString(r));
                }
                else {
                    Toast.makeText(MainActivity.this,"enter number plz:",Toast.LENGTH_LONG).show();
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()>0 && e2.getText().length()>0)
                {
                    double num1=Double.parseDouble(e1.getText().toString());
                    double num2=Double.parseDouble(e2.getText().toString());
                    double r=num1/num2;
                    res.setText(Double.toString(r));
                }
                else {
                    Toast.makeText(MainActivity.this,"enter number plz:",Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}