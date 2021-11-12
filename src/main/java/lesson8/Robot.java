package lesson8;

public class Robot implements ParticipantAction {

  String name;

  public Robot(String name) {
    this.name = name;
  }

  private int maxDistance = 200;
  private int maxHeight = 1;

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
