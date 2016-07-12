
package uits.java1604.interfaces;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Кирилл
 */
public class Basket extends Plant implements Peellable {
    
    double heft;
    int i;
    ArrayList basket = new ArrayList<String>();
    
    Basket(){
        
    }
    
        public double getPell(){
            if(cleared == false){
            heft = heft - ((heft*2)/100);}
            cleared = true;
            return heft;
        }  
        
        // Корзина фруктов
        
        public void basketFruit(Fruit frut[]){
            for( int i = 0; i<4;i++){
                basket.add(frut[i]);  
            }
        }
        
        // Корзина овощей
                    
        public void basketVegetable(Vegetable veg[]){
               for( int i = 0; i<4;i++){
                    basket.add(veg[i]);  
                }
        }
        
        // Вывод корзины
                                        
        public void print(){
            for( int i = 0; i < basket.size();i++){
                System.out.println(basket.get(i));
            }
        }
        
        // Удаление элемента
        
        public void printdell(){
            basket.remove(0);
                for( int i = 0; i < basket.size();i++){
                    System.out.println(basket.get(i));
            }
        }
        
        // Очистка корзины
        
        public void printclear(){
            basket.clear();
                System.out.println(basket);        
        }          

        public static void main(String[] args) {
       
            Fruit frut[] = new Fruit[4];

                frut[0] = new Fruit("Яблоко ","Зелёное ",0.412,true," Хорошее ", false);
                frut[1] = new Fruit("Груша ","Зелёная ",0.500,true," Отличное ", false);
                frut[2] = new Fruit("Банан ","Желтый ",0.350,true," Нормальное ", false);
                frut[3] = new Fruit("Апельсин ","Оранжевый ",0.421,true," Плохое ", false);     

            Vegetable veg[] = new Vegetable[4];

                veg[0] = new Vegetable("Картофель ","Белый ",2,true," Нормальное ", false);
                veg[1] = new Vegetable("Морковь ","Оражевый ",1,true," Отличное ", false);
                veg[2] = new Vegetable("Сельдерей ","Зелёный ",1.2,true," Нормальное ", false);
                veg[3] = new Vegetable("Лук ","Белый ",0.100,true," Плохое ", false);
                
           
            Basket b = new Basket();
            b.heft = 0;
            b.basketFruit(frut);
            b.basketVegetable(veg);
            b.print();
            System.out.println();
            b.printdell();
            System.out.println();
            b.printclear();


        }
}
