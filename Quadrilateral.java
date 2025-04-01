/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polygon;

/**
 *
 * @author user
 */
public class Quadrilateral {
     public Quadrilateral() {
        System.out.println("Hello Student");
    }

    
    public Quadrilateral(String type) {
        System.out.println("Quadrilateral Type: " + type);
    }

    
    public Quadrilateral(String name, String type) {
        System.out.println("User: " + name + ", Quadrilateral Type: " + type);
    }

    
    public static int getArea(int side) { 
        return side * side;
    }

    public int getArea(int length, int width) {
        return length * width;
    }

    public double getArea(double a, double b, double h) {
        return ((a + b) * h) / 2;
    }
}
