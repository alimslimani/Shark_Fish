/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean;
/**
 *
 * @author s21010750
 */

public abstract class Poisson{
    protected int age;
    
public Poisson(){
    this.age=0;
                }
	
public void setAge(int age){
    this.age = age;
                           }

public int getAge(){
    return age;
                   }

public abstract int getAGE_ADULTE();
public abstract Poisson repoduction(int x,int y);
public abstract double getPROBA_REPRO();
public abstract boolean uneEtape(Ocean ocean,int i,int j);
    @Override
public abstract String toString();
                            }
