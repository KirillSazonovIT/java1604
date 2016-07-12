/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author Кирилл
 */
public class Train {
      
        private String destination;
        private int number;
        private String time;
        private int numberPlacesGeneral;
        private int numberPlacesCompartment;
        private int numberPlacesReservedSeat;
        private int numberPlacesLuxury;

        Train (String destination, int number, String time, int numberPlacesGeneral,
                int numberPlacesCompartment, int numberPlacesReservedSeat, int numberPlacesLuxury){
            
            this. destination = destination;
            this. number = number;
            this. time = time;
            this. numberPlacesGeneral = numberPlacesGeneral;
            this. numberPlacesCompartment = numberPlacesCompartment;
            this. numberPlacesReservedSeat = numberPlacesReservedSeat;
            this. numberPlacesLuxury = numberPlacesLuxury;
        }
        public String toString1(){
            System.out.println("Пункт назначения: " + destination + "Время отправления " + time + "Номер поезда " + number);
            return this.destination + this.time +this.number;
        }
        public String toString2(){
            System.out.println("Пункт назначения: " + destination + "Время отправления " + time + "Номер поезда " + number + 
                               " Кол-во общих мест " + numberPlacesGeneral);
            return this.destination + this.time +this.number + this.numberPlacesGeneral;
        }
    
    
}
