import java.util.*;

abstract class GeometricObject{
    String color = "white";
    boolean filled = false;
    Date dateCreated = new Date();

    public GeometricObject(){

    }

    public GeometricObject(String colour , boolean fill){
        color = colour;
        filled = fill;
    }
    
   

    public String getColor(){
        return color;
    }
    

    public void setColor(String newcolor){
        color = newcolor;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean newfilled){
        filled = newfilled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\n" + "color: " + color + " and filled " + filled;
    }

}

