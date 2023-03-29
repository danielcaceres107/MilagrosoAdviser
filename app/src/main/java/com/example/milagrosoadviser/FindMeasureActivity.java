package com.example.milagrosoadviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindMeasureActivity extends AppCompatActivity {

    private MeasureExpert expert = new MeasureExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_measure);
    }

    public void onClickFindBeer(View view){
        //reference to the TextView
        TextView measure = (TextView) findViewById(R.id.measure);
        //reference to the Spinner
        Spinner type = (Spinner) findViewById(R.id.pacientType);
        //Get selected item in the spinner
        String selectedType = String.valueOf(type.getSelectedItem());
        //Get recomendations
        List<String> measurelist = expert.getMeasures(selectedType);
        StringBuilder measuresFormatted = new StringBuilder();
        for (String brand: measurelist){
            measuresFormatted.append(brand).append('\n');
        }
        //Display the beers
        measure.setText(measuresFormatted);
    }


}