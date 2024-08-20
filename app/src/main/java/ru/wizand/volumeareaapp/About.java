package ru.wizand.volumeareaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class About extends AppCompatActivity {

    TextView textView7, textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://github.com/wizand0/VolumeAreaApp");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://github.com/wizand0/VolumeAreaApp");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId ==R.id.about) {
            Toast.makeText(this, R.string.you_selected_about_section, Toast.LENGTH_SHORT).show();
            Class ourClass  = null;
            try {
                ourClass = Class.forName("ru.wizand.volumeareaapp.About");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Intent j = new Intent(getApplicationContext(), ourClass);
            startActivity(j);
        }

        else if (itemId ==R.id.shapes) {
            Toast.makeText(this, R.string.you_selected_volume_section, Toast.LENGTH_SHORT).show();
            Class ourClass  = null;
            try {
                ourClass = Class.forName("ru.wizand.volumeareaapp.MainActivity");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Intent j = new Intent(getApplicationContext(), ourClass);
            startActivity(j);
        }

//        else if (itemId ==R.id.area) {
//            Toast.makeText(this, R.string.you_selected_area_section, Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, R.string.in_development, Toast.LENGTH_SHORT).show();
//            Class ourClass  = null;
//            try {
//                ourClass = Class.forName("ru.wizand.volumeareaapp.Area");
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            Intent j = new Intent(getApplicationContext(), ourClass);
//            startActivity(j);
//        }

        else if (itemId ==R.id.formulas) {
            Toast.makeText(this, R.string.you_selected_formulas_section, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, R.string.in_development, Toast.LENGTH_SHORT).show();
//            Class ourClass  = null;
//            try {
//                ourClass = Class.forName("ru.wizand.volumeareaapp.Formulas");
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            Intent j = new Intent(getApplicationContext(), ourClass);
//            startActivity(j);
        }

        return  super.onOptionsItemSelected(item);
    }
}