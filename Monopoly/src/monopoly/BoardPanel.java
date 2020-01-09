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
    
    public BoardPanel(){
        super();
        try{
            img = ImageIO.read(new File("Monopoly whole board.jpg"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void paintComponent(Graphics g){
        g.clearRect(0,0,this.getWidth(),this.getHeight());
        g.drawImage(img, 0, 0,this.getWidth(),this.getHeight(),null);
    }
}
