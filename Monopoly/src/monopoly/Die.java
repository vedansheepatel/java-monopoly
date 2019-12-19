/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author patev6618
 */
public class Die {
  
    
    //generate a die roll randomlys
    public int getFace(){
        int face = (int) ((Math.random() * 5)+ 1);
        return face;
        
    }
    
}
