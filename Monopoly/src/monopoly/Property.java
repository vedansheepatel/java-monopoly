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
public class Property extends Location {

    private int price;
    private int rent;
    private boolean isOwned;
    private Player owner;

    public Property(String name, int positionX, int positionY, int price, int rent, boolean isOwned) {
        super(name, positionX, positionY);
        this.price = price;
        this.rent = rent;
        this.isOwned = false;

    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public boolean isOwned() {
        return isOwned;
    }

}
