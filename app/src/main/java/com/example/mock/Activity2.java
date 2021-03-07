package com.example.mock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final EditText name = (EditText) findViewById(R.id.insertName);
        final EditText birth = (EditText) findViewById(R.id.insertBirth);
        final RadioButton male = (RadioButton) findViewById(R.id.rM);
        final RadioButton female = (RadioButton) findViewById(R.id.rF);
        final RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        final TextView message = (TextView) findViewById(R.id.msg);
        final Button a2toa1 = (Button) findViewById(R.id.btn_2to1);
        final Button a2toa3 = (Button) findViewById(R.id.btn_2to3);
        final Button submit = (Button) findViewById(R.id.submit);

        a2toa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent always has the activities inside
                Intent s2tos1= new Intent(Activity2.this,MainActivity.class);
                startActivity(s2tos1);
            }
        });
        a2toa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos3 = new Intent(Activity2.this,MainActivity.class);
                startActivity(s2tos3);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name!=null && birth!=null){
                    if (male.isChecked()){
                        message.setText("Hello Mr."+name.getText()+" you are "+(2021-Integer.parseInt(birth.getText().toString())) + " years old");
                    }


                        if(female.isChecked()){
                            message.setText("Hello Ms."+name.getText()+" you are "+(2021-Integer.parseInt(birth.getText().toString())));

                    }
                        else {
                            Toast.makeText(Activity2.this,"Please enter all info",Toast.LENGTH_LONG).show();
                        }


                }
            }
        });


    }
}