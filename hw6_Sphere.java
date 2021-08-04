/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Sphere;

import java.util.*;

/**
 *
 * @author mruna
 */
public class Sphere {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double radius;
        double diameter;
        double circumference;
        double surfaceArea;
        double volume;

        System.out.println("What is your sphere's radius? ");
        radius = reader.nextDouble();

        diameter = calcDiameter(radius);
        System.out.println("Diameter: " + diameter);

        circumference = calcCircumference(radius);
        System.out.println("Circumference: " + circumference);

        surfaceArea = calcSurfaceArea(radius);
        System.out.println("Surface area: " + surfaceArea);

        volume = calcVolume(radius);
        System.out.println("Volume: " + volume);
    }

    public static double calcDiameter(double r) {
        double d = r * 2;
        return d;
    }

    public static double calcCircumference(double r) {
        double c = Math.PI * Math.sqrt(r);
        return c;
    }

    public static double calcSurfaceArea(double r) {
        double sa = 4 * Math.PI * Math.sqrt(r);
        return sa;
    }

    public static double calcVolume(double r) {
        double v = 4 / 3 * Math.PI * Math.cbrt(r);
        return v;
    }

}
