package lesson7;

public class EatCat {

  public static void main(String[] args) {
    int addEat = 50;
    Cat cat = new Cat("Барсик", 15);
    Cat cat1 = new Cat("Пушок", 20);
    Cat cat2 = new Cat("Мурзик", 25);
    Cat[] catTeam = {cat, cat1, cat2};
    Plate plate = new Plate(39);
    plate.info();
    for (Cat catHungry : catTeam) {
      catHungry.eat(plate);
      catHungry.info();
    }
    plate.info();
    // добавляем еды и снова кормим
    System.out.printf("Добавим в тарелку еще %d еды!!%n",addEat);
    plate.setFood(addEat);
    for (Cat catHungry : catTeam) {
      catHungry.eat(plate);
      catHungry.info();
    }
    plate.info();
  }

}
