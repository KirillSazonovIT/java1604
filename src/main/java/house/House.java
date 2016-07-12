/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package house;

/**
 *
 * @author Кирилл
 */
public class House {
      
        private int apartmentNumber;
        private int area;
        private int floor;
        private int numberRooms;
        private String street;
        private String buildingType;
        private int lifetime;

        House (int apartmentNumber, int area, int floor, int numberRooms,
                String street, String buildingType,int lifetime){
            
            this. apartmentNumber = apartmentNumber;
            this. area = area;
            this. floor = floor;
            this. numberRooms = numberRooms;
            this. street = street;
            this. buildingType = buildingType;
            this. lifetime = lifetime;
        }
        public String toString1(){
            System.out.println(street + "Номер квартиры " + apartmentNumber + " Кол-во комнат " + numberRooms);
            return this.street + this.apartmentNumber + this.numberRooms;
        }
        public String toString2(){
            System.out.println(street + "Номер квартиры " + apartmentNumber + " Кол-во комнат " + numberRooms + " Этаж " + floor);
            return this.street + this.apartmentNumber + this.numberRooms + this.floor;
        }
        public String toString3(){
            System.out.println(street + "Номер квартиры " + apartmentNumber + " Площадь " + area);
            return this.street + this.apartmentNumber + this.area;
        }
    
}
