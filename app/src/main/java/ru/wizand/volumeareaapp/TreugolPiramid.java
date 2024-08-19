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

public class TreugolPiramid extends AppCompatActivity {

    EditText r1, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treugol_piramid);

        r1 = findViewById(R.id.editTextFirst);
        height = findViewById(R.id.editTextSecond);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = r1.getText().toString();
                Double radius1 = Double.parseDouble(s1);

                String s2 = height.getText().toString();
                Double height1 = Double.parseDouble(s2);


                double volume = (height1 * Math.pow(radius1, 2)) / (4 * Math.sqrt(3));
                result.setText(getString(R.string.v)+volume+getString(R.string.m_3));
            }
        });

    }
}