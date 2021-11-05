package lesson7;

class Plate {

  private int food;
  // не учтен обьем тарелки
  private final int volumePlate = 40;

  Plate(int food) {
    this.food = food;
  }

  boolean decreaseFood(int eatFood) {
    if (food - eatFood >= 0) {
      food -= eatFood;
      return true;
    } else {
      System.out.println("В тарелке не хватило еды для кота");
      return false;
    }
  }

  public void setFood(int food) {
    this.food = food;
  }

  void info() {
    System.out.printf("В тарелке осталось еды: %d%n", food);
  }
}
