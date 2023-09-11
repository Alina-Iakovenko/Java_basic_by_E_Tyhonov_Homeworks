package task3;

public class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("You don`t believe, but your track is playing now");
    }

    @Override
    public void record() {
        System.out.println("You don`t believe, but your track is recording now");
    }

    @Override
    public void pause() {
        System.out.println("Your track is paused now");
    }

    @Override
    public void stop() {
        System.out.println("Your track is stoped now");
    }
}
