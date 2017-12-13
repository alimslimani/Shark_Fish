/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;
import simulation.SimulationOcean;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author s21010750
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *

 */
public class Fenetre extends JFrame{
    private SimulationOcean sim;
    private Paneau p;
    private Paneau2 p2;
    public Fenetre(SimulationOcean s,Paneau pa)
    {

        p=pa;
        sim=s;
        setTitle("FenetreOcean");
        setSize(463,463);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = getContentPane();
        
        //cont.setBackground(Color.BLUE);
        cont.add(p);
      
     
       
        
    }
    
     public Fenetre(SimulationOcean s,Paneau2 pa2)
    {

        p2=pa2;
        sim=s;
        setTitle("FenetreOcean");
        setSize(463,463);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = getContentPane();    
        //cont.setBackground(Color.BLUE);
        cont.add(p2);
        
    }

}
