package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {
    int minteger = 0;

    Button cont;
    ImageView step1,back,edit_address;
    TextView name, address, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);


        // anh xa id
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        phone=findViewById(R.id.phone);

        //Nhan intent
        Intent myintent=getIntent();
        //Lay bundle khoi intent
        Bundle mybundle=myintent.getBundleExtra("mypackage");

        // lay du lieu khoi bundle
        String name1=mybundle.getString("name");
        String address1=mybundle.getString("address");
        String phone1=mybundle.getString("phone");
        String email1=mybundle.getString("email");
        //hien thi
        name.setText(name1);
        address.setText(address1);
        phone.setText(phone1);

        cont = findViewById(R.id.button_continue);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( OrderDetailActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        step1 = findViewById(R.id.step1);
        back=findViewById(R.id.ic_back);
        step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( OrderDetailActivity.this, AddressActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( OrderDetailActivity.this, AddressActivity.class);
                startActivity(intent);
            }
        });

        edit_address = findViewById(R.id.ic_edit);
        edit_address.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(OrderDetailActivity.this, AddressActivity.class);
                startActivity(intent);
            }
        });


    }

    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {
        minteger = minteger - 1;
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }
}