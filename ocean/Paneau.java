/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ocean;
/**
 *
 * @author s21010750
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import simulation.*;
import javax.imageio.ImageIO;


public class Paneau extends JPanel {
    private SimulationOcean sim;
   
    public Paneau(SimulationOcean sm)
    {
        sim=sm;
    addMouseListener(new Ecouteur(this,sim));        
    }


 
    
   
    public void paintComponent (Graphics g)
    {
     super.paintComponent(g);
     
       BufferedImage sardine = null;
       BufferedImage requin = null;
       BufferedImage fondmarin = null;
     
try {
    sardine = ImageIO.read(new File("sardine.jpg"));
} catch (IOException e) {
}
try {
    requin= ImageIO.read(new File("requin.gif"));
} catch (IOException e) {
}
try {
    fondmarin= ImageIO.read(new File("fondmarin.jpg"));
} catch (IOException e) {
}



       
g.drawImage(fondmarin, 0, 0, 463, 463, this);      

          
     Dimension taille=getSize();
     int im=taille.width/23;
     int jm=taille.height/23;
     for(int i=0;i<im;i++)
     {
         for(int j=0;j<jm;j++)
         {
             if(sim.getOcean().getGrille(i,j) instanceof Sardine)
             {
           
                  g.drawImage(sardine, 23*i+3, 23*j+3, 20, 20, this);
                 
             }
             
             if(sim.getOcean().getGrille(i,j) instanceof Requin)
             {
                 g.drawImage(requin, 23*i+3, 23*j+3, 40, 40, this);

             }
                 
         }
     }
    }

}

