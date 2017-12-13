/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;
import java.util.Random;

/**
 *
 * @author s21010750
 */


public class Ocean 
{
	private Poisson grille[][];
        private int possardine1;
        private int posrequin1;
        private int possardine2;
        private int posrequin2;
	private int taille;
	public Ocean(int t)
	{
		taille=t;
                
		grille= new Poisson[t][t];
		
                
	}
        public void remplirOcean(int nbsardine,int nbrequin)
        {
            Random r=new Random();
            int a=0;
            int x;
            int y;
            while(a<nbsardine)
            {
                x=r.nextInt(taille-1);
                y=r.nextInt(taille-1);
          
                if(grille[x][y] ==null)
                {grille[x][y]=new Sardine(); a++;}   
            }
            a=0;
            while(a<nbrequin)
            {
                x=r.nextInt(taille-1);
                y=r.nextInt(taille-1);
                 if(grille[x][y] ==null)
                {grille[x][y]=new Requin(); a++;}   
            }
            }
        public boolean NoFish()
        {
            boolean truesardine=false;
            boolean truerequin=false;
            for(int i=0;i<this.getTaille();i++)
            {
                for(int j=0;j<this.getTaille();j++)
                {
                    if((this.getGrille(i, j) instanceof Sardine)) truesardine=true;
                    else  if((this.getGrille(i, j) instanceof Requin)) truerequin=true;
                }
            }
            if(truesardine==false||truerequin==false) 
            return true;
            else return false;
        }
        
        public int nbSardine()
        {
            int nb=0;
            for(int i=0;i<this.getTaille();i++)
            {
                for(int j=0;j<this.getTaille();j++)
                {
                    if((this.getGrille(i, j) instanceof Sardine)) nb++; ;
                 
                }
            }
           return nb ;
        }
        
        public int nbRequin()
        {
            int nb=0;
            for(int i=0;i<this.getTaille();i++)
            {
                for(int j=0;j<this.getTaille();j++)
                {
                    if((this.getGrille(i, j) instanceof Requin)) nb++; ;
                 
                }
            }
           return nb ;
        }
	public int getTaille()
	{
		return taille;
	}
	public Poisson getGrille(int x,int y)
	{
		return grille[x][y];
	}
	public void setGrille(int x,int y,Poisson p)
	{
		 grille[x][y]= p;
	}
	public String lire(int x,int y)
	{
		if(grille[x][y]==null)
			return "Vide";
		return grille[x][y].toString();
	}
	public void afficheGrille()
	{
		System.out.println("\n\n");
		for(int i=0;i<taille;i++)
		{
			if(i<10)
				System.out.print("      "+(i+1));
			if(i>=10)
				System.out.print("     "+(i+1));
		}
		System.out.print("\n");
		for(int i=0;i<taille;i++)
		{
			if(i<9)
				System.out.print(i+1+" ");
			else
				System.out.print(i+1);
			for(int j=0;j<taille;j++)
			{
				System.out.print(" | "+lire(i,j));
			}
			System.out.print(" |\n");
		}
	}
	public Ocean copie()
	{
		Ocean copieOcean = new Ocean(taille);
		for(int i=0;i<taille;i++)
		{
			for(int j=0;j<taille;j++)
			{
				if(grille[i][j]!=null)
				{
					copieOcean.setGrille(i,j,this.getGrille(i,j));
				}
			}
		}
		return copieOcean;
	}
	
        
	
}
