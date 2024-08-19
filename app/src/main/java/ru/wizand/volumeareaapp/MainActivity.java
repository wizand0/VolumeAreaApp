package ru.wizand.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1- AdaperView:GridView
    GridView gridView;

    // 2- Data Source: ArrayList<Shape>
    ArrayList<Shape> shapeArrayList;

    // 3- Adapter: MyCustomAdapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere, getString(R.string.sphere));
        Shape s2 = new Shape(R.drawable.cylinder, getString(R.string.cyclinder));
        Shape s3 = new Shape(R.drawable.cube, getString(R.string.cube));
        Shape s4 = new Shape(R.drawable.prism, getString(R.string.prism));

        Shape s5 = new Shape(R.drawable.piramid, getString(R.string.quadrangularpyramid));
        Shape s6 = new Shape(R.drawable.konusa, getString(R.string.cone));
        Shape s7 = new Shape(R.drawable.v_piramid, getString(R.string.piramid));
        Shape s8 = new Shape(R.drawable.v_prav_piramid, getString(R.string.rightpramid));
        Shape s9 = new Shape(R.drawable.sharov_segment, getString(R.string.spheresegment));
        Shape s10 = new Shape(R.drawable.sharov_sektor, getString(R.string.spheresektor));
        Shape s11 = new Shape(R.drawable.sharov_sloy, getString(R.string.spherelayer));
        Shape s12 = new Shape(R.drawable.v_tetraedra, getString(R.string.tetrahedron));
        Shape s13 = new Shape(R.drawable.treugol_piramid, getString(R.string.treugolpiramid));
        Shape s14 = new Shape(R.drawable.usech_konusa, getString(R.string.truncatedcone));
        Shape s15 = new Shape(R.drawable.usech_piramid, getString(R.string.truncatedpiramid));




        String[] values = new String[] { "Sphere", "Cyclinder", "Cube", "Prism",
                "QuadrangularPyramid", "Cone", "Piramid", "RightPramid", "SphereSegment",
                "SphereSektor", "SphereLayer", "Tetrahedron", "TreugolPiramid", "TruncatedCone",
                "TruncatedPiramid" };

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);
        shapeArrayList.add(s5);
        shapeArrayList.add(s6);
        shapeArrayList.add(s7);
        shapeArrayList.add(s8);
        shapeArrayList.add(s9);
        shapeArrayList.add(s10);
        shapeArrayList.add(s11);
        shapeArrayList.add(s12);
        shapeArrayList.add(s13);
        shapeArrayList.add(s14);
        shapeArrayList.add(s15);


        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Intent i = new Intent(getApplicationContext(), Sphere.class);
//                startActivity(i);

                String value = values[position]; // arg2 is the index of item
                Class ourClass  = null;
                try {
                    ourClass = Class.forName("ru.wizand.volumeareaapp."+value);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                Intent i = new Intent(getApplicationContext(), ourClass);
                startActivity(i);
            }
        });



    }
}