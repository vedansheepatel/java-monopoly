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
    private Location[][] locations = new Location [10][10];
    
    public Board(){
        locations[0][0] = new GoSqaure ("Go", 1);
        locations[0][1] = new Property ("Mediteranean Avenue", 1, 60, 2, false);
        locations[0][2] = new communityChest ("Community Chest", 3);
        locations[0][3] = new Property ("Baltic Avenue", 4, 60, 4, false);
        locations[0][4] = new IncomeTax("IncomeTax", 5);
        locations[0][5] = new Property ("Reading Railroad", 6, 200, 25, false);
        locations[0][6] = new Property ("Oriental Avenue", 7, 100, 6, false);
        locations[0][7] = new chance ("Chance", 8);
        locations[0][8] = new Property ("Vermont Avenue", 9, 100, 6, false);
        locations[0][9] = new Property ("Connecticut Avenue", 10, 120, 8, false);
        locations[0][10]= new Jail ("Jail", 11);
        locations[1][10]= new Property ("St.Charles Place", 12, 140, 10, false);
        locations[2][10]= new Utility ("Electricity Company", 13, 150, 75, false);
        locations[3][10]= new Property ("States Avenue", 14, 140, 10, false);
        locations[4][10]= new Property ("Virginia Avenue", 15, 160, 12, false);
        locations[5][10]= new Property ("Pennsylvania Railroad ", 16, 200, 25, false);
        locations[6][10]= new Property ("St.James Place", 17, 180, 14, false);
        locations[7][10]= new communityChest ("Community Chest", 18);
        locations[8][10]= new Property ("Tennessee Avenue", 19, 180, 14, false);
        locations[9][10]= new Property ("New York Avenue", 20, 200, 16, false);
        locations[10][10]=new FreeParking ("Free Parking", 21);
        locations[10][9]= new Property ("Kentucky Avenue", 22, 220, 18, false);
        locations[10][8]= new chance ("Chance", 23);
        locations[10][7]= new Property("Indiana Avenue", 24, 220, 18, false);
        locations[10][6]= new Property ("Illinois Avenue", 25, 240, 20, false);
        locations[10][5]= new Property ("B.&.O Railroad", 26, 200, 25, false);
        locations[10][4]= new Property ("Atlantic Avenue", 27, 260, 22, false);
        locations[10][3]= new Property ("Ventnor Avenue", 28, 260, 22, false);
        locations[10][2]= new Utility ("Water Works", 29, 150, 75, false);
        locations[10][1]= new Property ("Marvin Gardens", 30, 280, 24, false);
        locations[10][0]= new GoToJail ("Go To Jail", 31);
        locations[9][0]= new Property ("Pacific Avenue", 32, 300, 26, false);
        locations[8][0]= new Property ("North Carolina Avenue", 33, 300, 26, false);
        locations[7][0]= new communityChest ("Community Chest", 34);
        locations[6][0]= new Property ("Pennsylvania Avenue", 35, 320, 28, false);
        locations[5][0]= new Property("Short Line Railroad", 36, 200, 25, false);
        locations[4][0]= new chance ("Chance", 37);
        locations[3][0]= new Property ("Par Place", 38, 350, 35, false);
        locations[2][0]= new IncomeTax ("Luxury Tax", 39);
        locations[1][0]= new Property ("BoardWalk", 40, 400, 50, false);
    }
    
//    public Location[] getLocations(){
//        return locations;
//    }
    
    
       
    
}
