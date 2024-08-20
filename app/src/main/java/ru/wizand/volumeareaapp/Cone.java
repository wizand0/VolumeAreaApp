package ru.wizand.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class Cone extends AppCompatActivity {

    EditText radius, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        radius = findViewById(R.id.editTextFirst);
        height = findViewById(R.id.editTextSecond);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = radius.getText().toString();
                Double r1 = Double.parseDouble(s1);

                String s2 = height.getText().toString();
                Double r2 = Double.parseDouble(s2);

                double volume = 1.0/3 * Math.PI * Math.pow(r1, 2)*r2;
                // output format
                DecimalFormat df = new DecimalFormat("0.0000");
                result.setText(getString(R.string.v)+df.format(volume)+getString(R.string.m_3));
            }
        });

    }
}