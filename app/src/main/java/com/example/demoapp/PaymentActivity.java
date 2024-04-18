package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        Button button = findViewById(R.id.button_continue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PaymentActivity.this, MomoPaymentActivity.class);
                startActivity(intent);
            }
        });

        ImageView step1 = findViewById(R.id.step1);
        step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PaymentActivity.this, AddressActivity.class);
                startActivity(intent);
            }
        });
        ImageView step2 = findViewById(R.id.step2);
        step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PaymentActivity.this, OrderDetailActivity.class);
                startActivity(intent);
            }
        });

        ImageView back = findViewById(R.id.ic_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PaymentActivity.this, OrderDetailActivity.class);
                startActivity(intent);
            }
        });

        ImageView edit_card = findViewById(R.id.ic_edit);
        edit_card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PaymentActivity.this, CardEditActivity.class);
                startActivity(intent);
            }
        });

    }


}