package LiskovSubstitution;

public class GoalKeeper extends SoccerPlayer {

    @Override
    String topuQapiyaVurdum() {
        return "topu reqib qapiya vurdum";
    }

    @Override
    String topuAyaqlaVurdum() {
        return "topu ayaq ile vurub uzaqlasdirdim";
    }

    public static String topuTutdum() {
        return "reqib oyuncu topu qapiya vurdu, mende topu elimnen tutdum";
    }
}
