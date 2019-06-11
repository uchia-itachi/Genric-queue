package genricqueue;
import java.lang.*;
import java.util.*;
public class linkedlistQueue<E> implements queue<E>{
  private Node front, rear;
  private int size;

  private class Node
  {
    E data;
    Node next;
    Node(E data){
      this.data=data;
      next=null;
    }
  }

  public linkedlistQueue()
  {
    front = null;
	  rear = null;
    size = 0;
  }

  public boolean isEmpty()
  {
    return (size == 0);
  }

public int size(){
  return size;
  }

  public E front(){
    E d =front.data;
    return d;
  }
  public void add(E data){
    Node n=new Node(data);
    if(front==null){
      rear=n;
      front=rear;
      size++;
    }
    else{
      rear.next=n;
      rear=rear.next;
      size++;
    }

  }
  public E remove(){
    E val=front.data;
    front=front.next;
    if(isEmpty()){
      rear=null;
    }
    size--;
    return val;

  }

}
