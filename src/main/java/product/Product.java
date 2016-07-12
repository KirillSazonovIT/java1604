/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product;

/**
 *
 * @author Кирилл
 */
public class Product {
            
        private String name;
        private int ups;
        private String manufacturer;
        private int price;
        private int storagLife;
        private int quantity;

        Product (String name, int ups, String manufacturer, int price,
                int storagLife, int quantity){
            
            this. name = name;
            this. ups = ups;
            this. manufacturer = manufacturer;
            this. price = price;
            this. storagLife = storagLife;
            this. quantity = quantity;
        }
        public String toString1(){
            System.out.println(name + manufacturer);
            return this.name + this.manufacturer;
        }
        public String toString2(){
            System.out.println(name + manufacturer + "Цена " + price);
            return this.name + this.manufacturer + this.price;
        }
        public String toString3(){
            System.out.println(name + manufacturer + "Срок хранения " + storagLife + "месяцев");
            return this.name + this.manufacturer + this.storagLife;
        }
    
}
