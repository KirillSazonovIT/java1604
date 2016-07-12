/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.basictypes;
import java.util.Scanner;
/**
 *
 * @author Кирилл
 */
public class Task5 {
    
    public static void main(String[] args) {
        int dozensOf;
        int units;
      
        Scanner entry = new Scanner (System.in);
        System.out.println("Введите значение от 0 до 99");
        int number = entry.nextInt();

        if(number < 0 || number > 100){
            System.out.println("Вы ввели неверное значение");
        }
        
        if(number == 0){
            System.out.println("Ноль");
        }
        
        units = number %10;
        dozensOf = number/10;
        
        if(number >=10 && number <20) {
            switch (number){
                case 0:{
                    System.out.println("Ноль");
                }
                case 10:{
                    System.out.print("Десять ");
                }break;
                case 11:{
                    System.out.print("Одинадцать ");
                }break;
                case 12:{
                    System.out.print("Двенедцать ");
                }break;
                case 13:{
                    System.out.print("Тринадцать ");
                }break;
                case 14:{
                    System.out.print("Четырнадцать ");
                }break;
                case 15:{
                    System.out.print("Пятнадцать ");
                }break;
                case 16:{
                    System.out.print("Шестнадцать ");
                }break;
                case 17:{
                    System.out.print("Семнадцать ");
                }break;
                case 18:{
                    System.out.print("Восемнадцать ");
                }break;
                case 19:{
                    System.out.print("Девятнадцать ");
                }break;
                default:{
                }     
            }
        }else{
            switch(dozensOf){
                case 2:{
                    System.out.print("Двадцать ");
                }break;
                case 3:{
                    System.out.print("Тридцать ");
                }break;
                case 4:{
                    System.out.print("Сорок ");
                }break;
                case 5:{
                    System.out.print("Пятьдесят ");
                }break;
                case 6:{
                    System.out.print("Шестьдесят ");
                }break;
                case 7:{
                    System.out.print("Семдесят ");
                }break;
                case 8:{
                    System.out.print("Восемьдесят ");
                }break;
                case 9:{
                    System.out.print("Девяносто ");
                }break;
                default :{
                }
            }
            switch (units){
                case 1:{
                    System.out.print("один ");
                }break;
                case 2:{
                    System.out.print("два ");
                }break;
                case 3:{
                    System.out.print("три ");
                }break;
                case 4:{
                    System.out.print("четыре ");
                }break;
                case 5:{
                    System.out.print("пять ");
                }break;
                case 6:{
                    System.out.print("шесть ");
                }break;
                case 7:{
                    System.out.print("семь ");
                }break;
                case 8:{
                    System.out.print("восемь ");
                }break;
                case 9:{
                    System.out.print("девять ");
                }break;
                default :{
                }
            }
        }
    }   
}
