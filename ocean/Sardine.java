/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;

/**
 *
 * @author s21010750
 */
public class Sardine extends Poisson 
{
	private static int AGE_ADULTE=15;
	private static double PROBA_REPRO=0.3;
        
        public Sardine()
	{
		super();
		
	}
	
	public boolean uneEtape(Ocean ocean,int i,int j)
	{
		age++;
		System.out.println("Age sardine = "+age);
		return seDeplacer(ocean,i,j);
		
	}
	public Poisson repoduction(int x,int y)
	{
		 System.out.println("Une nouvelle sardine est nee");
		 Poisson p = new Sardine();
		 return p;
	}
	public boolean seDeplacer(Ocean ocean,int i,int j)
	{
		int x=i,y=j;
		double random=Math.random();
		if(random<0.25)
		{
			//Gauche
			if(x==0)
			{
				x=ocean.getTaille()-1;
			}
			else
			{
				x--;
			}
		}
		else if(random<0.50)
		{
			//Droite
			if(x==ocean.getTaille()-1)
			{
				x=0;
			}
			else
			{
				x++;
			}
		}
		else if(random<0.75)
		{
			//Bas
			if(y==0)
			{
				y=ocean.getTaille()-1;
			}
			else
			{
				y--;
			}
		}
		else 
		{
			//Haut
			if(y==ocean.getTaille()-1)
			{
				y=0;
			}
			else
			{
				y++;
			}
		}
		if(ocean.getGrille(x,y)==null)
		{
			ocean.setGrille(x, y, ocean.getGrille(i,j));
			ocean.setGrille(i,j,null);
			return true;
		}
		return false;
	}
	public String toString()
	{
		return "S";
	}
	public int getAGE_ADULTE() 
	{
		return AGE_ADULTE;
	}
	public double getPROBA_REPRO() 
	{
		return PROBA_REPRO;
	}
}
