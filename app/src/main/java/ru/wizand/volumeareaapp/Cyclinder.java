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

public class Cyclinder extends AppCompatActivity {

    EditText radius, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyclinder);

        radius = findViewById(R.id.editTextRadius);
        height = findViewById(R.id.editTextHight);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius1 = radius.getText().toString();

                Double r = Double.parseDouble(radius1);

                String height1 = height.getText().toString();

                Double h = Double.parseDouble(height1);

                // V = (4/3) * pi * r^3

                double volume = Math.PI * Math.pow(r, 2) * h;
                result.setText(getString(R.string.v)+volume+getString(R.string.m_3));
            }
        });

    }
}