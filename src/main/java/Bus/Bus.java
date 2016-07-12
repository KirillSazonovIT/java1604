/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus;

/**
 *
 * @author Кирилл
 */
public class Bus {
         
        private String driver;
        private int numberBus;
        private int numberRouting;
        private String mark;
        private int yearExploitation;
        private int mileage;

        Bus (String driver, int numberBus, int numberRouting, String mark, int yearExploitation,
                int mileage){
            
            this. driver = driver;
            this. numberBus = numberBus;
            this. numberRouting = numberRouting;
            this. mark = mark;
            this. yearExploitation = yearExploitation;
            this. mileage = mileage;
        }
        public String toString1(){
            System.out.println("Водитель: " + driver + "Номер автобуса " + numberBus + " Номер маршрута " + numberRouting);
            return this.driver + this.numberBus +this.numberRouting;
        }
        public String toString2(){
            System.out.println("Номер автобуса " + numberBus +" Марка "+ mark + " Номер маршрута " + numberRouting + 
                    " Срок эксплуатации " + yearExploitation + " Пробег " + mileage);
            return this.driver + this.numberBus +this.numberRouting + this.yearExploitation + this.mileage;
        }
    
    
}
