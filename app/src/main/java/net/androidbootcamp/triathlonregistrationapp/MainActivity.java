package net.androidbootcamp.triathlonregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double costPerAthlete = 725.00;
    int numberOfAthletes;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText athletes = findViewById(R.id.txtAthletes);
        final Spinner group = findViewById(R.id.txtGroup);
        Button cost = findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = findViewById(R.id.txtResult);
            @Override
            public void onClick(View v) {
                numberOfAthletes = Integer.parseInt(athletes.getText().toString());
                totalCost = costPerAthlete * numberOfAthletes;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText(groupChoice + " race team fee is " + currency.format(totalCost));


            }
        });

    }
}
