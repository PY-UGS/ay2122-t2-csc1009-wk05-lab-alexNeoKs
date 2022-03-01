public class Rectangle extends GeometricObject{
    double width;
    double height;

    public Rectangle(){}

    public Rectangle(double newwidth , double newheight){
        width = newwidth;
        height = newheight;
    }

    public Rectangle(double newwidth , double newheight, String newcolor , boolean newfilled){
        this.width = newwidth;
        this.height = newheight;
        this.color = newcolor;
        this.filled = newfilled;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double newwidth){
        this.width = newwidth;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double newheight){
        this.height = newheight;
    }

    public double getArea(){
        return this.height *this.width;
    }
    public double getPerimeter(){
        return this.height + this.width + this.height + this.width;
    }


}
