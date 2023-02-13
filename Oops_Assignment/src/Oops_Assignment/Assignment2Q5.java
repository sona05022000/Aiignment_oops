package Oops_Assignment;

abstract class Shape {
    abstract public void draw();
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Line");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Cube extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Cube");
    }
}

public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape s1 = new Line();
        Shape s2 = new Rectangle();
        Shape s3 = new Cube();
        
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

