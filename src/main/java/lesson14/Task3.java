package lesson14;

import java.util.Arrays;

public class Task3 {

  public static void main(String[] args) {

    createSevenEqualSides();
    createShift();

  }

  private static void createSevenEqualSides() {
//  7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    int[] arr1 = {1, 1, 1, 2, 1};
    int[] arr2 = {2, 1, 1, 2, 1};
    int[] arr3 = {10, 10};
    int[] arr4 = {2, 2, 2, 1, 2, 2, 10, 1};
    int[] arr5 = {1, 1, 1, 2, 1};

    System.out.println(checkBalance(arr1));
    System.out.println(checkBalance(arr2));
    System.out.println(checkBalance(arr3));
    System.out.println(checkBalance(arr4));
    System.out.println(checkBalance(arr5));
  }

  private static boolean checkBalance(int[] array) {
    int sumTotal = 0;
    int sumRight;
    int sumLeft = 0;

    for (int num : array) {
      sumTotal += num;
    }

    for (int value : array) {
      sumLeft += value;
      sumRight = sumTotal - sumLeft;
      if (sumLeft == sumRight) {
        return true;
      }
    }
    return false;
  }

  //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
  private static void createShift() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//    int[] array = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(array));
    int n = Util.readIntArgument("Введите число для сдвига (можно отрицательное): ");
    moveArrayByNItems(array, n);
    System.out.println(Arrays.toString(array));
  }

  private static void moveArrayByNItems(int[] arr, int n) {
    // Если n > длины массива, берем такое значение, при котором сдвиг массива будет аналогичным (остаток от деления)
    if (Math.abs(n) > arr.length) {
      if (n > 0) {
        n = (n % arr.length);
      } else {
        n = -(n % arr.length);
      }
    }
    // Если n отрицательное и модуль n меньше длины массива, берем такое положительное значение, при котором сдвиг массива будет аналогичным влево
    if (n < 0) {
      n = arr.length + n;
    }
    System.out.println("Величина сдвига = " + n);

    // Двигаем массив по часовой стрелке на одну позицию n количество раз
    for (int j = 0; j < n; j++) {
      int currentIndex = 0;
      int currentItem = arr[currentIndex];

      for (int i = 0; i < arr.length; i++) {
        int nextIndex = currentIndex + 1;
        if (nextIndex >= arr.length) {
          nextIndex = nextIndex
              % arr.length; // следующий индекс больше длины массива -> остаток берем -> перескакиваем на начало массива на остаток
        }
        int tempItem = arr[nextIndex];
        arr[nextIndex] = currentItem;
        currentItem = tempItem;
        currentIndex = nextIndex;
      }
    }
  }
}