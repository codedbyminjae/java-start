package oop1.ex;

public class Rectangle {
    int width, height;

    int rectangleArea() {
        return width * height;
    }

    int rectanglePerimeter() {
        return 2 * (width + height);
    }

    // 지역번수와 매개변수 이름이 필드 이름과 같을때는 this로 설정
    boolean isSquare() {
        return width ==  height;
    }
}
