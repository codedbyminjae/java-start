package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.rectangleArea();
        System.out.println("area: " + area);

        int perimeter = rectangle.rectanglePerimeter();
        System.out.println("perimeter: " + perimeter);

        boolean isSquare = rectangle.isSquare();
        System.out.println("isSquare: " + isSquare);
    }
}
