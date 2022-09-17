package com.example.myapplication;


import androidx.lifecycle.ViewModel;

public class ModelViewJavaClass extends ViewModel {
    int curr = 0;

    public int getCurr() {
        return curr;
    }

    public int getInc() {
        return curr++;
    }
}
