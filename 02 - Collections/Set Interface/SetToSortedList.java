import java.util.*;

public class SetToSortedList{
  public static List<Integer> convert(HashSet<Integer> hs){
    TreeSet<Integer> ts = new TreeSet<>(hs);

    return new ArrayList<>(ts);
  }


  public static void main(String[] args){
    HashSet<Integer> hs = new HashSet<>();

    hs.add(3);
    hs.add(1);
    hs.add(5);
    hs.add(2);
    hs.add(4);
    hs.add(3);

    System.out.println(convert(hs));
  }
}