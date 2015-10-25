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

public class Simulation
{
  private static final int MAX_LINE_LENGTH = 5;
  private Queue<Customer> q = new Queue(MAX_LINE_LENGTH);
  private int curTime = 0;               // current time
  private Customer curServed = null;     // current customer being served,
                                         // null if none being served
  private int peopleCompleted = 0;
  private int peopleNoWait = 0;
  private int peopleThatHadToWait = 0;
  private int sumOfWaitTime = 0;          
  
  public boolean arrival()
  {
     if(!q.isFull())
     {
        if(q.isEmpty())
        {
           curServed = new Customer(curTime);
           peopleNoWait++;
        }
        else
           peopleThatHadToWait++;
        q.add(new Customer(curTime));
      return true;
     }
     return false;
  }
  
  public String serviceCompletion()
  {
     if(!q.isEmpty())
     {
         String retVal = curServed.toString();
         curServed = (Customer)q.remove();
         return retVal;
     }
     return "Error";
  }
  
  public void updateClock(int deltaTime)
  {
     curTime += deltaTime;
  }
  
  public int getCurTime()
  {
     return curTime;
  }
  
  public double getAverageTime()
  {
     return (double)sumOfWaitTime / peopleThatHadToWait; 
  }
  
  public int getPeopleNoWait()
  {
     return peopleNoWait;
  }
  
  public static void main(String [] args)
  {
     
     
  }
}


