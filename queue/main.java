import genricqueue.*;
import java.lang.*;
import java.util.*;
class main extends linkedlistQueue{
  public static void main(String[] args){
    arrayQueue <Integer> Q=new arrayQueue<>();
    System.out.println(Q.size());
    System.out.println(Q.isEmpty());
    Q.add(4);
    System.out.println(Q.isEmpty());
    System.out.println(Q.front());
    System.out.println(Q.remove());
    System.out.println(Q.size());

  }
}
