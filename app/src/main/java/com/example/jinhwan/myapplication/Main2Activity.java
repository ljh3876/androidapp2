package com.example.jinhwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText edit1 ;
    EditText edit2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("사과 계산기");
        init();
    }
    void init(){
        edit1=(EditText)findViewById(R.id.editText);
        edit2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price = edit1.getText().toString();
                String num = edit2.getText().toString();
                int result = Integer.parseInt(price)*Integer.parseInt(num);
                Toast.makeText(getApplicationContext(),"사과가격은 "+result+"입니다.",Toast.LENGTH_SHORT).show();



            }
        });

    }

}
