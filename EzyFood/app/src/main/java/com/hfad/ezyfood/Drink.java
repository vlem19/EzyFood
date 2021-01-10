package com.hfad.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class Drink extends AppCompatActivity {
    int count1=0,count2=0,count3=0;
    ArrayList<DrinkArray> drink = new ArrayList<DrinkArray>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
    public void addList(View view){
        if(view == findViewById(R.id.addOrange)){
            count1++;
            TextView text = (TextView) findViewById(R.id.countOrange);
            text.setText("Qty: "+ count1);
        }
        else if(view == findViewById(R.id.addApple)){
            count2++;
            TextView text = (TextView) findViewById(R.id.countApple);
            text.setText("Qty: "+ count2);
        }
        else if(view == findViewById(R.id.addAvocado)){
            count3++;
            TextView text = (TextView) findViewById(R.id.countAvocado);
            text.setText("Qty: " + count3);
        }
        addItem();
    }
    public void rmvList(View view){
        if(view == findViewById(R.id.rmvOrange)){
            if(count1 > 0) {
                count1--;
                TextView text = (TextView) findViewById(R.id.countOrange);
                text.setText("Qty: " + count1);
            }
        }
        else if(view == findViewById(R.id.rmvApple)){
            if(count2>0) {
                count2--;
                TextView text = (TextView) findViewById(R.id.countApple);
                text.setText("Qty: " + count2);
            }
        }
        else if(view == findViewById(R.id.rmvAvocado)){
            if(count3 > 0) {
                count3--;
                TextView text = (TextView) findViewById(R.id.countAvocado);
                text.setText("Qty: " + count3);
            }
        }
        addItem();
    }
    public void addItem(){
        DrinkArray drinks1 = new DrinkArray("Orange Juice",8000,count1);
        drink.add(drinks1);
        DrinkArray drinks2 = new DrinkArray("Apple Juice",8500,count2);
        drink.add(drinks2);
        DrinkArray drinks3 = new DrinkArray("Avocado Juice", 9000, count3);
        drink.add(drinks3);
    }
    public void placeOrder(View view){
        Intent intent = new Intent(this, OrderOverview.class);
        startActivity(intent);
    }
    public void navHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}