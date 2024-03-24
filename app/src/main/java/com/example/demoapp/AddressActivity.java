package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;


public class AddressActivity extends AppCompatActivity {
    private ImageView step1,step2,step3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);


        // spinner
//        Spinner spinner = findViewById(R.id.spinner_payment);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String item = parent.getItemAtPosition(position).toString();
//                Toast.makeText(PaymentActivity.this,"Thanh toán: "+item,Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Chuyển khoản Ngân Hàng");
//        arrayList.add("Ship COD");
//        arrayList.add("Momo");
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrayList);
//        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
//        spinner.setAdapter(adapter);


        // intent
        Button button = findViewById(R.id.ic_save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressActivity.this, OrderDetailActivity.class);
                startActivity(intent);
            }
        });


    }
}
