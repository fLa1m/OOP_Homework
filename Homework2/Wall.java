package Homework2;

public class Wall extends Barrier {
    private String name;
    private int heightWall;
    private Actions currentPlayer;

    public Wall(String name, int heightWall) {
        this.name = name;
        this.heightWall = heightWall;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void overcome(Actions player) {
        currentPlayer = player;
        player.jump(heightWall);
    }

}
