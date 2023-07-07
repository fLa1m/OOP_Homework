package Homework2;

public class Main {
    public static void main(String[] args) {
        Actions[] players = {
                new Human("Alex", 100, 4),
                new Cat("Barsik", 150, 6),
                new Robot("Terminator", 1000, 10)
        };

        Barrier[] track = {
                new RunningTrack("Дорожка №1", 50),
                new Wall("Стена №1", 2),
                new RunningTrack("Дорожка №2", 150),
                new Wall("Стена №2", 6),
                new RunningTrack("Дорожка №3", 200),
                new Wall("Стена №3", 8)
        };

        for (Actions player : players) {
            for (Barrier barrier : track) {
                if (player.isInGame()) {
                    System.out.println("<" + barrier.getName() + ">");
                    barrier.overcome(player);
                    System.out.println("-----");
                }
            }
        }
    }
}
