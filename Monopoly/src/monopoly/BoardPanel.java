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
public class BoardPanel extends JPanel{
    private BufferedImage img;
    private BufferedImage player1;
    private int p1X = 650;
    private int p1Y = 650;
    
    public BoardPanel(){
        super();
        try{
            img = ImageIO.read(new File("Monopoly whole board.jpg"));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            player1 = ImageIO.read(new File("Monopoly car piece.jpg"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void paintComponent(Graphics g){
        g.clearRect(0,0,this.getWidth(),this.getHeight());
        g.drawImage(img, 0, 0,this.getWidth(),this.getHeight(),null);
        g.drawImage(player1, p1X, p1Y,this.getWidth(),this.getHeight(),null);
    }
    
    public void setLocation(int playerNumber, int x, int y){
        if(playerNumber == 1){
            this.p1X = x;
            this.p1Y = y;
        }
        
        repaint();
    }
}
