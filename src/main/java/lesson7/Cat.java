package lesson7;

class Cat {

  private final String name;
  private final int appetite;
  private boolean fullnessCat = false;
  private int currentAppetite = 0;

  Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  void eat(Plate eatCat) {

    if (!fullnessCat) {
      if (eatCat.decreaseFood(appetite - currentAppetite)) {
        fullnessCat = true;
        System.out.printf("%s сьел из тарелки %d еды и сытый%n", name, appetite - currentAppetite);
        currentAppetite = appetite;

      } else if (eatCat.getFood() > 0) { // не хватило наесться, но что-то есть в тарелке
        currentAppetite = currentAppetite + eatCat.getFood();

        if (appetite - currentAppetite == 0) {
          System.out.printf("%s доел из тарелки %d еды и сытый%n", name, eatCat.getFood());
          fullnessCat = true;
        } else {
          System.out.printf("%s поел, но не наелся. Еще бы %d еды%n", name,
              appetite - currentAppetite);
          fullnessCat = false;
        }
        eatCat.setFood(0);
      }
    } else {
      System.out.printf("%s уже сытый и не хочет больше есть%n", name);
    }
    System.out.printf("Текущий уровень сытости %s составляет %d от аппетита %d%n", name,
        currentAppetite, appetite);
  }

  public boolean isFullnessCat() {
    return fullnessCat;
  }

  public String getName() {
    return name;
  }

  void info() {
    if (fullnessCat) {
      System.out.printf("%s наелся%n", name);
    } else {
      System.out.printf("%s голоден%n", name);
    }
  }
}
