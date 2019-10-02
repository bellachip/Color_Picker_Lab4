package bellayang.temple.edu.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Belle on 10/1/19.
 */

public class ColorAdapter extends BaseAdapter{

    private final Context activity;
    private final ArrayList<ColorItem> arr;
    private final ConstraintLayout cl;

   public ColorAdapter(Context context, ArrayList<ColorItem> arr,  ConstraintLayout cl){

       this.arr = arr;
       this.activity = context;
       this.cl = cl;
   }
    @NonNull

    @Override
    public int getCount() {
        return this.arr.size();
    }

    @Override
    public ColorItem getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if (convertView == null) {
           LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.spinner_custom_layout, parent, false);


       }



        //setContentView(R.layout.activity_color).setBackgroundColor(getResources().getColor(android.R.color.red));
        TextView txtID = convertView.findViewById(R.id.spinner_text);
       //txtID.setBackgroundColor(Color.RED);
        if (position == 1){
            convertView.setBackgroundColor(Color.RED);


        } else if (position == 0) {
            convertView.setBackgroundColor(0);
        }
        else if (position == 2 ){
            convertView.setBackgroundColor(Color.YELLOW);

        } else if (position == 3 ){
            convertView.setBackgroundColor(Color.BLUE);
        } else if (position == 4 ){
            convertView.setBackgroundColor(Color.BLACK);
        } else if (position == 5 ){
            convertView.setBackgroundColor(Color.WHITE);
        }
       ColorItem color = getItem(position);
       if (color != null) {
           txtID.setText(color.getColorName());

       }
       return convertView;
    }



}
