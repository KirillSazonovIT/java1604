/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recording;
import java.util.*;
/**
 *
 * @author Кирилл
 */
public class Disk {
    
    private int durationMin = 0;
    private int durationSek = 0;
    private ArrayList<String> disk = new ArrayList<String>();
    
    void addDisk(MusicComposition mc){
        durationMin += mc.getDurationMin();
        durationSek += mc.getDurationSek();
        disk.add(mc.getAftarName());        
    }
    
    int getDurationMin(){return durationMin;}
    int getDurationSek(){return durationSek;}
    
    void sort(MusicComposition mc){
        if(mc.getDurationMin() >= 4 & mc.getDurationMin() <= 5){
            if(mc.getDurationSek() >= 20 & mc.getDurationSek() <= 39)
            System.out.println(mc.getAftarName());
        }
    }
    
    void printDisk(){
        for(String n : disk){
            System.out.println("" +n);
        }
    }
    
    
}
