package templerun;

public class Player extends Character{
    private String name;
    private int health;
    private int totalCoinValue;
    private int score;
    public Player(String name) {
        super(name,100);
        this.name = (name == null) ? "" : name.trim();
        this.health = 100;
    }

    public Player(String name, int health) {
        super(name, health);
        this.name = (name == null) ? "" : name.trim();
        if (health < 0 || health > 100) {
            throw new InvalidHealthException();
        }
            this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void run() {
        System.out.println("Running...!");
    }

    public int getScore() {
        score = totalCoinValue;
        return score;
    }

    public void collectCoin(Coin coin) {
        this.totalCoinValue += coin.getValue();

    }

    public void jump() {
        System.out.println(name + " jump to avoid obstacle");
    }

    public class InvalidHealthException extends RuntimeException {
    }
}
