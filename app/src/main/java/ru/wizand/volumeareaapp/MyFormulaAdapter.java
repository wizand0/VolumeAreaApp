package ru.wizand.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyFormulaAdapter extends ArrayAdapter<FormulaClass> {

    private ArrayList<FormulaClass> formulaArrayList;
    Context context;

    public MyFormulaAdapter(ArrayList<FormulaClass> formulaArrayList, Context context) {
        super(context, R.layout.grid_item_layout, formulaArrayList);
        this.formulaArrayList = formulaArrayList;
        this.context = context;
    }

    //ViewHolder
    private static class MyViewHolder{
        TextView formulaName;
        ImageView formulaImg;

    }

    //GetView (Used to create and return a view for a specific item in Frid)

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1- Get the shape object for the current position
        FormulaClass formulas = getItem(position);

        // 2 - Inflating Layout
        MyFormulaAdapter.MyViewHolder myViewHolder;
        if (convertView == null){
            //no view went off-screen --> Create a new view
            myViewHolder = new MyFormulaAdapter.MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            // Finding views
            myViewHolder.formulaName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.formulaImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);

        }else{
            // a view went off-screen --> re-use it

            myViewHolder = (MyFormulaAdapter.MyViewHolder) convertView.getTag();

        }

        //Getting the data from the model class (shape)
        myViewHolder.formulaName.setText(formulas.getFormulaName());
        myViewHolder.formulaImg.setImageResource(formulas.getFormulaImg());

        return convertView;

    }




}
