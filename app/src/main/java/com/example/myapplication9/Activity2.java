package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


import java.util.LinkedList;

public class Activity2 extends Activity {

    Button btnBack;
    Button btnOk;
    Button btnSubmit;
    CheckBox cbJava;
    CheckBox cbAndroid;
    CheckBox cbCs;
    RadioButton rbtnFemale;
    RadioButton rbtnMale;
    LinkedList<CheckBox> lstCb;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        cbJava = (CheckBox)findViewById(R.id.cbJava);
        cbAndroid = (CheckBox)findViewById(R.id.cbAndroid);
        cbCs = (CheckBox)findViewById(R.id.cbCs);
        rbtnFemale = (RadioButton) findViewById(R.id.rbtnFemale);
        rbtnMale = (RadioButton) findViewById(R.id.rbtnMale);
        lstCb=new LinkedList<CheckBox>();
        lstCb.add(cbJava);
        lstCb.add(cbCs);
        lstCb.add(cbAndroid);

        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Activity2.this,"Welcome",Toast.LENGTH_LONG).show();
                    }
                }
        );
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String res="Bạn giới tính ";
                        if(rbtnFemale.isChecked())
                            res+=" Nữ ";
                        else res+=" Nam ";
                        res+="và môn học của bạn là: ";
                        for(CheckBox item : lstCb)
                            if(item.isChecked())
                                res+= item.getText();
                        Toast.makeText(Activity2.this,res,Toast.LENGTH_LONG).show();
                        finish();
                    }
                }
        );

    }
}