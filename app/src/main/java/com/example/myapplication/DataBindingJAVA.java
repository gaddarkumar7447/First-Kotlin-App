package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityDataBindingJavaBinding;

public class DataBindingJAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityDataBindingJavaBinding dataBindingJAVA;

        ModelViewJavaClass modelViewJavaClass;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding_java);
        dataBindingJAVA = DataBindingUtil.setContentView(DataBindingJAVA.this,R.layout.activity_data_binding_java);

         modelViewJavaClass = new ViewModelProvider(DataBindingJAVA.this).get(ModelViewJavaClass.class);

        dataBindingJAVA.javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBindingJAVA.javaTextView.setText(dataBindingJAVA.javaEditText.getText().toString().trim());
            }
        });

        /*int s = modelViewJavaClass.getCurr();
        dataBindingJAVA.showIncremetValue.setText(s);
        dataBindingJAVA.javaIncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBindingJAVA.showIncremetValue.setText(modelViewJavaClass.getInc());
            }
        });*/

        dataBindingJAVA.javaIncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBindingJAVA.showIncremetValue.setText("Hello gaddar");
            }
        });
    }
}