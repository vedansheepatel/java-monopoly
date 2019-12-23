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
public class GoSqaure extends Location{
    
    private String name;
    private int number;
    
    public GoSqaure (String name, int number){
        super (name, number);
    }
    
    public String printToScreen(){
        return "You are in go square. Collect $100 from bank.";
    }
    
}
