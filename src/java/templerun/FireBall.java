package templerun;

public class FireBall extends Obstacle{
    public  int speed;
    public FireBall(int speed) {
        super("fire",50);
        if (speed < 0 || speed >100){
            throw new InvalidFireBallException();
        }
        this.speed = speed;
    }
    public void roll(){
        System.out.println("The" + name + "is rolling with speed of" + speed + "mph");
    }

    public class InvalidFireBallException extends RuntimeException {
    }
}
