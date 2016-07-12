/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Кирилл
 */
public class Car {
         
        private String mark;
        private String model;
        private int yearIssue;
        private String color;
        private int price;
        private String namber;

        Car (String mark, String model, int yearIssue, String color,
                int price, String namber){
            
            this. mark = mark;
            this. model = model;
            this. yearIssue = yearIssue;
            this. color = color;
            this. price = price;
            this. namber = namber;
        }
        public String toString1(){
            System.out.println(mark + model);
            return this.mark + this.model;
        }
        public String toString2(){
            System.out.println(mark + model + yearIssue);
            return this.mark + this.model + this.yearIssue;
        }
        public String toString3(){
            System.out.println(mark + model + yearIssue + " " + price);
            return this.mark + this.model + this.yearIssue + this.price;
        }
    
}
