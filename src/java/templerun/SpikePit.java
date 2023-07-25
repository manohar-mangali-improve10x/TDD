package templerun;

public class SpikePit extends Obstacle{

    public int width;
    public SpikePit(int width) {
        super("SpikePit",100);
        if (width < 0 || width > 30){
            throw new InvalidSpikePitException();
        }
//        this.width = width;
    }
    public void trap(Character character){
        System.out.println(name + "trapped" + character.getName() + "inside it" + width + "meters");
        character.reduceHealth(damage);
    }

    public class InvalidSpikePitException extends RuntimeException {
    }
}
