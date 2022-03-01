public class Circle extends shape{
    int radius;
    public static final double PI = 3.14159265358979323846;

    public Circle(int dim1,int dim2){
        super(dim1, dim2);
        radius = dim1;
    }

    public double area() {
        //System.out.println(width * height);
        return radius * radius * PI;
    }
}
