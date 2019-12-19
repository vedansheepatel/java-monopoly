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
    private boolean isInJail;
    private int leaveJailFree;
    private int position;
    private ArrayList <Properties> allProperties;
    
    
   public Player(String name){
       this.name = name;
   } 
  
   
   public void addMoney(int moneyAmount){
       this.balance = moneyAmount + balance; 
   }
   public void takeMoney(int moneyAmount){
       this.balance = balance - moneyAmount;
   }
   
   public int rollDie(Die die){
       return die.getFace();
   }
   
   public boolean isInJail(){
       
   }
   
   
   
   //getter methods 
    public String getName(){
       return this.name;
   }
   public int getBalance(){
       return this.balance;
   }
}
