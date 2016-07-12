/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HikingTours;

/**
 *
 * @author Кирилл
 */
public class Vouchers {
    
    String nameTours;
    String type;
    String transport;
    int day;
    int food;
    
    Vouchers( String nameTours, String type, String transport,
              int day, int food){
        
        this.nameTours = nameTours;
        this.type = type;
        this.transport = transport;
        this.day = day;
        this.food = food;
        
    }
    

    
}
