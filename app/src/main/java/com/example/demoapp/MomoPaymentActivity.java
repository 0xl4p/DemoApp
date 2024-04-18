package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MomoPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_momo);

        Button button = findViewById(R.id.ic_paid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MomoPaymentActivity.this, PendingPaymentActivity.class);
                startActivity(intent);
            }
        });

        ImageView back = findViewById(R.id.ic_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MomoPaymentActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        new CountDownTimer(300000, 1000) {
            TextView count = findViewById(R.id.count_down);
            public void onTick(long millisUntilFinished) {
                count.setText("Giao dịch hết hạn sau: "+String.format("%d:%d",
                        TimeUnit.MILLISECONDS.toMinutes( millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                count.setText("Giao dịch đã hết hạn!");
            }
        }.start();

    }

}