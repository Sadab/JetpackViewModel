package com.example.jetpackviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView randNum, randNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randNum = findViewById(R.id.randomNumTxt);
        randNum2 = findViewById(R.id.randomNumTxtView);

        DataBinderViewModel binder = new DataBinderViewModel();
        DataBinderViewModel model = ViewModelProviders.of(this).get(DataBinderViewModel.class);
        randNum.setText(binder.getNumber());
        randNum2.setText(model.getNumber());
    }
}
