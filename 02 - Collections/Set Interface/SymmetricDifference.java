import java.util.*;

public class SymmetricDifference{

  public static void findSymmetricDifference(HashSet<Integer> h1, HashSet<Integer> h2){
    HashSet<Integer> sd = new HashSet<>(h1);
    HashSet<Integer> inter = new HashSet<>(h1);

    sd.addAll(h2);
    inter.retainAll(h2);
    sd.removeAll(inter);

    System.out.println(sd);
  }

  public static void main(String[] args){
    HashSet<Integer> h1 = new HashSet<>();
    HashSet<Integer> h2 = new HashSet<>();

    h1.add(1);
    h1.add(2);
    h1.add(3);
    h2.add(3);
    h2.add(4);
    h2.add(5);

    findSymmetricDifference(h1, h2);
  }
}