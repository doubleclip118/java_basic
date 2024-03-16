package oop1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.width = 5;
        a.height = 8;

        int area =a.calculateArea();
        System.out.println("area = " + area);
        int perimeter = a.calculatePerimeter();
        System.out.println("perimeter = " + perimeter);
        boolean flag = a.isSquare();
        System.out.println("flag = " + flag);


    }
}
