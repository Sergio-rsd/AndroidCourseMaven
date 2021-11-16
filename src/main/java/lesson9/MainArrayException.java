package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainArrayException {

  private static final Pattern pattern = Pattern.compile("\\D");

  public static void main(String[] args) {
    int goodLengthArray = 4;
    Random random = new Random();
    String[][] arrTrue = new String[4][4];

    for (int i = 0; i < goodLengthArray; i++) {
      for (int j = 0; j < goodLengthArray; j++) {
        arrTrue[i][j] = String.valueOf(random.nextInt(0, 10));
      }
    }
    String[][] arrFalse = {{"9", "3", "8"}, {"1", "test34", "3"}, {"2", "8"}};

    testArray(arrFalse);
    testArray(arrTrue);
    System.out.println("Завершение проверки");
  }

  static void testArray(String[][] arrayTest) {

    int lengthArray = 4;
    int sum = 0;

    try {
      System.out.println(Arrays.deepToString(arrayTest));
      if (arrayTest.length != lengthArray || arrayTest[0].length != lengthArray) {
        throw new MyArraySizeException("Размер массива неверен, должен быть 4X4");
      }
    } catch (MyArraySizeException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Преобразуем массив");
    try {
      for (int i = 0; i < arrayTest.length; i++) {
        for (int j = 0; j < arrayTest[i].length; j++) {

          if (checkForCharacterOccurrence(arrayTest[i][j])) {
            throw MyArrayDataException.forInputString(arrayTest[i][j], i, j);
          }
          sum += Integer.parseInt(arrayTest[i][j]);

        }

      }
    } catch (MyArrayDataException e) {
      System.out.println(e.getMessage());

    }
    System.out.printf("Общая сумма, которую удалось посчитать:  %d%n", sum);
  }

  static boolean checkForCharacterOccurrence(String testText) {
    Matcher matcher = MainArrayException.pattern.matcher(testText);
    return matcher.find();
  }

}
