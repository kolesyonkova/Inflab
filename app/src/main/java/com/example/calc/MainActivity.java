package com.example.calc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1;
    EditText num2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1= findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        num1=(EditText) findViewById(R.id.number1);
        num2=(EditText)findViewById(R.id.number2);
        textView = (TextView)findViewById(R.id.result);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                if ((!num1.getText().toString().equals(""))&&(!num2.getText().toString().equals(""))){
                    int el1=Integer.parseInt(num1.getText().toString());
                    int el2=Integer.parseInt(num2.getText().toString());
                    int resRAZ=el1+el2;
                    textView.setText(Integer.toString(resRAZ));}
                else textView.setText("Error");
                break;
            case R.id.button2:
                if ((!num1.getText().toString().equals(""))&&(!num2.getText().toString().equals(""))){
                    int el1=Integer.parseInt(num1.getText().toString());
                    int el2=Integer.parseInt(num2.getText().toString());
                    int resRAZ=el1-el2;
                    textView.setText(Integer.toString(resRAZ));}
                else textView.setText("Error");
                break;
            case R.id.button3:
                if ((!num1.getText().toString().equals(""))&&(!num2.getText().toString().equals(""))){
                    int el1=Integer.parseInt(num1.getText().toString());
                    int el2=Integer.parseInt(num2.getText().toString());
                    int resRAZ=el1*el2;
                    textView.setText(Integer.toString(resRAZ));}
                else textView.setText("Error");
                break;
            case R.id.button4:
                if ((!num1.getText().toString().equals(""))&&(!num2.getText().toString().equals(""))&&(!num2.getText().toString().equals("0"))){
                    int el1=Integer.parseInt(num1.getText().toString());
                    int el2=Integer.parseInt(num2.getText().toString());
                    double resRAZ=el1/el2;
                    textView.setText(Double.toString(resRAZ));}
                else textView.setText("Error");
                break;
        }
    }

}