package com.example.myapplication;

import androidx.lifecycle.ViewModel;

public class ModelViewClass extends ViewModel {
      int count = 0;
    public  int getCurrent(){
        return count;
    }
    public  int getIncrement(){
        return count++;
    }
}
