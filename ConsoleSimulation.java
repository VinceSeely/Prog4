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
         input = stdin.next();
         evaluate(input);    
      } 
      System.out.println("Statistics at end of the program are:");
      printResults();
       System.out.println("Normal Termination of Program 4! ");

   }
   
   private void evaluate(String input)
   {
      switch(input)
      {
         case "A":
            add();
            break;
         case "C":
            complete();
            break;
         case "T":
            input = stdin.next();
            int temp = Integer.parseInt(input);
            line.updateClock(temp);
            break;
         case "P":
            printResults();
            break;
         case "Q":
            break;
      }
   }
   
   private void complete()
   {
      System.out.println(line.serviceCompletion() + 
              " Number waiting in queue is " + line.getNumWaiting());
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
              + "finished waiting is" + line.getAverageTime() + ".\n" +
              "The sum of the total wait time is" + line.getCurTime() + ".\n"
              + "The number of people that did NOT have to wait is" + 
              line.getPeopleNoWait() + ".\nThe number of people served "
              + "is 8.\n");
   }
}
