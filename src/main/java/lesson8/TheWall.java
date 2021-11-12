package lesson8;

public class TheWall implements BarrierOverAction {

  public TheWall() {
  }

  int height = 2;

  @Override
  public boolean attemptDoing(ParticipantAction player) {

    return player.jumps() > height;

  }

  @Override
  public void infoAttempt(ParticipantAction player) {
    System.out.printf("Прыгает на %d, а стена высотой %d%n", player.jumps(), height);
  }

}
