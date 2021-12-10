package lesson14;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreateShiftTest {

  private CreateShift shift;

  @BeforeAll
  static void mainStart() {
    System.out.println("Начинаем тест");

  }

  @BeforeEach
  void start() {
    shift = new CreateShift();
  }

  @Test
  void testShift1() {
//    CreateShift shift = new CreateShift();
    int[] arrTest = {1, 2, 3, 4, 5};
    int[] arrExpected = {5, 4, 1, 2, 3};
    System.out.println("Хотим увидеть " + Arrays.toString(arrExpected));
    int n = 2;
    try {
      Assertions.assertArrayEquals(arrExpected, shift.moveArrayByNItems(arrTest, n));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void testShift2() {
//    CreateShift shift = new CreateShift();
    int[] arrTest = {1, 2, 3, 4, 5};
    int[] arrExpected = {4, 5, 1, 2, 3};
    System.out.println("Хотим увидеть " + Arrays.toString(arrExpected));
    int n = 2;
    try {
      Assertions.assertArrayEquals(arrExpected, shift.moveArrayByNItems(arrTest, n));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}