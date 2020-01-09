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

    private String name;
    private int balance;
    private int position;
//    private int leaveJailFree;
//    private boolean isInJail;
    private ArrayList<Property> allProperties;

    public Player(String name, int balance, int position) {
        this.name = name;
        this.balance = balance;
        this.position = position;
    }

    public void addMoney(int moneyAmount) {
        this.balance = moneyAmount + balance;
    }

    public void takeMoney(int moneyAmount) {
        if (balance > moneyAmount) {
            this.balance = balance - moneyAmount;
        }
        //add an else statement here  
    }

    public int getCurrentPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int rollDie(Die die) {
        return die.getFace();
    }

    public void purchaseProperty() {

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
