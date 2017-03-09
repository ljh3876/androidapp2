package com.example.jinhwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도변환기");
        init();
    }
    void init(){
        edit1=(EditText)findViewById(R.id.editText);
        edit2=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahrenheit = edit1.getText().toString();
                double result = Double.parseDouble(fahrenheit) * 1.8 +32;
                print(result);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsius = edit2.getText().toString();
                double result = (Double.parseDouble(celsius)-32)/1.8;
                print(result);

            }
        });
    }
    void print(double result){
        Toast.makeText(getApplicationContext(),"결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();

    }
}
