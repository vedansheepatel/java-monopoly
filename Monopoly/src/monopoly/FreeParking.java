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
public class FreeParking extends Location {

    /**
     *
     * @param name
     * @param positionX
     * @param positionY
     */
    public FreeParking(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    public String PrintToScreen() {
        return "You are using the Free Parking service";
    }
}
