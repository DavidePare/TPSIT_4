/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fatt;

/**
 *
 * @author Studente
 */
public class Fatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        i=10;
        while(i!=0){
            fattoriale f=new fattoriale(i);
            f.start();
            i--;
            
        }
    }
    
}
