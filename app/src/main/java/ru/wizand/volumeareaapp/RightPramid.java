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

public class RightPramid extends AppCompatActivity {

    EditText side, height, count_sides;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_pramid);

        side = findViewById(R.id.editTextFirst);
        height = findViewById(R.id.editTextSecond);
        count_sides = findViewById(R.id.editTextThird);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = side.getText().toString();
                Double side = Double.parseDouble(s1);

                String s2 = height.getText().toString();
                Double height = Double.parseDouble(s2);

                String s3 = count_sides.getText().toString();
                Double sides_count = Double.parseDouble(s3);

                double volume = (sides_count * Math.pow(side, 2) * height) / (12 * Math.tan(180/sides_count));
                DecimalFormat df = new DecimalFormat("0.0000");
                result.setText(getString(R.string.v)+df.format(volume)+getString(R.string.m_3));
            }
        });

    }
}