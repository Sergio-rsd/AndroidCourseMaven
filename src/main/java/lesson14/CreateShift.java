package lesson14;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class CreateShift {

  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    logger.info("Begin");
    CreateShift shift = new CreateShift();
    int[] array = {1, 2, 3, 4, 5};
    int n = 2;
    shift.moveArrayByNItems(array, n);
    logger.warn("Информация");
  }
  //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

  public CreateShift() {
  }

  public int[] moveArrayByNItems(int[] arr, int n) {
    System.out.println(Arrays.toString(arr));

    if (Math.abs(n) > arr.length) {
      if (n > 0) {
        n = (n % arr.length);
      } else {
        n = -(n % arr.length);
      }
    }
    logger.error("Может быть ошибка");
    if (n < 0) {
      n = arr.length + n;
    }
    System.out.println("Величина сдвига = " + n);

    for (int j = 0; j < n; j++) {
      int currentIndex = 0;
      int currentItem = arr[ currentIndex ];

      for (int i = 0; i < arr.length; i++) {
        int nextIndex = currentIndex + 1;
        if (nextIndex >= arr.length) {
          nextIndex = nextIndex
              % arr.length;
        }
        int tempItem = arr[ nextIndex ];
        arr[ nextIndex ] = currentItem;
        currentItem = tempItem;
        currentIndex = nextIndex;
      }
    }
    System.out.println(Arrays.toString(arr));
    return arr;
  }
}
