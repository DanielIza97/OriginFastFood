package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StartShopping extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_shopping);
        spinner=(Spinner)findViewById(R.id.spinner1);

        String []opciones=new String[]{"Quito","Sangolqui"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(adapter);
    }

    public void MainMenushopping(View view){
        Intent MainMenuShoopers = new Intent(this,MainMenuShoopers.class);
        startActivity(MainMenuShoopers);
    }
    /*List<String> listSpinner = Arrays.asList("item1", "item2", "item3");
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, listSpinner);*/
}
