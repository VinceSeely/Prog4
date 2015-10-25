/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog4;

/**
 *
 * @author vince
 */
public class Prog4 
{
   public void main (String [] args)
   {
      try
      {
        ConsoleSimulation temp = new ConsoleSimulation();
        temp.run();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }
   
}
