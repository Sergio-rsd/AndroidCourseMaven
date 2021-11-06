package lesson7;

class Plate {

  private int food;

  private final int volumePlate = 40;

  Plate() {
  }

  boolean decreaseFood(int eatFood) {
    if (food - eatFood >= 0) {
      food -= eatFood;
      return true;
    } else {
      System.out.println("В тарелке не хватит еды для следующего кота");
      info();
      return false;
    }
  }

  public void setFood(int food) {
    // учтен обьем тарелки
    if (food > volumePlate) {
      System.out.printf("Сколько не сыпать в тарелку еды, но больше %d не влезет%n", volumePlate);
      this.food = volumePlate;
    } else {
      this.food = food;
    }
  }

  public int getVolumePlate() {
    return volumePlate;
  }

  public int getFood() {
    return food;
  }

  void info() {
    System.out.printf("В тарелке осталось еды: %d%n", food);
  }
}
