package Polygon;

import java.util.ArrayList;

public class Quadrilateral {
    static ArrayList<String> activityLog = new ArrayList<>();
  static {
        activityLog.add("User started the program.");
    }
    public Quadrilateral() {
        System.out.println("Hello Student");
        activityLog.add("Displayed greeting message.");
    }

    public Quadrilateral(String type) {
        System.out.println("Quadrilateral Type: " + type);
        activityLog.add("Created Quadrilateral of type: " + type);
    }

    public Quadrilateral(String name, String type) {
        System.out.println("User: " + name + ", Quadrilateral Type: " + type);
        activityLog.add("User " + name + " created Quadrilateral of type: " + type);
    }

    public static int getArea(int side) {
        activityLog.add("Calculated area of square with side " + side);
        return side * side;
    }

    public static int getArea(int length, int width) {  
        activityLog.add("Calculated area of rectangle with length " + length + " and width " + width);
        return length * width;
    }

    public static double getArea(double a, double b, double h) {
        activityLog.add("Calculated area of trapezium with bases " + a + " and " + b + " and height " + h);
        return ((a + b) * h) / 2;
    }

    public static void showHistory() {
        System.out.println("\nActivity Log:");
        for (String activity : activityLog) {
            System.out.println(activity);
        }
    }
}
