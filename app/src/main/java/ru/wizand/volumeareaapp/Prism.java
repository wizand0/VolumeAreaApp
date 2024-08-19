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

public class Prism extends AppCompatActivity {


    EditText first, second, third;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        first = findViewById(R.id.editTextFirst);
        second = findViewById(R.id.editTextSecond);
        third = findViewById(R.id.editTextThird);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = first.getText().toString();
                Double r1 = Double.parseDouble(s1);

                String s2 = first.getText().toString();
                Double r2 = Double.parseDouble(s2);

                String s3 = first.getText().toString();
                Double r3 = Double.parseDouble(s3);



                double volume = r1*r2*r3;
                result.setText(getString(R.string.v)+volume+getString(R.string.m_3));
            }
        });

    }
}