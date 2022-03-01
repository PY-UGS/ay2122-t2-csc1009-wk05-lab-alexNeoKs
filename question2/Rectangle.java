public class Rectangle extends shape{
    int width;
    int height;

    public Rectangle(int dim1,int dim2){
        super(dim1, dim2);
        width = dim1;
        height = dim2;
    }

    public double area() {
        //System.out.println(width * height);
        return width * height;
    }
}
