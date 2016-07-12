/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.java1604.arrays;
import java.util.Arrays;
/**
 *
 * @author Кирилл
 */
public class Task3 {

    public static void main(String[] args) {
        
        int arr[][] = {
            {0,1},
            {3,4}            
        };
        int arr1[][] = new int[2][2];
        
           System.arraycopy(arr[0], 1, arr1[0], 0, 1);
           System.arraycopy(arr[1], 0, arr1[1], 0, 1);
           
           System.arraycopy(arr1[0], 0, arr[1], 0, 1);
           System.arraycopy(arr1[1], 0, arr[0], 1, 1);
           
            for(int i = 0; i < 2; i++){
                 for(int j = 0; j < 2; j++)
                     System.out.print(arr[i][j] + "");
                     System.out.println();
            }
    }    
}
