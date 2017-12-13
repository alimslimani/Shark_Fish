/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author s21010750
 */
public class TitleRequin extends JPanel {
     
      TitleRequin()
      {
          
   
      }

  
      @Override
 public void paintComponent (Graphics g)
  {
        Graphics2D g2d = (Graphics2D)g;
                
                GradientPaint gp = new GradientPaint(0, 0, Color.red, 0, 20, Color.ORANGE, true);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
             
  }

  

    
    }

