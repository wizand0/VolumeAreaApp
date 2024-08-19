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

public class Piramid extends AppCompatActivity {

    EditText square, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramid);

        square = findViewById(R.id.editTextFirst);
        height = findViewById(R.id.editTextSecond);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = square.getText().toString();
                Double r1 = Double.parseDouble(s1);

                String s2 = height.getText().toString();
                Double r2 = Double.parseDouble(s2);

                double volume = 1.0/3 * r1 * r2;
                result.setText(getString(R.string.v)+volume+getString(R.string.m_3));
            }
        });

    }
}