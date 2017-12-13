/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;
import simulation.SimulationOcean;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author s21010750
 */
public class Ecouteur extends MouseAdapter {
    private Paneau p;
    private SimulationOcean so;
    public Ecouteur(Paneau pa,SimulationOcean s)
    {
        p=pa;
        so=s;
        
        
    }

   
   
    @Override
    public void mouseClicked(MouseEvent e)
    {   
      
        p.repaint();
        so.uneEtape();
       
     
    }
}
