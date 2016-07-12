/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train;

/**
 *
 * @author Кирилл
 */
public class App {
    public static void main(String[] args) {
        
        RailwayCarriage rc1 = new RailwayCarriage_one();
        RailwayCarriage rc2 = new RailwayCarriage_two();
        RailwayCarriage rc3 = new RailwayCarriage_three();
        
        Train t1 = new Train();
        t1.addTrain(rc1);
        t1.addTrain(rc2);
        t1.addTrain(rc3);
        
        System.out.println("Номера вагонов поезда: ");
        t1.printTrain();
        
        System.out.println("Пассажиров: " + t1.getPassengers());
        System.out.println("Багаж: " + t1.getBaggage() + "кг.");
        
        System.out.println("");
        
        System.out.println("Вагоны, в которых распологаются кол-во пассажиров соответствующее заданному диапазону");
        t1.range(rc1);
        t1.range(rc2);
        t1.range(rc3);
    }
    
}
