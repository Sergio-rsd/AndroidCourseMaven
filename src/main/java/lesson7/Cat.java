package lesson7;

class Cat {

  private final String name;
  private final int appetite;
  private boolean fullnessCat = false;

  Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  void eat(Plate p) {
    if (!fullnessCat) {
      if (p.decreaseFood(appetite)) {
        fullnessCat = true;
        System.out.printf("%s сьел из тарелки %d еды и сытый%n", name, appetite);
      } else {
        fullnessCat = false;
      }
    } else {
      System.out.printf("%s уже сытый и не хочет больше есть%n", name);
    }
  }

  void info() {
    if (fullnessCat) {
      System.out.printf("%s наелся%n", name);
    } else {
      System.out.printf("%s голоден%n", name);
    }
  }
}
