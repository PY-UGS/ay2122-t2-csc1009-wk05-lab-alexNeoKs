abstract class shape{

    public static final double PI = 3.14159265358979323846;
    int dim1;
    int dim2;

    public shape(int dim1,int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
    
}