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
public class Vegetable extends Plant implements Peellable {
    
    public double getPell(){
        if(cleared == false){
        heft = heft - ((heft*5)/100);}
        cleared = true;
        return heft;
    }
    
    Vegetable(String name, String color, double heft, 
          boolean ripeness, String condition, boolean cleared){
        
        super(name, color,heft,ripeness,condition,cleared);
    }
    
    public String toString(){
        return this.name + " Цвет:" + this.color +  " Вес " + this.heft + " Зрелость " +
               this.ripeness + " Кондиция " + this.condition + " Очищен " + this.cleared;
    }
    
        
    public static void main(String[] args) { 
   
        Vegetable veg[] = new Vegetable[4];

        veg[0] = new Vegetable("Картофель ","Белый ",2,true," Нормальное ", false);
        veg[1] = new Vegetable("Морковь ","Оражевый ",1,true," Отличное ", false);
        veg[2] = new Vegetable("Сельдерей ","Зелёный ",1.2,true," Нормальное ", false);
        veg[3] = new Vegetable("Лук ","Белый ",0.100,true," Плохое ", false);
        
            for(int i = 0; i < 4; i++){
                System.out.println(veg[i]); 
            }
            
                System.out.println("\n После очистки получим\n");
                
           for(int i = 0; i < 4; i++){
               veg[i].getPell();
               System.out.println(veg[i]);
            }

    }
    
}
