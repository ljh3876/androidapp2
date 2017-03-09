package com.example.jinhwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    EditText edit3;
    Button btn;
    TextView numInGUI;
    TextView priceInGUI;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 메뉴 주문");
        init();
    }
    void init(){
        edit1=(EditText)findViewById(R.id.editText_pizza);
        edit2=(EditText)findViewById(R.id.editText_spagetti);
        edit3=(EditText)findViewById(R.id.editText_salad);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int num_pizza = Integer.parseInt(edit1.getText().toString());
                int num_spagetti = Integer.parseInt(edit2.getText().toString());
                int num_salad = Integer.parseInt(edit3.getText().toString());

                numInGUI.setText(Integer.toString(num_pizza + num_spagetti + num_salad));
                if(checkBox.isChecked()) {
                    priceInGUI.setText(Double.toString((num_pizza * 15000 + num_spagetti * 13000 + num_salad * 900)*0.9));
                }
                else
                    priceInGUI.setText(Integer.toString(num_pizza * 15000 + num_spagetti * 13000 + num_salad * 900));
            }
        });

    }
}
