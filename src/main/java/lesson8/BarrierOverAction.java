package lesson8;

public interface BarrierOverAction {

  boolean attemptDoing(ParticipantAction player);

  void infoAttempt(ParticipantAction player);

}
