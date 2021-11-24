package lesson10;

public class FruitBoxCompare {

  public static void main(String[] args) {
    int putOrange = 6;
    int putApple = 5;
    Orange orange = new Orange();
    Apple apple = new Apple();

    Box<Orange> orangeBox1 = new Box<>();
    Box<Orange> orangeBox2 = new Box<>();
    Box<Orange> orangeBox3 = new Box<>();

    Box<Apple> appleBox = new Box<>();

    for (int i = 0; i < putOrange; i++) {
      orangeBox1.add(orange);
    }
    orangeBox2.add(orange);
    orangeBox2.add(orange);

    System.out.println("Коробка №1 с апельсинами весит: " + orangeBox1.getWeight());
    System.out.println("Коробка №2 с апельсинами весит: " + orangeBox2.getWeight());
    System.out.println("Коробка №3 (пустая) с апельсинами весит: " + orangeBox3.getWeight());

    for (int i = 0; i < putApple; i++) {
      appleBox.add(apple);
    }
    System.out.println("Коробка с яблоками весит: " + appleBox.getWeight());
    System.out.printf("Сравним вес коробок с апельсинам(№1) и яблоками- %s%n", orangeBox1.compare(appleBox)? "равны": "не равны");
    System.out.println("Пересыпим апельсины из корбки №1 в коробку №2");
    orangeBox1.pourOver(orangeBox2);

    System.out.println("Коробка №1 с апельсинами весит: " + orangeBox1.getWeight());
    System.out.println("Коробка №2 с апельсинами весит: " + orangeBox2.getWeight());
    System.out.println("Пересыпим апельсины из корбки №2 в коробку №3 (пустую)");
    orangeBox2.pourOver(orangeBox3);
    System.out.println("Коробка №1 с апельсинами весит: " + orangeBox2.getWeight());
    System.out.println("Коробка №2 с апельсинами весит: " + orangeBox3.getWeight());
  }
}