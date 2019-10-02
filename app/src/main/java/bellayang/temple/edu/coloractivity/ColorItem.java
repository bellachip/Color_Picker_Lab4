package bellayang.temple.edu.coloractivity;

/**
 * Created by Belle on 10/1/19.
 */

public class ColorItem {

    private String colorName;
    private int id;


    public ColorItem(String colorName, int id) {
        this.colorName = colorName;
        this.id = id;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName){
        this.colorName = colorName;
    }


}
