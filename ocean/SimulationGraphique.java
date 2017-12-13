/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;

/**
 *
 * @author s21010750
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import simulation.*;
     
public class SimulationGraphique  {
    private Simulation sim=new SimulationOcean(); 
        
    public static void main(String x[]) throws FileNotFoundException, IOException
    {
        SimulationOcean s=new SimulationOcean(); 
        s.initialise(20); 
        Paneau2 p2=new Paneau2(s);
        Fenetre f = new Fenetre(s,p2);
        
        f.setVisible(true);  
    
    }

}
