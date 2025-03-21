import java.util.*;

public class UnionIntersection{
  public static void findUnionIntersection(HashSet<Integer> h1, HashSet<Integer> h2){
    HashSet<Integer> union = new HashSet<>(h1);
    HashSet<Integer> intersection = new HashSet<>(h1);

    union.addAll(h2);
    intersection.retainAll(h2);

    System.out.println("Union Set: " + union);
    System.out.println("Intersection Set: " + intersection);
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


    findUnionIntersection(h1, h2);
  }
}