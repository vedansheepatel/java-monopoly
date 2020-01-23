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
    * @param newPosition (the position to move the player to)
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
     * @param p take in the property to be mortgaged
     * @param price price of the property to be mortgaged
     */
    public void mortgage(Property p, int price){
        //check if property is not already mortgaged
        if (p.isMortgaged == false){
            //let player know the amount they will recieve 
            JOptionPane.showMessageDialog(null, "You recieved $" + price/2 + " for mortgaging this property");
            balance = balance + (price/2); 
            //property will become mortgaged
            p.isMortgaged = true;
    }else{
            //can not mortgage a property already mortgaged 
            JOptionPane.showMessageDialog(null, "This property is already mortgaged");
        }
    }
    /**
     * unmortgage a mortgaged property
     * @param p the property that needs to be unmortgaged
     * @param price of the property 
     */
    public void removeMortgage(Property p, int price){
        //check if property is mortgaged 
        if (p.isMortgaged == true){
            //tell player the amount they paid
            JOptionPane.showMessageDialog(null, "You payed " + ((price/2)*1.10) + " to unmortgage your property." );
            balance = balance - ((price/2)*1.10);
           //property taken out of mortgage 
            p.isMortgaged = false;
        }else{
          //property needs to be mortgaged inorder to take out of the mortgage
            JOptionPane.showMessageDialog(null, "This property is already unmortgaged");
        }
    }
/**
 * add a purchased property to the player's list of properties
 * @param p property to be purchased 
 * @param price of the property
 */
    public void addProperty(Property p, int price) {
        //if property is not owned
        if (p.isOwned() == false) {
            //buy the property
            //add property to the list
            balance = balance - price;
            this.allProperties.add(p);
            //property becomes owned 
            p.isOwned = true;
        } else {
            //can not buy an owned property
            JOptionPane.showMessageDialog(null, "This property is already owned");
        }

    }
    /**
     * Get the total number of properties owned 
     * @return the number of properties on the property list 
     */
    public int getNumOfProperties(){
        return allProperties.size();
    }
    /**
     * Look for a specific property name in owned properties list
     * @param name of the property the player is searching for
     * @return the name of the property
     */
   public String findProperty (String name){
       for (Property p : this.allProperties){
           //if property is found return the property
           if (p.getName().equals(name)){
               return p.getName();
          }
       }
       // else return nothing 
      return "";
  }
   /**
    * look for a specific property
    * @param name of the property that is being searched for
    * @return the whole property
    */
   public Property findPropertyP (String name){
       //if found return the property
       for (Property p : this.allProperties){
           if (p.getName().equals(name)){
               return p;
          }
       }
       // else return null 
      return null; 
      
  }

   /**
    * Get all the properties the players own
    * @return the array list of the owned properties
    */
    public ArrayList<Property> getProperties() {
        return this.allProperties;
    }
    
    /**
     * change players position when die face is 1
     * @param die 
     */
    public void add1(Die die) {
        position = (position + 1);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
            JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }
    }
    /**
     * change players position when die face is 2
     * @param die 
     */
    public void add2(Die die) {
        position = (position + 2);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }
    /**
     * change players position when die face is 3
     * @param die 
     */
    public void add3(Die die) {
        position = (position + 3);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }
    /**
     * change players position when die face is 4
     * @param die 
     */
    public void add4(Die die) {
        position = (position + 4);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }
    /**
     * change players position when die face is 5
     * @param die 
     */
    public void add5(Die die) {
        position = (position + 5);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }

    }
    /**
     * change players position when die face is 6
     * @param die 
     */
    public void add6(Die die) {
        position = (position + 6);
        if(position > 39){
            position = position  % 40;
            balance = balance + 200;
             JOptionPane.showMessageDialog(null, "You have passed Go Sqaure! $200 recieved!");
        }
    }


    //getter methods 
    /**
     * Get the name of the player
     * @return the name 
     */
    public String getName() {
        return this.name;
    }
    /**
     * get the balance of the player
     * @return the balance
     */
    public double getBalance() {
        return this.balance;
    }
}
