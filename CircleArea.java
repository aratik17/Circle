package Circle;

public class CircleArea {
    double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public void display() {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        CircleArea circle = new CircleArea(7.0);
        circle.display();
    }
}

