/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author patev618
 */
public class IncomeTax extends Location {

    public IncomeTax(String name, int positionNumber) {
        super(name, positionNumber);
    }

    public String printToScreen() {
        return "You landed on IncomeTax Square. Please pay $200";
    }
}
