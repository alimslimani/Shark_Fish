/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ocean;

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


public class Croix extends JPanel{
    Croix(){
        this.addMouseListener(new Help());
           }

  @Override
 public void paintComponent (Graphics g){
     BufferedImage font = null;
     try {
         font = ImageIO.read(new File("tete.jpg"));
         } 
     catch (IOException e){
                          }
     g.drawImage(font, 0, 0, this.getWidth(), this.getHeight(), this);      
                                        }             
                                 }


