/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patev6618
 */
public class Player {
    //instance variables 
    private Board board;
    private String name;
    private double balance;
    private int position;
    private Property property;
    boolean isTurn;
    private ArrayList<Property> allProperties;
//player constructor 
    //name, balance, position, irTurn
    public Player(String name, double balance, int position, boolean isTurn) {
        this.name = name;
        this.balance = 1500.00;
        this.position = 0;
        this.allProperties = new ArrayList<>();
        
    }
    
    /**
     * add to the balance of the player
     * @param moneyAmount that is to be added
     */
    public void addMoney(double moneyAmount) {
        this.balance = moneyAmount + balance;
    }
 
    /**
     * withdraw from the balance of the player
     * @param moneyAmount that is to be withdrawn
     */
    public void takeMoney(double moneyAmount) {
        if (balance > moneyAmount) {
            this.balance = balance - moneyAmount;
        }
    }
     
   /**
    * set player to a specific position
    * @param newPosition
    * @return the new position of the player
    */
    public int setPosition(int newPosition){
        position = newPosition;
        return position;
    }
    /**
    *get what position the player is in 
    * @return the position of the player
    */
    public int getCurrentPosition() {
        return this.position;
    }
    /**
     * mortgage a property
     * @param p
     * @param price 
     */
    public void mortgage(Property p, int price){
        if (p.isMortgaged == false){
            JOptionPane.showMessageDialog(null, "You recieved $" + price/2 + " for mortgaging this property");
            balance = balance + (price/2); 
            p.isMortgaged = true;
    }else{
            JOptionPane.showMessageDialog(null, "This property is already mortgaged");
        }
    }
    public void removeMortgage(Property p, int price){
        if (p.isMortgaged == true){
            JOptionPane.showMessageDialog(null, "You payed " + ((price/2)*1.10) + " to unmortgage your property." );
            balance = balance - ((price/2)*1.10);
            p.isMortgaged = false;
        }else{
            JOptionPane.showMessageDialog(null, "This property is already unmortgaged");
        }
    }

    public void addProperty(Property p, int price) {
        if (p.isOwned() == false) {
            balance = balance - price;
            this.allProperties.add(p);
            p.isOwned = true;
        } else {
            JOptionPane.showMessageDialog(null, "This property is already owned");
        }

    }
    public int getNumOfProperties(){
        return allProperties.size();
    }
    
   public String findProperty (String name){
       for (Property p : this.allProperties){
           if (p.getName().equals(name)){
               return p.getName();
          }
       }
      return "";
  }
   public Property findPropertyP (String name){
       for (Property p : this.allProperties){
           if (p.getName().equals(name)){
               return p;
          }
       }
      return null; 
      
  }


    public ArrayList<Property> getProperties() {
        return this.allProperties;
    }

    public void add1(Die die) {
        position = (position + 1);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
            JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }
    }

    public void add2(Die die) {
        position = (position + 2);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }

    public void add3(Die die) {
        position = (position + 3);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }

    public void add4(Die die) {
        position = (position + 4);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }

    public void add5(Die die) {
        position = (position + 5);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }

    public void add6(Die die) {
        position = (position + 6);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }
    }


    //getter methods 
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }
}
