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
public abstract class Aircraft {
    
    abstract String getName();
    abstract int getCapacity();
    abstract int getRange();
    abstract double getCarrying();
    abstract double getFuelDemand();
    
}
