package com.hfad.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderCompletion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_completion);
    }
    public void navHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}