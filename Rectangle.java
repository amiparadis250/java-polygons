/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polygon;

/**
 *
 * @author ISHIMWE Ami Paradis
 */
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        
        Quadrilateral rect = new Quadrilateral("Student", "Rectangle");
        System.out.println("Area of Rectangle: " + rect.getArea(length, width));
        
        
         Quadrilateral.showHistory();
    }
}
