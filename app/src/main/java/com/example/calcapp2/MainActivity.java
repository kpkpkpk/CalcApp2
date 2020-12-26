package com.example.calcapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView answer;
private EditText firstArg,secondArg;
private Button add,subtr,mul,divide;
private int firstNum,secondNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer=findViewById(R.id.answer);
        firstArg=findViewById(R.id.arg1);
        secondArg=findViewById(R.id.arg2);
        add=findViewById(R.id.add);
        subtr=findViewById(R.id.subtr);
        mul=findViewById(R.id.mul);
        divide=findViewById(R.id.divide);
        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextCheck(firstArg.getText().toString());
                switch (v.getId()){
                    case R.id.add:

                        break;
                    case R.id.subtr:

                        break;
                    case R.id.mul:

                        break;
                    case R.id.divide:

                        break;
                }
            }
        };
        add.setOnClickListener(onClickListener);
        subtr.setOnClickListener(onClickListener);
        mul.setOnClickListener(onClickListener);
        divide.setOnClickListener(onClickListener);
    }
    // проверка на int+
    public void editTextCheck(String str){
        try{
            firstNum=Integer.parseInt(str);
        }catch(NumberFormatException err){
            answer.setText("pososiException");
        }
    }
}
