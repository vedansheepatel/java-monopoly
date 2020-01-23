/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author patev6618
 */
public class BoardPanel extends JPanel {

    //instance variables
    private BufferedImage img;
    private BufferedImage player1;
    private BufferedImage player2;
    private int p1X = 630;
    private int p1Y = 630;
    private int p2X = 650;
    private int p2Y = 650;

    //read in the image file for the pictures 
    public BoardPanel() {
        super();
        try {
            img = ImageIO.read(new File("Monopoly whole board.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            player1 = ImageIO.read(new File("Monopoly car piece.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            player2 = ImageIO.read(new File("Monopoly hat piece.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//draw the images on the panel
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        if (img != null) {
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
        }
        if (player1 != null) {
            g.drawImage(player1, p1X, p1Y, player1.getWidth(), player1.getHeight(), null);
        }
        if (player2 != null) {
            g.drawImage(player2, p2X, p2Y, player2.getWidth(), player2.getHeight(), null);
        }

    }
//set the initical location of the 2 players 
    public void setLocation(int playerNumber, int x, int y) {
        if (playerNumber == 1) {
            this.p1X = x;
            this.p1Y = y;
        } else if (playerNumber == 2) {
            this.p2X = x;
            this.p2Y = y;
        }

        repaint();
    }
}
