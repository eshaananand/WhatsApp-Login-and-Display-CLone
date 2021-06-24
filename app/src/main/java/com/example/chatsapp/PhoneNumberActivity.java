package com.example.chatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chatsapp.databinding.ActivityPhoneNumberBinding;
import com.google.firebase.auth.FirebaseAuth;

public class PhoneNumberActivity extends AppCompatActivity {
    ActivityPhoneNumberBinding binding;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_phone_number);
        setContentView(binding.getRoot());

        auth= FirebaseAuth.getInstance();

        if(auth.getCurrentUser() !=null)
        {
           Intent intent = new Intent(PhoneNumberActivity.this,MainActivity.class);
           startActivity(intent);
           finish();
        }
        getSupportActionBar().hide();

        binding.phoneBox.requestFocus();

        binding.setupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumberActivity.this, OTPactv.class);
                intent.putExtra("phoneNumber",binding.phoneBox.getText().toString());
                startActivity(intent);
            }
        });
    }
}