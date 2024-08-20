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

public class TruncatedCone extends AppCompatActivity {

    EditText r1, r2, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truncated_cone);

        r1 = findViewById(R.id.editTextFirst);
        r2 = findViewById(R.id.editTextSecond);
        height = findViewById(R.id.editTextThird);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = r1.getText().toString();
                Double radius1 = Double.parseDouble(s1);

                String s2 = r2.getText().toString();
                Double radius2 = Double.parseDouble(s2);

                String s3 = height.getText().toString();
                Double height1 = Double.parseDouble(s3);

                double volume = 1.0/3 * Math.PI * height1 * (Math.pow(radius1, 2) +
                        radius1 * radius2 + Math.pow(radius2,2));
                DecimalFormat df = new DecimalFormat("0.0000");
                result.setText(getString(R.string.v)+df.format(volume)+getString(R.string.m_3));
            }
        });

    }
}