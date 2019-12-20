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
    private int leaveJailFree;
    private boolean isInJail;
    private ArrayList <Properties> allProperties;
    
    
   public Player(String name, int balance){
       this.name = name;
       this.balance = balance;
   } 
  
   
   public void addMoney(int moneyAmount){
       this.balance = moneyAmount + balance; 
   }
   public void takeMoney(int moneyAmount){
       this.balance = balance - moneyAmount;
   }
   
   public int getCurrentPosition(){
       return this.position;
   }
   
   public void setPosition(int position){
       this.position = position;
   }
   
   public int rollDie(Die die){
       return die.getFace();
   }
   
   public void isInJail(boolean isInjail){
       
   }
   
   
   
   //getter methods 
    public String getName(){
       return this.name;
   }
   public int getBalance(){
       return this.balance;
   }
}
