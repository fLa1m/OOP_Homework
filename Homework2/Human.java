package Homework2;

public class Human implements Actions {
    private String name;
    private int maxRunLenght;
    private int maxJumpHeight;
    private boolean inGame;

    public Human(String name, int maxRunLenght, int maxJumpHeight) {
        this.name = name;
        this.maxRunLenght = maxRunLenght;
        this.maxJumpHeight = maxJumpHeight;
        this.inGame = true;
    }

    @Override
    public void run(int value) {
        if (value <= maxRunLenght) {
            System.out.println(name + " преодолел препятствие!");
        } else {
            System.out.println(name + " НЕ преодолел препятствие.");
            inGame = false;
        }
    }

    @Override
    public void jump(int value) {
        if (value <= maxJumpHeight) {
            System.out.println(name + " преодолел препятствие!");
        } else {
            System.out.println(name + " НЕ преодолел препятствие.");
            inGame = false;
        }
    }

    @Override
    public boolean isInGame() {
        if (inGame) {
            return true;
        }
        return false;
    }

}
