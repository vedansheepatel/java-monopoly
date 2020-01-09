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
    //all locations have a name and board number assosicated with them
    private String name;
    private int positionNumber;

    //
    public Location(String name, int positionNumber) {
        this.name = name;
        this.positionNumber = positionNumber;
    }

    /**
     * Get the Locations board number
     *
     * @return the number
     */
    public int getPositionNumber() {
        return positionNumber;
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
