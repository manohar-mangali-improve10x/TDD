package templerun;

public class FireBall extends Obstacle{
    public  int speed;
    public FireBall(String name, int damage) {
        super(name, damage);
    }
    public void roll(){
        System.out.println("The" + name + "is rolling with speed of" + speed + "mph");
    }
}
