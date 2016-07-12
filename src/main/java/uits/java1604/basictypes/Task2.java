/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.basictypes;

/**
 *
 * @author Кирилл
 */
public class Task2 {
    
    public static void main (String[] args){
        
        double circumference;
        double circleArea;
        double ringArea;
        double radius = 3;
        double radiusOP = 8;
        
        circumference = 2 * Math.PI * radius;
        circleArea = Math.PI * Math.pow(radius, 2);
        ringArea = Math.PI * (Math.pow(radiusOP,2) - Math.pow(radius,2));
        
        System.out.println("\nДлинна окружности равна: " +circumference);
        System.out.println("Площадь окружности равно: " +circleArea);
        System.out.println("Площадь круга равна:" +ringArea);
    }    
}
