/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;

/**
 *
 * @author s21010750
 */

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import simulation.SimulationOcean;

public class Paneau2 extends JPanel implements ActionListener{
    private JOptionPane jop1= new JOptionPane();
    private ImageIcon img = new ImageIcon("sov.gif");
    private Timer timer;
    private SimulationOcean sim;
    private JLabel j;
    private Croix x;
    private Paneau p;
    private Fenetre f;
    private Title titre = new Title();
    private JPanel boutton = new JPanel();
    private JButton b;
    private JButton b2;
    private TitleRequin requin = new TitleRequin();
        JLabel jrequin=new JLabel("Entrez le nombre de requins : ");
    private JFormattedTextField jtfr = new JFormattedTextField(NumberFormat.getIntegerInstance());
    private TitleSardine sardine= new TitleSardine();
        JLabel jsardine=new JLabel("Entrez le nombre de sardines : ");
    private JFormattedTextField jtfs = new JFormattedTextField(NumberFormat.getIntegerInstance());

 public Paneau2 (SimulationOcean s) throws FileNotFoundException, IOException{
     sim=s;
     j=new JLabel("REQUIN ATTACKS !!!");
     Font font=new Font("Arial", Font.ROMAN_BASELINE, 40);
     j.setFont(font);
     j.setForeground(Color.LIGHT_GRAY);
     this.setLayout(new BorderLayout());
     titre.add(j);
     this.add(titre,BorderLayout.NORTH);
        jtfr.setPreferredSize(new Dimension(30, 20));
        requin.add(jrequin);
        requin.add(jtfr);
        this.add(requin,BorderLayout.EAST);
        jtfs.setPreferredSize(new Dimension(30, 20));
        sardine.add(jsardine);
        sardine.add(jtfs);
        this.add(sardine,BorderLayout.WEST);
            GridLayout gl = new GridLayout(1, 2);
            boutton.setLayout(gl);
          b = new JButton ("Lancez l'attaque des requins !!");
            boutton.setPreferredSize(new Dimension(55, 180));
            b.addActionListener(this);
            boutton.add(b);
          b2 = new JButton ("Animation!!");
            b2.addActionListener(this);
            boutton.add(b2);
        this.add(boutton,BorderLayout.SOUTH);
            x=new Croix();
        this.add(x,BorderLayout.CENTER);
                                                                            }

public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
        int nbs = Integer.parseInt(jtfs.getText());
        int nbr = Integer.parseInt(jtfr.getText());
        sim.getOcean().remplirOcean(nbs, nbr);
        p=new Paneau(sim);
        f=new Fenetre(sim,p);
        f.setVisible(true);
        if(sim.getOcean().PasdePOISSON()){
            jop1.showMessageDialog(null, "Fin de la simulation !\nRequin(s) restant(s): "+ sim.getOcean().nbRequin()+" \nSardine(s) restant(s): "+sim.getOcean().nbSardine(), "FIN", JOptionPane.INFORMATION_MESSAGE, img);
            System.exit(0);              }       
                        }
    if(e.getSource()==b2){
        JOptionPane j = new JOptionPane();
        String delai = j.showInputDialog(null, "Entrez le delais de l'animation (en millisecondes)", "delais", JOptionPane.QUESTION_MESSAGE);
        int delay = Integer.parseInt(delai);
        int nbs = Integer.parseInt(jtfs.getText());
        int nbr = Integer.parseInt(jtfr.getText());
        int nbrequinmort=0;
        sim.getOcean().remplirOcean(nbs, nbr);
        p=new Paneau(sim);
        f=new Fenetre(sim,p);
        f.setVisible(true);
        timer = new Timer(delay, new ActionListener(){
      
public void actionPerformed(ActionEvent e){
    if(!sim.getOcean().PasdePOISSON()){ 
        sim.uneEtape();
        p.repaint();
                                      }
    else {
        String win;
    if(sim.getOcean().nbRequin()<sim.getOcean().nbSardine()) win="Sardine Win";   else win="Requin win";
    jop1.showMessageDialog(null, "Fin de la simulation !\nRequin(s) restant(s): "+ sim.getOcean().nbRequin()+" \nSardine(s) restant(s): "+sim.getOcean().nbSardine()+"\n\n\n   "+win, "End", JOptionPane.INFORMATION_MESSAGE, img);
    timer.stop();
    System.exit(0);
        }
                                         }

                                                        }
        
);
timer.start();    
                        }
                                        }
}
