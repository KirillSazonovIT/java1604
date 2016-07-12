/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HikingTours;
import java.util.Scanner;
/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        int day = 0;
        int food = 0;
        String[] tr ={"Самолёт ", "Автобус ", "Поезд "};
        String t = " ";
        
        Vouchers v1 = new Vouchers("№ 1 Мальдивы ", " Отдых ", t, day, food);
        Vouchers v2 = new Vouchers("№ 2 Львов ", " Экскурсия ", t, day, food);
        Vouchers v3 = new Vouchers("№ 3 Моршин ", " Лечение ", t, day, food);
        
        Set s = new Set();
        s.addSet(v1);
        s.addSet(v2);
        s.addSet(v3);
        
        System.out.println("Доступные туры: \n");
        s.printSet();
        
        Scanner c = new Scanner(System.in);
        System.out.println("\nВыберите путёвку по номеру из списка: ");
        int number = c.nextInt();
        
        switch(number){
            
            case 1:{               
                
                    System.out.println("\nВы выбрали " + v1.nameTours);
                
                // Выбор кол-ва дней
                    s.addDay();
                    v1.day = s.days;
                
                // Выбор кол-ва питания
                    s.addFood();
                    v1.food = s.food;
                
                // Выбор транспорта
                    s.addTransport();
                    v1.transport = tr[s.tr];
                
                // Задаём параметры стоимости
                    s.OneDayPrice = 100;
                    s.OneFoodDayPrice = 30;
                    s.AircraftPrice = 2500;
                    s.BusPrice = 1500;
                    s.TrainPrice = 700;
                  
                // Вычисляем стоимость в зависимости от заданных характеристик
                    s.priceDay = v1.day * s.OneDayPrice;
                    s.priceFood();
                    s.priceTransport();
                    

                    System.out.println("Общая стоимость выбранной путёвки равно: " + s.priceDay);
            }break;
            
            case 2:{
                
                    System.out.println("\nВы выбрали " + v2.nameTours);
                
                // Выбор кол-ва дней
                    s.addDay();
                    v1.day = s.days;
                
                // Выбор кол-ва питания
                    s.addFood();
                    v1.food = s.food;
                
                // Выбор транспорта
                    s.addTransport();
                    v1.transport = tr[s.tr];
                
                // Задаём параметры стоимости
                    s.OneDayPrice = 20;
                    s.OneFoodDayPrice = 30;
                    s.AircraftPrice = 1000;
                    s.BusPrice = 500;
                    s.TrainPrice = 300;
                  
                // Вычисляем стоимость в зависимости от заданных характеристик
                    s.priceDay = v1.day * s.OneDayPrice;
                    s.priceFood();
                    s.priceTransport();
                    

                    System.out.println("Общая стоимость выбранной путёвки равно: " + s.priceDay);
            }break;  
            
            case 3:{
                
                    System.out.println("\nВы выбрали " + v3.nameTours);
                
                // Выбор кол-ва дней
                    s.addDay();
                    v1.day = s.days;
                
                // Выбор кол-ва питания
                    s.addFood();
                    v1.food = s.food;
                
                // Выбор транспорта
                    s.addTransport();
                    v1.transport = tr[s.tr];
                
                // Задаём параметры стоимости
                    s.OneDayPrice = 200;
                    s.OneFoodDayPrice = 25;
                    s.AircraftPrice = 700;
                    s.BusPrice = 400;
                    s.TrainPrice = 150;
                  
                // Вычисляем стоимость в зависимости от заданных характеристик
                    s.priceDay = v1.day * s.OneDayPrice;
                    s.priceFood();
                    s.priceTransport();
                    

                    System.out.println("Общая стоимость выбранной путёвки равно: " + s.priceDay);
            }break;            
        }
        
    }
    
}
