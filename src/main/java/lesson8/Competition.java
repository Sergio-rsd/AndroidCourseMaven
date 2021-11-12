package lesson8;

public class Competition {

  public static void main(String[] args) {
    Human human = new Human("Человек Вася");
    Robot robot = new Robot("Робот JFK-17");
    Cat cat = new Cat("Кот Мурзик");
    TheWall wall = new TheWall();
    Road road = new Road();
    ParticipantAction[] participants = {human, robot,cat};
    BarrierOverAction[] barrier = {road, wall};

    for (ParticipantAction participant : participants) {
      System.out.printf("На дистанции участник %s%n", participant.nameParticipant());
      for (BarrierOverAction barrierOverAction : barrier) {
        if (barrierOverAction.attemptDoing(participant)) {
          barrierOverAction.infoAttempt(participant);
          System.out.printf("Участник %s преодолел этап соревнований%n",
              participant.nameParticipant());
        } else {
          barrierOverAction.infoAttempt(participant);
          System.out.printf("Участник %s сошел с дистанции соревнований%n",
              participant.nameParticipant());
          break;
        }
      }
    }
  }

}
