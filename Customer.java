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

public class Customer     
{
   private static int customerCount = 0;   // # of customers created
   private int customerNumber;      // Set to incremented customerCount 
   private int arrivalTime;
   
   public Customer(int arriveTime)
   {
      arrivalTime = arriveTime;
      customerCount++;
      customerNumber = customerCount;
   }
   
   @Override public String toString()
   {
      return "C" + customerNumber + "/T" + arrivalTime;
   }
   
   public int getArrivalTime()
   {
      return arrivalTime;
   }
}



