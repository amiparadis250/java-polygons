package Polygon;

import java.util.Scanner;

public class Square extends Quadrilateral {
    public Square(String name) {
              super(name); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Square square = new Square("Square");

        System.out.print("Enter the side of the square: ");
        int side = scanner.nextInt();
       System.out.println("Area of Square: " + Quadrilateral.getArea(side));
    }
}

