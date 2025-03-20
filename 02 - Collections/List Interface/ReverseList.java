import java.util.*;

public class ReverseList{

  public static <T> void reverse(List<T> list){
    int s = 0;
    int e = list.size()-1;

    while (s < e){
      T temp = list.get(s);
      list.set(s, list.get(e));
      list.set(e, temp);
      s++;
      e--;
    }
  }

  public static void main(String[] args){
    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(5);
    list.add(8);

    reverse(list);

    for (int i : list){
      System.out.print(i + " -> ");
    }
  }
}