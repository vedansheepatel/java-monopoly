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
public class Jail extends Location {

    public Jail(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    public String printToScreen() {
        return "You are at the Jail Sqaure";
    }
}
