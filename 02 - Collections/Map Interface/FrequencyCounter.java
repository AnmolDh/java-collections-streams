public class FrequencyCounter{

  public static void count(String path){
    try (BufferReader reader = new BufferReader(new FileReader(path))){
      String line;

      while (line = reader.nextLine() != null){
        line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
      }
      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
          System.out.println(entry.getKey() + " = " + entry.getValue());
      }
    }
    catch (IOException e) {
        System.err.println("Error reading file");
    }
  }

  public static void main(String[] args){
    count("./input.txt");
  }
}