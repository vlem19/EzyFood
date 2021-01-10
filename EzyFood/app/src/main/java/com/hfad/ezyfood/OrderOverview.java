package com.hfad.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_overview);
    }
    public void navDrinks(View view) {
        Intent intent = new Intent(this, Drink.class);
        startActivity(intent);
    }
    public void navMyOrder(View view){
        Intent intent = new Intent(this, MyOrder.class);
        startActivity(intent);
    }
}