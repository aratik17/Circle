package Circle;

public class RectanglePerimeter {
    int length;
    int breadth;

    public RectanglePerimeter(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(6, 9);
        rect.display();
    }
}

