package com.example.jetpackviewmodel;

import java.util.Random;

import androidx.lifecycle.ViewModel;

public class DataBinderViewModel extends ViewModel {
    private  String randomNumber;

    public String getNumber(){
        if(randomNumber == null){
            createNumber();
        }
        return randomNumber;
    }
    private void createNumber(){
        Random random = new Random();
        randomNumber = "Number : " + (random.nextInt(10-1) + 1 );
    }
}
