package Homework2;

public class RunningTrack extends Barrier {
    private String name;
    private int lengthTrack;
    private Actions currentPlayer;

    public RunningTrack(String name, int lengthTrack) {
        this.name = name;
        this.lengthTrack = lengthTrack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void overcome(Actions player) {
        currentPlayer = player;
        player.run(lengthTrack);
    }

}
