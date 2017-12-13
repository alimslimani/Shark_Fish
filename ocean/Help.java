/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author s21010750
 */




public class Help extends MouseAdapter {
  private JOptionPane f;
    public Help()
    {
      
        
        
    }

   
   
    @Override
    public void mouseClicked(MouseEvent e)
    {   
      
    f = new JOptionPane();
  f.showMessageDialog(null, "Ce programme est une simulation.\n Apres avoir tapper le nombre de sardines et de requins, vous pourrez apress chaque\n clik de souris afficher l'etat de l'ocean et voir son evolution.", "Help", JOptionPane.INFORMATION_MESSAGE);
    
       
     
    }
}
