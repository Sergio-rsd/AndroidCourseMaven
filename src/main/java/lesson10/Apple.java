package lesson10;

public class Apple extends Fruit{

  String name;
  float weightFruit;

  public Apple() {
    this.name = "Яблоко";
    this.weightFruit = 1.0f;
  }

  public float getWeightFruit() {
    return this.weightFruit;
  }
}
