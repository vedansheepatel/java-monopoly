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

    private Board board;
    private String name;
    private int balance;
    private int position;
    private Property property;
   boolean isTurn;
    private ArrayList<Property> allProperties;

    public Player(String name, int balance, int position, boolean isTurn) {
        this.name = name;
        this.balance = 1500;
        this.position = 0;
        this.allProperties = new ArrayList<>();
        
    }
    public boolean getTurn(){
        return isTurn;
    }
    //public int getRoll(Die die){
        //return die.getFace();
    //}
    public void addMoney(int moneyAmount) {
        this.balance = moneyAmount + balance;
    }

    public void takeMoney(int moneyAmount) {
        if (balance > moneyAmount) {
            this.balance = balance - moneyAmount;
        }
    }
    public int setPosition(int newPosition){
        position = newPosition;
        return position;
    }

    public int getCurrentPosition() {
        return this.position;
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
    

    public ArrayList<Property> getProperties() {
        return this.allProperties;
    }

    public void add1(Die die) {
        position = (position + 1) % 40;
    }

    public void add2(Die die) {
        position = (position + 2) % 40;
    }

    public void add3(Die die) {
        position = (position + 3) % 40;
    }

    public void add4(Die die) {
        position = (position + 4) % 40;
    }

    public void add5(Die die) {
        position = (position + 5) % 40;
    }

    public void add6(Die die) {
        position = (position + 6) % 40;
    }

//   public void isInJail(boolean isInjail){
//       
//   }
    //does this () need anything?
//   public void useLeaveJailForFree(){
//       if (leaveJailFree > 1){
//           leaveJailFree--;
//       }
//      
//   }
    //getter methods 
    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }
}
