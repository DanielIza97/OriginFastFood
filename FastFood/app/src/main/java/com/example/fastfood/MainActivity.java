package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void LoginActivity(View view){
        Intent login =new Intent(this,Login.class);
        startActivity(login);
    }
    public void Menuopciones(View view){
        Intent menuopciones = new Intent(this, Menuloginfacebook.class);
        startActivity(menuopciones);
    }
}
