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

public class SphereSegment extends AppCompatActivity {

    EditText r1, height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_segment);

        r1 = findViewById(R.id.editTextFirst);
        height = findViewById(R.id.editTextThird);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = r1.getText().toString();
                Double radius1 = Double.parseDouble(s1);

                String s3 = height.getText().toString();
                Double height1 = Double.parseDouble(s3);

                double volume = 1.0/3 * Math.PI * Math.pow(height1, 2) * (3 * radius1 - height1);
                result.setText(getString(R.string.v)+volume+getString(R.string.m_3));
            }
        });

    }
}