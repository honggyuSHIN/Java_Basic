package oop01.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Ractangle ractangle=new Ractangle();

        int area = ractangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = ractangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = ractangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
