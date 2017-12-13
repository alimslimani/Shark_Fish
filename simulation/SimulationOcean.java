/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author s21010750
 */
import ocean.*;

public class SimulationOcean implements Simulation 
{
	private Ocean ocean;


	public void afficheTexte()
	{
		ocean.afficheGrille();
	}
        public Ocean getOcean()
        {
            return ocean;
        }
	public void initialise(int taille) 
	{
		ocean = new ocean.Ocean(taille);
                
	}
	public void uneEtape() 
	{
		Ocean oceancopie = new Ocean(ocean.getTaille());
		oceancopie=ocean.copie();
		for(int i=0;i<ocean.getTaille();i++)
		{
			for(int j=0;j<ocean.getTaille();j++)
			{
				if(ocean.getGrille(i,j)!=null && oceancopie.getGrille(i,j)!=null)
				{
					if(ocean.getGrille(i,j).uneEtape(ocean, i, j))
					{
						double random =Math.random();			
						if(oceancopie.getGrille(i,j).getAge()>=oceancopie.getGrille(i,j).getAGE_ADULTE() && (random<oceancopie.getGrille(i,j).getPROBA_REPRO()))
						{
							ocean.setGrille(i,j,oceancopie.getGrille(i,j).repoduction(i,j));
                                                        
                                                        oceancopie=ocean.copie();
						}
					}
				}
			
			}
		}
	}
	

}
