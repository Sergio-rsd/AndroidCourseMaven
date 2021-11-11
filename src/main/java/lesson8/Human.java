package lesson8;

public class Human implements ParticipantAction {

  String name;

  public Human(String name) {
    this.name = name;
  }

  private int maxDistance = 120;
  private int maxHeight = 3;

  @Override
  public int runes() {
    return maxDistance;
  }

  @Override
  public int jumps() {
    return maxHeight;
  }

  @Override
  public String nameParticipant() {
    return name;
  }
}
