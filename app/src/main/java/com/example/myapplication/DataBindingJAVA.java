package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityDataBindingJavaBinding;

public class DataBindingJAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityDataBindingJavaBinding dataBindingJAVA;

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_data_binding_java);

        dataBindingJAVA = DataBindingUtil.setContentView(DataBindingJAVA.this,R.layout.activity_data_binding_java);

        dataBindingJAVA.javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBindingJAVA.javaTextView.setText(dataBindingJAVA.javaEditText.getText().toString().trim());
            }
        });

    }
}