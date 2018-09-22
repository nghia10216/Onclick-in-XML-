package com.bk.ducnghia.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity   {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void text_tong(View view) {
        EditText soa = findViewById(R.id.text_a);
        EditText sob = findViewById(R.id.text_b);
        TextView dapan = findViewById(R.id.text_da);
        int a=Integer.parseInt(soa.getText()+"");
        int b=Integer.parseInt(sob.getText()+"");
        dapan.setText((a+b)+"");

    }

}