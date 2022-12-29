package LiskovSubstitution;

public class Defender extends SoccerPlayer {

    @Override
    String topuQapiyaVurdum() {
        return "topu reqib qapiya vurdum qol oldu";
    }

    @Override
    String topuAyaqlaVurdum() {
        return "hucumcuya pas oturdum";
    }
}
