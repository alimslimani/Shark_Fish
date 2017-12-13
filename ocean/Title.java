/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author s21010750
 */

public class Title extends JPanel {
     
      Title()
      {
          
          this.setPreferredSize(new Dimension(90, 200));
      }

  @Override
 public void paintComponent (Graphics g)
    {
     super.paintComponent(g);
     BufferedImage font = null;
      try {
    font = ImageIO.read(new File("back.jpg"));
        } catch (IOException e) {
            }
      g.drawImage(font, 0, 0, this.getWidth(), this.getHeight(), this); 
      
    }

}
