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
/**
Creates a Queue class, that allows Objects to be added to the Queue,
or removed and returned. Can check if a Queue is either full, or
empty, and adds and removes Objects to the rear of the Queue.

@author Shane Hendricks
*/
public class Queue<E> // Student must properly comment

{

   private E[] elements;
   private int front, rear, count;

   
   /**
   Creates a Queue Object, with a size of SIZE.
   */
   public Queue(int size)
   {
      elements = (E[]) new Object[size];

      front = rear = count = 0;
   }
   
   /**
   Checks if the Queue is empty.
   @return whether the Queue is empty(true) or not(false).
   */
   public boolean isEmpty()
   {
      return count == 0;
   }

   /**
   Checks if the Queue is full.
   @return whether the Queue is empty(true) or not(false).
   */
   public boolean isFull()
   {
      return count == elements.length;
   }

   /**
   Adds an element to the rear of the Queue.
   @param x is the object to add.
   */
   public void add ( Object x )
   {
      elements[rear] = (E)x;

      rear = (rear + 1) % elements.length;

      ++count;
   }
   
   /**
   Sets all elements in the Queue to null.
   */
   public void clear()
   {
      for(int i = 0; i < elements.length; i++)
         elements[i] = null;
      front = rear = count = 0;
   }
   
   /**
   Removes the Object at the rear of the Queue.
   @return the Object at the rear.
   */
   public Object remove()
   {
      Object x = elements[front];
      front = (front + 1) % elements.length;

      --count;

      return x;
   }
}
