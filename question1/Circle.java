public class Circle extends GeometricObject{
    double radius;
    public static final double PI = 3.14159265358979323846;

    public Circle(){}

    public Circle(double newradius){
        radius = newradius;
    }
    
    public Circle(double newradius , String newcolor , boolean newfilled){
        this.radius = newradius;
        this.color = newcolor;
        this.filled = newfilled;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newradius){
        this.radius = newradius;
    }

    public double getArea(){
        return this.radius * this.radius * PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * PI;
    }
    public double getDiameter(){
        return this.radius * 2;
    }
    
    public void printCircle(){}



}
