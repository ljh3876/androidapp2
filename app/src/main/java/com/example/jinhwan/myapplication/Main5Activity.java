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
        checkBox=(CheckBox)findViewById(R.id.checkBox);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_pizza = checkEmpty(edit1);
                int num_spagetti = checkEmpty(edit2);
                int num_salad = checkEmpty(edit3);

                TextView numInGUI=(TextView)findViewById(R.id.textView_num);
                TextView priceInGUI=(TextView)findViewById(R.id.textView_price);
                numInGUI.setText((num_pizza + num_spagetti + num_salad)+"개");
                if(checkBox.isChecked()) {
                    priceInGUI.setText((int)((num_pizza * 15000 + num_spagetti * 13000 + num_salad * 900)*0.9)+"원");
                }
                else
                    priceInGUI.setText((num_pizza * 15000 + num_spagetti * 13000 + num_salad * 900)+"원");
            }
        });

    }
    int checkEmpty(EditText editText){
        if(editText.length()==0)
            return 0;
        else
            return Integer.parseInt(editText.getText().toString());

    }
}
