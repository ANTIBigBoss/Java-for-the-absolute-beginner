// Define an interface Shape
interface Shape {
    void draw();
}

// Define a Circle class that implements Shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Define a Rectangle class that implements Shape
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of the different classes and assign them to Shape type
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        // Call the draw method on each object
        myCircle.draw(); // Output: Drawing a circle
        myRectangle.draw(); // Output: Drawing a rectangle
    }
}
