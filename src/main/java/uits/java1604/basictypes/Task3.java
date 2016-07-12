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
public class Task3 {
    
    public static void main (String[] args){
        
        double cylinderVolume;
        double cylinderVolumeFull;
        double areaSideCylinder;
        double heightCylinder = 5;
        double radius = 2;
        double radius1 = 4;
        double radius2 = 7;
        
        cylinderVolume = Math.PI * Math.pow(radius, 2) * heightCylinder;
        cylinderVolumeFull = Math.PI * heightCylinder * (Math.pow(radius2, 2) - Math.pow(radius1, 2));
        areaSideCylinder = 2 * Math.PI * radius * heightCylinder;
        
        System.out.println("Объём цилиндра: " +cylinderVolume);
        System.out.println("Объём полого цилиндра: " +cylinderVolumeFull);
        System.out.println("Площадь боковой поверхности не полого цилиндра: " +areaSideCylinder);
        
  
    }    
}
