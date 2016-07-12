/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

/**
 *
 * @author Кирилл
 */
public class Airline {
            
        private String destination;
        private int numberReys;
        private String typeAircraft;
        private String time;
        private String day;

        Airline (String destination, int numberReys, String typeAircraft, String time,
                String day){
            
            this. destination = destination;
            this. numberReys = numberReys;
            this. typeAircraft = typeAircraft;
            this. time = time;
            this. day = day;
        }
        public String toString1(){
            System.out.println("Пункт назначения: " + destination + "Тип самолёта: " + typeAircraft+ " Номер рейса " + numberReys);
            return this.destination + this.typeAircraft +this.numberReys;
        }
        public String toString2(){
            System.out.println("Пункт назначения: " + destination + "Тип самолёта: " + typeAircraft+ " Номер рейса " + numberReys +
                               " День недели: " + day + "Время вылета: " + time);
            return this.destination + this.typeAircraft + this.numberReys + this.day  + this.time;
        }
    
}
