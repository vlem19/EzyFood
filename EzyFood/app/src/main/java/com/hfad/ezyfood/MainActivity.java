package com.hfad.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navDrinks(View view) {
        Intent intent = new Intent(MainActivity.this, Drink.class);
        startActivity(intent);
    }
    public void navMyOrder(View view){
        Intent intent = new Intent(MainActivity.this, MyOrder.class);
        startActivity(intent);
    }
    public void navTopUp(View view){
        Intent intent = new Intent(MainActivity.this, TopUp.class);
        startActivity(intent);
    }

    public void navMaps(View view){
        Intent intent = new Intent(MainActivity.this, Maps.class);
        startActivity(intent);
    }
}