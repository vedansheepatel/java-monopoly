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
    private ArrayList<Property> allProperties;
 
    

    public Player(String name, int balance, int position) {
        this.name = name;
        this.balance = 1500;
        this.position = 0;
        this.allProperties = new ArrayList<>();
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

   

    public void addProperty(Property p) {
         this.allProperties.add(p);
    }
    public ArrayList<Property> getProperties(){
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
