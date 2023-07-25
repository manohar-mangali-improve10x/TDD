package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObstacleTest {
    @Test
    public void givenNameNull_returnEmpty(){
        Obstacle obstacle = new Obstacle(null,100);
        assertEquals("",obstacle.getName());
    }

    @Test
    public void givenNameEmpty_returnEmpty(){
        Obstacle obstacle = new Obstacle("",100);
        assertEquals("",obstacle.getName());
    }

    @Test
    public void givenNameExplorer_returnExplorer(){
        Obstacle obstacle = new Obstacle("Explorer",100);
        assertEquals("Explorer",obstacle.getName());
    }

}
