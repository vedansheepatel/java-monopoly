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
public class Location {

    //make a super class for all possible locations on the board 
    //all locations have a name, X position and Y position assosicated with them
    private String name;
    private int positionX;
    private int positionY;

    //constructor of the super class
    public Location(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * Get the Locations X position
     *
     * @return the X position number
     */
    public int getPositionX() {
        return positionX;
    }
    /**
     * Get the Locations Y position
     *
     * @return the Y position number
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * get the locations name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

}
