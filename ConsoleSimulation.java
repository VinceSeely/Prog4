/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog4;

import java.util.Scanner;

/**
 *
 * @author vince
 */
public class ConsoleSimulation 
{
   
   private Simulation line;
   private Scanner stdin;
   
   public void run() 
   {
      stdin = new Scanner(System.in);
      String input = "";
      line = new Simulation();
      while ( !input.equals("Q") )
      {
         input = stdin.nextLine();
         evaluate(input);    
      } 
      System.out.println("Statistics at end of the program are:");
      printResults();
       System.out.println("Normal Termination of Program 4! ");

   }
   
   private void evaluate(String input)
   {
      String[] temp = input.split(" ");
      switch(temp[0])
      {
         case "A":
            add();
            break;
         case "C":
            complete();
            break;
         case "T":
            input = temp[1];
            int temp1 = Integer.parseInt(input);
            updateClock(temp1);
            break;
         case "P":
            printResults();
            break;
         case "Q":
            break;
         default :
            System.out.println(temp[0] + " is not a valid command!");
      }
   }
   
   private void updateClock(int time)
   {
      line.updateClock(time);
      if(time > 0)
         System.out.println("Time updated by " + time + " time units and time "
              + "is now " + line.getCurTime() + ".");
      else
         System.out.println("Time not updated with " + time);
   }
   
   private void complete()
   {
      String str = line.serviceCompletion();
      if(str == null)
         System.out.println("No customer is being served at " +
               "the present time " + line.getCurTime());
      else
         System.out.println( "Customer " + str + " finished at time " + 
               line.getCurTime() + " Number waiting in queue is " +
               line.getNumWaiting());
   }
   
   private void add()
   {
      boolean completed = line.arrival();
      if (completed)
         System.out.println("A customer entered system at time " + 
                 line.getCurTime() + ". Number waiting in queue is "+ 
                 line.getNumWaiting() + ".");
   }
   
   private void printResults()
   {
      System.out.println("\nThe average wait time for customers who are "
              + "finished waiting is " + line.getAverageTime() + ".\n" +
              "The sum of the total wait time is " + line.getSumOfTime() + ".\n"
              + "The number of people that did NOT have to wait is " + 
              line.getPeopleNoWait() + ".\nThe number of people served "
              + "is " + line.getNumServed() + ".\n");
   }
}
