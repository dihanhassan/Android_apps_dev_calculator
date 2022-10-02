package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNum,secondNum;
    Button addBtn,subBtn,mulBtn;
    TextView res ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText) findViewById(R.id.txt_1);
        secondNum = (EditText)  findViewById(R.id.txt_2);
        addBtn = (Button) findViewById(R.id.sum);
        subBtn = (Button) findViewById(R.id.sub);
        mulBtn = (Button) findViewById(R.id.mul);
        res = (TextView) findViewById(R.id.result);
    }
    public void Fun (View v){

        String num1 = firstNum.getText().toString();
        String num2 = secondNum.getText().toString();

        double n1= Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        if (v.getId()==R.id.sum){
            res.setText("Sum is : "+(n1+n2));
        }else if (v.getId()==R.id.mul){
            res.setText("Multiply is : "+(n1*n2));
        }else if (v.getId()==R.id.sub){
            res.setText("Substract is : "+(n1-n2));
        }

    }
}