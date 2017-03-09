package com.example.jinhwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이계산기");
        init();
    }
    void init(){
        final int[] result = new int[2];
        edit1=(EditText)findViewById(R.id.editText);
        edit2=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = edit1.getText().toString();
                print(year);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = edit2.getText().toString();
                print(age);

            }
        });
    }
    void print(String input){
        int result=2018-Integer.parseInt(input);
        Toast.makeText(getApplicationContext(),"결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();

    }

}
