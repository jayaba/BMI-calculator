package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float result;
    String show;
    TextView t1,t2,t3,e4;
    EditText e1,e2,e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=findViewById(R.id.tf1);
        e2=findViewById(R.id.tf2);
        e3=findViewById(R.id.tf3);

        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        e4=findViewById(R.id.ed4);


        b1=findViewById(R.id.button1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
//                float weight=Float.parseFloat(e1.getText().toString());
//                float height=Float.parseFloat(e2.getText().toString());
//                result=weight/(height*height);
//
//                e3.setText(String.valueOf(result));
//                if(result<18.5){
//                    e4.setText("Underweight");
//                }else if(result>18.5 && result<24.5){
//                    e4.setText("Healthy");
//                }else if(result>25 && result<29.5){
//                    e4.setText("overweight");
//                }else{
//                    e4.setText("danger");
//                }
            }
        });

    }
}