package lesson8;

public class Road implements BarrierOverAction {

  public Road() {
  }

  int distance = 100;

  @Override
  public boolean attemptDoing(ParticipantAction player) {
    return player.runes() > distance;
  }

  @Override
  public void infoAttempt(ParticipantAction player) {
    System.out.printf("Может сразу пробежать %d, а надо %d%n", player.runes(), distance);
  }

}
