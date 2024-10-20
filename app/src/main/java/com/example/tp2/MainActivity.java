package com.example.tp2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText texte1, texte2, resultat;
    private RadioGroup radioGroup;
    private RadioButton addition, soustraction, multiplication, division;
    private Button calculer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4);

        texte1 = findViewById(R.id.texte1);
        texte2 = findViewById(R.id.texte2);
        resultat = findViewById(R.id.res);
        radioGroup = findViewById(R.id.radioGroup);
        addition = findViewById(R.id.r1);
        soustraction = findViewById(R.id.r2);
        multiplication = findViewById(R.id.r3);
        division = findViewById(R.id.r4);
        calculer = findViewById(R.id.btn);

        calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = texte1.getText().toString();
                String val2 = texte2.getText().toString();

                if (TextUtils.isEmpty(val1) || TextUtils.isEmpty(val2)) {
                    Toast.makeText(MainActivity.this, "Champs vide", Toast.LENGTH_SHORT).show();
                    return;
                }

                double nombre1 = Double.parseDouble(val1);
                double nombre2 = Double.parseDouble(val2);
                double res = 0;

                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == R.id.r1) {
                    res = nombre1 + nombre2;  // Addition
                } else if (selectedId == R.id.r2) {
                    res = nombre1 - nombre2;  // Soustraction
                } else if (selectedId == R.id.r3) {
                    res = nombre1 * nombre2;  // Multiplication
                } else if (selectedId == R.id.r4) {
                    if (nombre2 != 0) {
                        res = nombre1 / nombre2;  // Division
                    } else {
                        Toast.makeText(MainActivity.this, "Division par zéro impossible", Toast.LENGTH_SHORT).show();
                        return;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Sélectionnez une opération", Toast.LENGTH_SHORT).show();
                    return;
                }

                resultat.setText(String.valueOf(res));
            }
        });
    }
}
