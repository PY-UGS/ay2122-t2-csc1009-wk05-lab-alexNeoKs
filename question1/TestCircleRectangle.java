public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circleobject = new Circle(1);
        
        System.out.println("A circle " + circleobject.toString());
        System.out.println("The color is " + circleobject.getColor());
        System.out.println("The radius is " + circleobject.getRadius());
        System.out.println("The area is " + circleobject.getArea());
        System.out.println("The diameter is " + circleobject.getDiameter());

        Rectangle rectangleobject = new Rectangle(2,4);
        System.out.println("\nA rectangle " + rectangleobject.toString());
        System.out.println("The area is " + rectangleobject.getArea());
        System.out.println("The peremeter is " + rectangleobject.getPerimeter());
    }
}
