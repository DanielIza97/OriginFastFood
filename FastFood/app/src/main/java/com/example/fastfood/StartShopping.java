package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class StartShopping extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner2;
    private Spinner spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_shopping);
        spinner=(Spinner)findViewById(R.id.spinner1);
        spinner2= (Spinner)findViewById(R.id.spinner2);
        spinner3= (Spinner)findViewById(R.id.spinner3);
        String []pais=new String[]{"Ecuador"};
        String []ciudad=new String[]{"Sangolqui"};
        String []sector=new String[]{"Selva Alegre", "Salcoto", "Cashapamba", "Espe"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pais);
        spinner.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ciudad);
        spinner2.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sector);
        spinner3.setAdapter(adapter2);
    }

    public void MainMenushopping(View view){
        Intent MainMenuShoopers = new Intent(this,MainMenuShoopers.class);
        startActivity(MainMenuShoopers);
    }
}
