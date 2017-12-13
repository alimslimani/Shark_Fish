/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;

/**
 *
 * @author s21010750
 */
public class Requin extends Poisson
{
	private static int AGE_ADULTE=50,FAMINE=20;
	private static double PROBA_REPRO=0.1;
	private int famine;
	public Requin()
	{
		super();
		famine=0;
	}
	public boolean uneEtape(Ocean ocean,int i,int j)
	{
		age++;
		System.out.println("Age requin = "+age);
		if(famine==FAMINE)
		{
			ocean.setGrille(i,j,null);
			System.out.println("Le requin est mort de faim");
			return false;
		}
		return seDeplacer(ocean,i,j);
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
			famine++;
			ocean.setGrille(x, y, ocean.getGrille(i,j));
			ocean.setGrille(i,j,null);
			return true;
		}
		else if(ocean.getGrille(x,y).toString().equals("S"))
		{
			famine=0;
			System.out.println("Une sardine s'est faite mange");
			ocean.setGrille(x, y, ocean.getGrille(i,j));
			ocean.setGrille(i,j,null);
			return true;
		}
		famine++;
		return false;
	}
	public String toString()
	{
		return "R";
	}
	public int getAGE_ADULTE() 
	{
		return AGE_ADULTE;
	}
	public double getPROBA_REPRO() 
	{
		return PROBA_REPRO;
	}
	
	public Poisson repoduction(int x,int y)
	{
		 System.out.println("Un nouveau requin est nee");
		 Poisson p = new Requin();
		 return p;
	}
}
