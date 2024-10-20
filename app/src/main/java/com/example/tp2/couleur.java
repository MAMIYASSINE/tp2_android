package com.example.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class couleur extends AppCompatActivity {

    private TextView text1;
    private Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_couleur);
        text1=findViewById(R.id.espaceTest);
        btn1=findViewById(R.id.c1);
        btn2=findViewById(R.id.c2);
        btn3=findViewById(R.id.c3);
        btn4=findViewById(R.id.c4);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int c1_1=getResources().getColor(R.color.red);
                text1.setBackgroundColor(c1_1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int c2_2=getResources().getColor(R.color.blue);
                text1.setBackgroundColor(c2_2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int c2_2=getResources().getColor(R.color.orange);
                text1.setBackgroundColor(c2_2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int c2_2=getResources().getColor(R.color.green);
                text1.setBackgroundColor(c2_2);
            }
        });




    }
}