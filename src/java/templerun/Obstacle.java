package templerun;

public class Obstacle {
    public String name;
    public int damage;

    public Obstacle(String name, int damage) {
        this.name = (name == null) ? "" : name;
        if (damage < 0 || damage >100){
            throw new InvalidDamageException();
        }
    }
    public void collide(Character character){
        System.out.println(name + "has collide with" + character.getName() + "caused" + damage + "damage..");
        character.reduceHealth(damage);
    }

    public String getName() {
        return name;
    }

    public class InvalidDamageException extends RuntimeException{
    }
}
