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
public class Trapezium implements Polygon {
    private String name = "Trapezium";
    private int sides = 4;
    
    
    public String getName() {
        return name;
    }
    

    public int getNumberOfSides() {
        return sides;
    }
    
   
    public int totalIntAngleSum() {
        return (sides - 2) * 180;
    }
    
    public static void Message() {
        System.out.println("Thank you for using the program!");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter small base: ");
        double a = scanner.nextDouble();
        System.out.print("Enter big base: ");
        double b = scanner.nextDouble();
        System.out.print("Enter height: ");
        double h = scanner.nextDouble();
        
        
        new Quadrilateral();
        
        Trapezium trap = new Trapezium();
        System.out.println("Polygon Name: " + trap.getName());
        System.out.println("Number of Sides: " + trap.getNumberOfSides());
        System.out.println("Total Interior Angle Sum: " + trap.totalIntAngleSum());
        System.out.println("Area of Trapezium: " + new Quadrilateral().getArea(a, b, h));
        
        
        Message();
         Quadrilateral.showHistory();
        
    }
}

