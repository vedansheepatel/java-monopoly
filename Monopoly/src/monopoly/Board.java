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
public class Board {

    private static Board board;
    private Location[] locations = new Location[40];

    public Board() {
        locations[0] = new GoSqaure("Go", 1);
        locations[1] = new Property("Mediteranean Avenue", 1, 60, 2, false);
        locations[2] = new communityChest("Community Chest", 3);
        locations[3] = new Property("Baltic Avenue", 4, 60, 4, false);
        locations[4] = new IncomeTax("IncomeTax", 5);
        locations[5] = new Property("Reading Railroad", 6, 200, 25, false);
        locations[6] = new Property("Oriental Avenue", 7, 100, 6, false);
        locations[7] = new chance("Chance", 8);
        locations[8] = new Property("Vermont Avenue", 9, 100, 6, false);
        locations[9] = new Property("Connecticut Avenue", 10, 120, 8, false);
        locations[11] = new Jail("Jail", 11);
        locations[12] = new Property("St.Charles Place", 12, 140, 10, false);
        locations[13] = new Utility("Electricity Company", 13, 150, 75, false);
        locations[14] = new Property("States Avenue", 14, 140, 10, false);
        locations[15] = new Property("Virginia Avenue", 15, 160, 12, false);
        locations[16] = new Property("Pennsylvania Railroad ", 16, 200, 25, false);
        locations[17] = new Property("St.James Place", 17, 180, 14, false);
        locations[18] = new communityChest("Community Chest", 18);
        locations[19] = new Property("Tennessee Avenue", 19, 180, 14, false);
        locations[20] = new Property("New York Avenue", 20, 200, 16, false);
        locations[21] = new FreeParking("Free Parking", 21);
        locations[22] = new Property("Kentucky Avenue", 22, 220, 18, false);
        locations[23] = new chance("Chance", 23);
        locations[24] = new Property("Indiana Avenue", 24, 220, 18, false);
        locations[25] = new Property("Illinois Avenue", 25, 240, 20, false);
        locations[26] = new Property("B.&.O Railroad", 26, 200, 25, false);
        locations[27] = new Property("Atlantic Avenue", 27, 260, 22, false);
        locations[28] = new Property("Ventnor Avenue", 28, 260, 22, false);
        locations[29] = new Utility("Water Works", 29, 150, 75, false);
        locations[30] = new Property("Marvin Gardens", 30, 280, 24, false);
        locations[31] = new GoToJail("Go To Jail", 31);
        locations[32] = new Property("Pacific Avenue", 32, 300, 26, false);
        locations[33] = new Property("North Carolina Avenue", 33, 300, 26, false);
        locations[34] = new communityChest("Community Chest", 34);
        locations[35] = new Property("Pennsylvania Avenue", 35, 320, 28, false);
        locations[36] = new Property("Short Line Railroad", 36, 200, 25, false);
        locations[37] = new chance("Chance", 37);
        locations[38] = new Property("Par Place", 38, 350, 35, false);
        locations[39] = new IncomeTax("Luxury Tax", 39);
        locations[40] = new Property("BoardWalk", 40, 400, 50, false);
    }
   
}
