package com.example.tp2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class fontstyle extends AppCompatActivity {

    private TextView t1;
    private EditText text1;
    private Button btn,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fontstyle);
        t1=findViewById(R.id.p1);
        text1=findViewById(R.id.tSize);
        btn=findViewById(R.id.textSize);
        btn1=findViewById(R.id.valider);
        btn2=findViewById(R.id.btnItalic);
        btn3=findViewById(R.id.btnBold);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setVisibility(View.VISIBLE);
                btn1.setVisibility(View.VISIBLE);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String val1 = text1.getText().toString();
                if (TextUtils.isEmpty(val1)){
                    Toast.makeText(fontstyle.this, "Champs vide", Toast.LENGTH_SHORT).show();
                    return;
                }
                float nombre=Float.parseFloat(val1);
                t1.setTextSize(nombre);
                text1.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.INVISIBLE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               t1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));

            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                t1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

            }
        });
    }
}