package LiskovSubstitution;

public class TestMain {
    public static void main(String[] args) {
        SoccerPlayer defender = new Defender();
        System.out.println("Mudafieci: " + defender.topuAyaqlaVurdum());
        System.out.println("-------------------------------");
        SoccerPlayer goalKepper = new GoalKeeper();
        System.out.println("Qapici: " + goalKepper.topuAyaqlaVurdum());
        System.out.println("-------------------------------");
        System.out.println("Qapici: " + GoalKeeper.topuTutdum());


    }
}
