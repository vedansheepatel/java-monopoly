/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;

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
    private int dieRoll;
//    private int leaveJailFree;
//    private boolean isInJail;
    private ArrayList<Property> allProperties;

    public Player(String name, int balance, int position) {
        this.name = name;
        this.balance = 1500;
        this.position = 0;

    }

    public void addMoney(int moneyAmount) {
        this.balance = moneyAmount + balance;
    }

    public void takeMoney(int moneyAmount) {
        if (balance > moneyAmount) {
            this.balance = balance - moneyAmount;
        }
    }

    public int getCurrentPosition() {
        return this.position;
    }

    // public void setPosition(int position) {
    //   this.position = position;
    //}
    public int dieRoll(Die die) {
        return die.getFace();
    }

    public void purchaseProperty() {
        if (property.isOwned() == false) {
            balance = balance - property.getPrice();
            this.allProperties.add(property);
        } else {
            System.out.println("This property is already owned. You can not buy it.");
        }
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
