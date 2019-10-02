package bellayang.temple.edu.coloractivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
    Spinner spinner;
    ConstraintLayout currentLayout;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        currentLayout = findViewById(R.id.curr_layout);
        ArrayList<ColorItem> colors = new ArrayList<ColorItem>();



        spinner = findViewById(R.id.spinner);
         //spinner.setTextColor(Color.YELLOW);

        ColorAdapter adapter = new ColorAdapter(this ,  colors, currentLayout);

        //dummylist
        colors.add(new ColorItem( "Choose a color" + String.valueOf(0), 0));
        colors.add(new ColorItem( "Red" + String.valueOf(1), 1));
        colors.add(new ColorItem( "Yellow" + String.valueOf(2), 2));
        colors.add(new ColorItem( "Blue" + String.valueOf(3), 3));
        colors.add(new ColorItem( "Black" + String.valueOf(4), 4));
        colors.add(new ColorItem( "White" + String.valueOf(5), 5));



        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();

                view.setBackgroundColor(Color.WHITE);

               // TextView txtID = (TextView) findViewById(R.id.spinner_text);
                //txtID.setBackgroundColor(Color.WHITE);
                if (id == 1){
                    currentLayout.setBackgroundColor(Color.RED);

                } else if (id ==0 ) {
                    currentLayout.setBackgroundColor(0);
                }
                else if (id == 2 ){
                    currentLayout.setBackgroundColor(Color.YELLOW);

                } else if (id == 3 ){
                    currentLayout.setBackgroundColor(Color.BLUE);
                } else if (id == 4 ){
                    currentLayout.setBackgroundColor(Color.BLACK);
                } else if (id == 5 ){
                    currentLayout.setBackgroundColor(Color.WHITE);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }


}
