package lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordUnique {

  public static void main(String[] args) {
    String[] words = new String[]{"ага", "нга", "агн", "агС", "Гаг", "ага", "Гаг", "ага", "Дга",
        "ага", "ага", "агС", "ага", "Дга", "ага", "аХа", "ага", "Дга", "агД"};
    List<String> wordVarious = Arrays.asList(words);
    System.out.println(wordVarious);
    Set<String> wordUnique = new HashSet<>(Arrays.asList(words));
    System.out.println(wordUnique);
    for (String wordFind : wordUnique) {
      System.out.printf("Слово %s встречается -> %d раз%n", wordFind,
          Collections.frequency(wordVarious, wordFind));
    }

  }
}
