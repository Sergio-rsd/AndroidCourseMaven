package lesson10;

public class ChangePlace {

  public static void main(String[] args) {
    // Задача 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

    createArrays();

  }

  private static void createArrays() {
    final int SIZE = 5;
    int positionOne = 1;
    int positionTwo = 4;
    String text = "Замена элемента в позиции %d на позицию %d%n";
    ChangeOfPlace<Integer> intArray = new ChangeOfPlace<>(SIZE);
    ChangeOfPlace<String> stringArray = new ChangeOfPlace<>(SIZE);
    for (int i = 0; i < SIZE; i++) {
      intArray.add(i + 1);
      stringArray.add("z" + i);
    }
    intArray.display();
    System.out.printf(text, positionOne + 1, positionTwo + 1);
    intArray.exchange(positionOne, positionTwo);
    intArray.display();
    stringArray.display();
    System.out.printf(text, positionOne + 1, positionTwo + 1);
    stringArray.exchange(positionOne, positionTwo);
    stringArray.display();

  }

}

