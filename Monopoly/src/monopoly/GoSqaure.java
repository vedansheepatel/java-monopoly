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
public class GoSqaure extends Location {

    public GoSqaure(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    public String printToScreen() {
        return "You are in go square. Collect $100 from bank.";
    }

}
