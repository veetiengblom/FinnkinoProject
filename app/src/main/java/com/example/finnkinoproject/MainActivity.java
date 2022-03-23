package com.example.finnkinoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<Theatre> theatre_array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinnerID);
        theatre_array = new ArrayList<Theatre>();
        theatre_array.add(new Theatre("Espoo omena"));
        theatre_array.add(new Theatre("Espoo sello"));
        theatre_array.add(new Theatre("Helsinki itis"));
        theatre_array.add(new Theatre("Helsinki kinopalatsi"));
        theatre_array.add(new Theatre("Helsinki maxim"));
        theatre_array.add(new Theatre("Helsinki tennispalatsi"));
        theatre_array.add(new Theatre("Jyväskylä fantasia"));
        theatre_array.add(new Theatre("Kuopio scala"));
        theatre_array.add(new Theatre("Lahti kuvapalatsi"));
        theatre_array.add(new Theatre("Lappeenranta strand"));
        theatre_array.add(new Theatre("Oulu plaza"));
        theatre_array.add(new Theatre("Pori promenadi"));
        theatre_array.add(new Theatre("Tampere cine atlas"));
        theatre_array.add(new Theatre("Tampere plevna"));
        theatre_array.add(new Theatre("Turku kinopalatsi"));
        theatre_array.add(new Theatre("Vantaa flamingo"));

        ArrayAdapter<Theatre> adapter = new ArrayAdapter<Theatre>(this, android.R.layout.simple_spinner_dropdown_item, theatre_array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}