package ru.wizand.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Formulas extends AppCompatActivity {

    // 1- AdaperView:GridView
    GridView gridView;

    // 2- Data Source: ArrayList<Shape>
    ArrayList<FormulaClass> formulaArrayList;

    // 3- Adapter: MyCustomAdapter
    MyFormulaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);

        gridView = findViewById(R.id.gridViewFormulas);

        formulaArrayList = new ArrayList<>();

        FormulaClass f1 = new FormulaClass(R.drawable.f1, getString(R.string.arbitrary_triangle));
        FormulaClass f2 = new FormulaClass(R.drawable.f2, getString(R.string.right_angled_triangle));
        FormulaClass f3 = new FormulaClass(R.drawable.f3, getString(R.string.equilateral_triangle));
        FormulaClass f4 = new FormulaClass(R.drawable.f4, getString(R.string.arbitrary_quadrilateral));

        FormulaClass f5 = new FormulaClass(R.drawable.f5, getString(R.string.parallelogram));
        FormulaClass f6 = new FormulaClass(R.drawable.f6, getString(R.string.rhomb));
        FormulaClass f7 = new FormulaClass(R.drawable.f7, getString(R.string.Rectangle));
        FormulaClass f8 = new FormulaClass(R.drawable.f8, getString(R.string.square));
        FormulaClass f9 = new FormulaClass(R.drawable.f9, getString(R.string.trapezoid));
        FormulaClass f10 = new FormulaClass(R.drawable.f10, getString(R.string.d_polygon));
        FormulaClass f11 = new FormulaClass(R.drawable.f11, getString(R.string.regular_polygon));
        FormulaClass f12 = new FormulaClass(R.drawable.f12, getString(R.string.circle));
        FormulaClass f13 = new FormulaClass(R.drawable.f13, getString(R.string.sector));



//        String[] values = new String[] { "Sphere", "Cyclinder", "Cube", "Prism",
//                "QuadrangularPyramid", "Cone", "Piramid", "RightPramid", "SphereSegment",
//                "SphereSektor", "SphereLayer", "Tetrahedron", "TreugolPiramid", "TruncatedCone",
//                "TruncatedPiramid" };


        formulaArrayList.add(f1);
        formulaArrayList.add(f2);
        formulaArrayList.add(f3);
        formulaArrayList.add(f4);
        formulaArrayList.add(f5);
        formulaArrayList.add(f6);
        formulaArrayList.add(f7);
        formulaArrayList.add(f8);
        formulaArrayList.add(f9);
        formulaArrayList.add(f10);
        formulaArrayList.add(f11);
        formulaArrayList.add(f12);
        formulaArrayList.add(f13);






        adapter = new MyFormulaAdapter(formulaArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);















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
            Class ourClass  = null;
            try {
                ourClass = Class.forName("ru.wizand.volumeareaapp.Formulas");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Intent j = new Intent(getApplicationContext(), ourClass);
            startActivity(j);
        }

        return  super.onOptionsItemSelected(item);
    }
}