package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void StartShopping(View view){
        Intent startshopping = new Intent(this, StartShopping.class);
        startActivity(startshopping);
    }
}
