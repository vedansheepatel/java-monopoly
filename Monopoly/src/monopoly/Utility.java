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
public class Utility extends Location{
    
    private int price;
    private int mortgage;
    private boolean isOwned;
    
    public Utility (String name, int positionNumber, int price, int mortgage, boolean isOwned){
        super(name, positionNumber);
        this.price = price;
        this.mortgage = mortgage;
        isOwned = false;
    }
    public int getPrice(){
        return price;
    }
    public int getMortgage(){
        return mortgage;
    }
    public boolean isOwned(){
        return isOwned;
    }
}
