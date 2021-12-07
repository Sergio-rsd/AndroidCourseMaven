package lesson14;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CreateEqualSides {

  private static final Logger file = Logger.getLogger("file");

  public static void main(String[] args) {

    PropertyConfigurator.configure("src/main/resources/logs/configs/log4j.properties");

    int[] arr1 = {1, 1, 1, 2, 1};
    int[] arr2 = {2, 1, 1, 2, 1};

    CreateEqualSides balance = new CreateEqualSides();

    System.out.println(Arrays.toString(arr1) + ": " + (balance.checkBalance(arr1)));
    System.out.println(Arrays.toString(arr1) + ": " + (balance.checkBalance(arr2)));
  }

  public CreateEqualSides() {
  }

  public boolean checkBalance(int[] array) {
    //  7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    int sumTotal = 0;
    int sumRight;
    int sumLeft = 0;

    for (int num : array) {
      sumTotal += num;
    }
    file.info("общая сумма посчитана");

    for (int value : array) {
      sumLeft += value;
      sumRight = sumTotal - sumLeft;
      if (sumLeft == sumRight) {
        System.out.println("Левая и правая часть массива РАВНЫ");
        file.info("левая и правая часть массива РАВНЫ");
        return true;
      }
    }
    System.out.println("Левая и правая часть массива не равны");
    file.warn("массив не удачно подобран - части не равны");
    return false;
  }
}
