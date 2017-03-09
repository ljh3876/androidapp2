package com.example.jinhwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button btn_plus;
    Button btn_minus;
    Button btn_multiple;
    Button btn_divide;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");
        init();
    }
    void init(){
        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);
        btn_plus = (Button)findViewById(R.id.button_plus);
        btn_minus = (Button)findViewById(R.id.button_minus);
        btn_multiple = (Button)findViewById(R.id.button_multiple);
        btn_divide = (Button)findViewById(R.id.button_divide);
        setListener(btn_plus,"+");
        setListener(btn_minus,"-");
        setListener(btn_multiple,"*");
        setListener(btn_divide,"/");
    }
    void setListener(Button btn, final String operation){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEmpty()==true){
                    switch(operation){
                        case "+":
                            result=sum();
                            Toast.makeText(getApplicationContext(),"더하기 계산 결과는"+result+"입니다.",Toast.LENGTH_SHORT).show();
                            break;
                        case "-":
                            result=subtract();
                            Toast.makeText(getApplicationContext(),"빼기 계산 결과는"+result+"입니다.",Toast.LENGTH_SHORT).show();
                            break;
                        case "*":
                            result=multiply();
                            Toast.makeText(getApplicationContext(),"곱하기 계산 결과는"+result+"입니다.",Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            result=divide();
                            Toast.makeText(getApplicationContext(),"나누기 계산 결과는"+result+"입니다.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    boolean checkEmpty(){
        if(edit1.length()==0 || edit2.length() == 0) {
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            return true;
    }

    int sum(){
        return Integer.parseInt((edit1.getText()).toString())+Integer.parseInt((edit2.getText()).toString());
    }
    int subtract(){
        return Integer.parseInt((edit1.getText()).toString())-Integer.parseInt((edit2.getText()).toString());
    }
    int multiply(){
        return Integer.parseInt((edit1.getText()).toString())*Integer.parseInt((edit2.getText()).toString());
    }
    int divide(){
        return (int)(Double.parseDouble((edit1.getText()).toString())/Double.parseDouble((edit2.getText()).toString()));
    }
}
