import java.util.*;

public class FrequencyOfElements{

  public static void findFrequency(List<String> list){
    HashMap<String, Integer> hm = new HashMap<>();

    for (String s : list){
      hm.put(s, hm.getOrDefault(s, 0)+1);
    }

    for (Map.Entry<String, Integer> me : hm.entrySet()){
      System.out.println(me.getKey() + ": " + me.getValue());
    }
  }

  public static void main(String[] args){
    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add("hello");
    list.add("bye");
    list.add("hello");

    findFrequency(list);
  }
}