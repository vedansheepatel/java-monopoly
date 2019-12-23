/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author dhshp
 */
public class Jail extends Location{
    private String name;
    private int number;
    
    public Jail (String name, int number){
        super (name, number);
    }
    public String printToScreen(){
        return "You are at the Jail Sqaure";
    }
}
