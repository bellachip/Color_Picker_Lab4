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

        //Background Layout
        currentLayout = findViewById(R.id.curr_layout);
        //arr for colors
        String arr [] = {"Choose a color", "Red", "Yellow", "Blue" , "Black", "White", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta"};
        //arraylist for colors colorItem
        ArrayList<ColorItem> colors = new ArrayList<ColorItem>();
        //Spinner
        spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this ,  colors, currentLayout);

        //stores coloradapters inside the adapter
        for (int i=0; i < arr.length ; i++) {
            colors.add(new ColorItem(arr[i], i));


        }

        spinner.setAdapter(adapter);
        //selection action
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                //Sets the background color to white
                view.setBackgroundColor(Color.WHITE);

               // TextView txtID = (TextView) findViewById(R.id.spinner_text);
                //Sets the colors depending on the selection
                if (id == 0){
                    currentLayout.setBackgroundColor(0);
                } else if (id ==1 ) {
                    currentLayout.setBackgroundColor(Color.RED);
                } else if (id == 2 ){
                    currentLayout.setBackgroundColor(Color.YELLOW);
                } else if (id == 3 ){
                    currentLayout.setBackgroundColor(Color.BLUE);
                } else if (id == 4 ){
                    currentLayout.setBackgroundColor(Color.BLACK);
                } else if (id == 5 ){
                    currentLayout.setBackgroundColor(Color.WHITE);
                } else if (id == 6 ){
                currentLayout.setBackgroundColor(Color.CYAN);
                } else if (id == 7 ){
                    currentLayout.setBackgroundColor(Color.DKGRAY);
                } else if (id == 8 ){
                    currentLayout.setBackgroundColor(Color.GRAY);
                } else if (id == 9 ){
                    currentLayout.setBackgroundColor(Color.GREEN);
                } else if (id == 10 ){
                    currentLayout.setBackgroundColor(Color.LTGRAY);
                } else if (id == 11 ){
                    currentLayout.setBackgroundColor(Color.MAGENTA);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }


}
