package com.example.chen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chen.myapplication.Fragment.PatientFragment;

public class UserActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        getFragmentManager().beginTransaction().add(R.id.patientInfo,new PatientFragment()).commit();
    }


}
