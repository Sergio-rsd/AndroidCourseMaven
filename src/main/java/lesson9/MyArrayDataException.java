package lesson9;

public class MyArrayDataException extends NumberFormatException {

  public MyArrayDataException(String e) {
    super(e);
  }

  static MyArrayDataException forInputString(String e, int i, int j) {

    return new MyArrayDataException(String.format(
        "Ячейка двумерного массива с индексами %d и %d не может быть преобразовано в число (%s)%n",
        i,
        j, e));
  }

}
