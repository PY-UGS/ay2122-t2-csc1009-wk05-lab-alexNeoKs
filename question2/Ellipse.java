public class Ellipse extends shape{
    int a;
    int b;
    public static final double PI = 3.14159265358979323846;

    public Ellipse(int dim1,int dim2){
        super(dim1, dim2);
        a= dim1;
        b = dim2;
    }

    public double area() {
        //System.out.println(width * height);
        return b * a * PI;
    }
}
