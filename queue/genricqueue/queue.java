package genricqueue;
import java.util.*;
import java.lang.*;
public interface queue<E>{
  int size();
  boolean isEmpty();
  E front();
  void add(E e);
  E remove();
}
