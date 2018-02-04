package com.example.alvinnovendra.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int hargachoco = 2;
    int hargawhipped = 1;
    EditText namapemesan = (EditText) findViewById(R.id.namapemesan);
    TextView total = (TextView) findViewById(R.id.total);
    TextView quantitytotal = (TextView) findViewById(R.id.quantitytotal);
    Button plus1 = (Button)findViewById(R.id.plus1);
    Button minus1 = (Button)findViewById(R.id.minus1);
    Button order = (Button) findViewById(R.id.order);
    CheckBox Chocolate = (CheckBox)findViewById(R.id.Chocolate);
    CheckBox whippedcream = (CheckBox)findViewById(R.id.whippedcream);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahlaman = new Intent(MainActivity.this,Main2Activity.class);
            }
        });




    }
    public void Plus1(View view){
      quantity = quantity + 1;
        d
    }


}

