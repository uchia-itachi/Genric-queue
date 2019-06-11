package genricqueue;
import java.lang.*;
import java.util.*;

 public class arrayQueue <E> implements queue <E>{
  private int front=-1;
  private int rear=-1;
  private int MAX=1000;
  private E[] arr;

  public arrayQueue ()
	{
		 arr= (E[]) new Object[MAX];
	}
  public int size(){
    if(front==-1)
    return 0;
    return Math.abs(Math.abs(MAX - front) -Math.abs(MAX -rear))+1;

  }
  public boolean isEmpty(){
    if(front==rear && front!=-1){
      return false;
    }
    if(Math.abs(Math.abs(MAX - front) -Math.abs(MAX -rear))==0)
      return true;
    return false;

  }
  public E front(){
    return arr[front];
  }
  public void add(E e){
    if ((front == 0 && rear == MAX-1) ||
            (rear == (front-1)%(MAX-1)))
    {
        System.out.println("Queue is Full");
    }
    else if (front == -1)
    {
        front = rear = 0;
        arr[rear] = e;
    }

    else if (rear == MAX-1 && front != 0)
    {
        rear = 0;
        arr[rear] = e;
    }

    else
    {
        rear++;
        arr[rear] = e;
    }

  }
  public E remove(){
  if (front == -1)
    {
        System.out.println("\nQueue is Empty");
    }

    E data = arr[front];
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else if (front == MAX-1)
        front = 0;
    else
        front++;
    return data;
  }
}
