import java.util.*;

public class RemoveDuplicates{

  public static <T> List<T> removeDuplicates(List<T> list){
    List<T> result = new ArrayList<>();
    
    for (int i = 0; i < list.size(); i++){
      if (!result.contains(list.get(i))){
        result.add(list.get(i));
      }
    }

    return result;
  }

  public static void main(String[] args){
    List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

    List<Integer> result = removeDuplicates(list);
    for (int i : result){
      System.out.println(i);
    }
  }
}