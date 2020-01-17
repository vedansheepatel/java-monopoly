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

    private Location[] locations = new Location[40];

    public Board() {
        //name, x, y, price, rent, isOwned

        locations[0] = new GoSqaure("Go", 650, 650);
        locations[1] = new Property("Mediteranean Avenue", 575, 650, 60, 2, false);
        locations[2] = new communityChest("Community Chest", 520, 650);
        locations[3] = new Property("Baltic Avenue", 465, 650, 80, 4, false);
        locations[4] = new IncomeTax("IncomeTax", 410, 650);
        locations[5] = new Property("Reading Railroad", 355, 650, 200, 25, false);
        locations[6] = new Property("Oriental Avenue", 300, 650, 100, 6, false);
        locations[7] = new chance("Chance", 245, 650);
        locations[8] = new Property("Vermont Avenue", 180, 650, 100, 6, false);
        locations[9] = new Property("Connecticut Avenue", 105, 640, 120, 8, false);
        locations[10] = new Jail("Jail", 45, 650);
        locations[11] = new Property("St.Charles Place", 45, 575, 140, 10, false);
        locations[12] = new Property("Electricity Company", 45, 515, 150, 4, false);
        locations[13] = new Property("States Avenue", 45, 455, 140, 10, false);
        locations[14] = new Property("Virginia Avenue", 45, 400, 160, 12, false);
        locations[15] = new Property("Pennsylvania Railroad ", 45, 340, 200, 25, false);
        locations[16] = new Property("St.James Place", 45, 285, 180, 14, false);
        locations[17] = new communityChest("Community Chest", 45, 230);
        locations[18] = new Property("Tennessee Avenue", 45, 170, 180, 14, false);
        locations[19] = new Property("New York Avenue", 45, 115, 200, 16, false);
        locations[20] = new FreeParking("Free Parking", 45, 50);
        locations[21] = new Property("Kentucky Avenue", 100, 40, 220, 18, false);
        locations[22] = new chance("Chance", 160, 40);
        locations[23] = new Property("Indiana Avenue", 220, 40, 220, 18, false);
        locations[24] = new Property("Illinois Avenue", 280, 40, 240, 20, false);
        locations[25] = new Property("B.&.O Railroad", 335, 40, 200, 25, false);
        locations[26] = new Property("Atlantic Avenue", 390, 40, 260, 22, false);
        locations[27] = new Property("Ventnor Avenue", 445, 40, 260, 22, false);
        locations[28] = new Property("Water Works", 500, 40, 150, 4, false);
        locations[29] = new Property("Marvin Gardens", 555, 40, 280, 24, false);
        locations[30] = new GoToJail("Go To Jail", 630, 40);
        locations[31] = new Property("Pacific Avenue", 640, 115, 300, 26, false);
        locations[32] = new Property("North Carolina Avenue", 640, 170, 300, 26, false);
        locations[33] = new communityChest("Community Chest", 640, 230);
        locations[34] = new Property("Pennsylvania Avenue", 640, 285, 320, 28, false);
        locations[35] = new Property("Short Line Railroad", 640, 340, 200, 25, false);
        locations[36] = new chance("Chance", 640, 400);
        locations[37] = new Property("Park Place", 640, 455, 350, 35, false);
        locations[38] = new IncomeTax("Luxury Tax", 640, 515);
        locations[39] = new Property("BoardWalk", 640, 570, 400, 50, false);

    }

    public int getX(int position) {
        return locations[position].getPositionX();
    }

    public int getY(int position) {
        return locations[position].getPositionY();
    }

    public String getName(int position) {
        return locations[position].getName();
    }

    public Property getProperty(int position) {
        Property p = (Property) locations[position];
        if (locations[position] instanceof Property) {
            return p;
        }
        return p;
    }
 
   
    public int getPrice(int position) {
        Property p = (Property) locations[position];
        if (locations[position] instanceof Property) {

            return p.getPrice();
        } else {
            System.out.println("Not a Property");
        }
        return p.getPrice();
    }

    public int getRent(int position) {
        Property p = (Property) locations[position];
        if (locations[position] instanceof Property) {
             return p.getRent();
        }
        return p.getRent();
    }

    
}
