/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.interfaces;

/**
 *
 * @author Кирилл
 */


public class Fruit extends Plant implements Peellable{

    Fruit(){
    
      }
    public double getPell(){
        if(cleared == false){
        heft = heft - ((heft*2)/100);}
        cleared = true;
        return heft;
    }
    
    Fruit(String name, String color, double heft, 
          boolean ripeness, String condition, boolean cleared){
        
        super(name, color,heft,ripeness,condition,cleared);
    }
    
    public String toString(){
       // System.out.println(name);
        return this.name + " Цвет:" + this.color +  " Вес " + this.heft + " Зрелость " +
               this.ripeness + " Кондиция " + this.condition + " Очищен " + this.cleared;
    }
    
    
    public static void main(String[] args) { 
   
        Fruit frut[] = new Fruit[4];

        frut[0] = new Fruit("Яблоко "," Зелёное ",0.412,true," Хорошее ", false);
        frut[1] = new Fruit("Груша "," Зелёная ",0.500,true," Отличное ", false);
        frut[2] = new Fruit("Банан "," Желтый ",0.350,true," Нормальное ", false);
        frut[3] = new Fruit("Апельсин "," Оранжевый ",0.421,true," Плохое ", false);
        
            for(int i = 0; i < 4; i++){
                System.out.println(frut[i]); 
            }
            
                System.out.println("\n После очистки получим\n");
                
           for(int i = 0; i < 4; i++){
               frut[i].getPell();
               System.out.println(frut[i]);
            }

    }
}
