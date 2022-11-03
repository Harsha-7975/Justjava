package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int number = 5;
    int price = 3;

    public void submitOrder(View view) {

        display(number);
        displayPrice(number*price);

    }

    public void incrementOrder(View view)
    {
        number += 1;
        display(number);

    }
    public void decrementOrder(View view)
    {
        number -= 1;
        display(number);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("That will be :"+NumberFormat.getCurrencyInstance().format(number)+"\nThankyou");
    }



}