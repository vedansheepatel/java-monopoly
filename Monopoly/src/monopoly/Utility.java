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
public class Utility extends Location{
    private String name;
    private int number;
    private int price;
    private int mortgage;
    private boolean isOwned;
    
    public Utility (String name, int number, int price, int mortgage, boolean isOwned){
        super(name, number);
        this.price = price;
        this.mortgage = mortgage;
        isOwned = false;
    }
}
