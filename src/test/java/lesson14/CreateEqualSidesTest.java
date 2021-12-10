package lesson14;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateEqualSidesTest {

  @Test
  void testBalance() {

    CreateEqualSides balance = new CreateEqualSides();
    int[] arr3 = {10, 10};
    Assertions.assertEquals(true, balance.checkBalance(arr3));
  }

  @Test
  void testBalance2() {

    CreateEqualSides balance = new CreateEqualSides();
    int[] arr2 = {2, 1, 1, 2, 1};
    Assertions.assertEquals(true, balance.checkBalance(arr2));

  }

  @Test
  void testBalance3() {

    CreateEqualSides balance = new CreateEqualSides();
    int[] arr4 = {2, 2, 2, 1, 2, 2, 10, 1};
    Assertions.assertEquals(true, balance.checkBalance(arr4));

  }
}