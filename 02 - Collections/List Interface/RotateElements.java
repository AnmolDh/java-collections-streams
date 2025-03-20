import java.util.*;

public class RotateElements{
  public static void rotate(List<Integer> list, int k){
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); i++){
      res[(i + k) % list.size()] = list.get(i);
    }

    for (int i = 0; i < res.length; i++){
      System.out.println(res[i]);
    }
  }

  public static void main(String[] args){
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    
    rotate(list, 3);
  }
}