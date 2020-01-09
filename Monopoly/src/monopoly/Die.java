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
public class Die {

    /**
     * generate a random number between 1-6
     *
     * @return the generated number
     */
    public int getFace() {
        int face = (int) ((Math.random() * 6) + 1);
        return face;

    }

}
