/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author s21010750
 */
public class SimulationModeTexte 
{
	Simulation simulation = new SimulationOcean();
	public SimulationModeTexte()
	{
		simulation.initialise(10);
	}
	public void run(int j)
	{
		for(int i=0;i<j;i++)
		{
			simulation.uneEtape();
		}
	}
	/*public static void main(String[] args) 
	{
		SimulationModeTexte s=new SimulationModeTexte();
		Scanner sc = new Scanner(System.in);
		String str="O";
		s.simulation.afficheTexte();
		while(str.equalsIgnoreCase("O") || str.equalsIgnoreCase("o"))
		{
			s.run(10);
			s.simulation.afficheTexte();
			System.out.println("Continuer (O/N) :");
			str = sc.nextLine();
			System.out.println("Vous avez saisi : " + str);
		}

	}*/
}
