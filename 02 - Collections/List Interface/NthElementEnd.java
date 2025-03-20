import java.util.*;

public class NthElementEnd{

  public static void findNthLast(List<Integer> list, int n){
    int slow = 0;
    int fast = n;

    try{
      while (list.get(fast) != -9999){
        slow++;
        fast++;
      }
    } catch (IndexOutOfBoundsException e){
      System.out.println(list.get(slow));
    }
  }


  public static void main(String[] args){
    List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

    findNthLast(list, 2);
  }
}