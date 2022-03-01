public class Triangle extends shape{
    int base;
    int height;

    public Triangle(int dim1 , int dim2){
        super(dim1, dim2);
        base = dim1;
        height = dim2;
    }

    public double area() {
        //System.out.println(width * height);
        return base * height * 0.5;
    }
}
