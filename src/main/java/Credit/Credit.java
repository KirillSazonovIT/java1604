/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credit;

/**
 *
 * @author Кирилл
 */
public class Credit {
    
    String nameBank;
    double procentBank;
    boolean dospog;
    boolean uvelcredline;
    
    Credit(String nameBank, double procentBank, boolean dospog, boolean uvelcredline){
        
        this.nameBank = nameBank;
        this.procentBank = procentBank;
        this.dospog = dospog;
        this.uvelcredline = uvelcredline;
    }
    
    public String toString(){
        System.out.println(nameBank + "Процентная ставка: " + procentBank + " Возможность досрочного погашения: " + dospog);
        return this.nameBank + this.procentBank + this.dospog;
    }
}
