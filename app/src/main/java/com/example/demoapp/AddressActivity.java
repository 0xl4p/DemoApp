package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;


public class AddressActivity extends AppCompatActivity {
    private ImageView step1,step2,step3;
    Button ic_save;
    TextInputEditText input_name, input_address, input_phone, input_email;
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
        input_name=findViewById(R.id.input_name);
        input_address=findViewById(R.id.input_address);
        input_phone=findViewById(R.id.input_phone);
        input_email=findViewById(R.id.input_email);
        ic_save = findViewById(R.id.ic_save);
        ic_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(AddressActivity.this, OrderDetailActivity.class);
                // lấy dữ liệu
                String name=input_name.getText().toString();
                String address=input_address.getText().toString();
                String phone=input_phone.getText().toString();
                String email=input_email.getText().toString();
                //đóng gói dữ liệu vào bundle
                Bundle mybundle=new Bundle();
                // đưa dữ liệu vào bundle
                mybundle.putString("name",name);
                mybundle.putString("address",address);
                mybundle.putString("phone",phone);
                mybundle.putString("email",email);
                // dua bundle vao intent
                myintent.putExtra("mypackage", mybundle);
                startActivity(myintent);
            }
        });






    }
}
