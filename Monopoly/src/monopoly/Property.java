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
    boolean isOwned;
    private Player owner;
     
    public Property(String name, int positionX, int positionY, int price, int rent, boolean isOwned) {
        super(name, positionX, positionY);
        this.price = price;
        this.rent = rent;

    }
    @Override
    public String toString(){
        String n = super.getName();
        return n;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
      //  if (super.getName().equals("Water Works")|| super.getName().equals("Electricity Company")){
            
        //}else{
            //return rent;
      //  }
        return rent;
    }

    public boolean isOwned() {
        return isOwned;
    }

}
