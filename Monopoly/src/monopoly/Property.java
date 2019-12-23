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
public class Property extends Location {
    private String name;
    private int number;
    private int price;
    private int rent;
    private boolean isOwned;
    
    public Property (String name, int number, int price, int rent, boolean isOwned){
        super (name, number);
        this.price = price;
        this.rent = rent;
        isOwned = false;
    }
    
    public int getPrice(){
        return price;
    }
    
}

