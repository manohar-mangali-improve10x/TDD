package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ObstacleTest {
    @Test
    public void givenNameNull_thenGetNameCalled_returnEmpty(){
        Obstacle obstacle = new Obstacle(null,100);
        assertEquals("",obstacle.getName());
    }

    @Test
    public void givenNameEmpty_thenGetNameCalled_returnEmpty(){
        Obstacle obstacle = new Obstacle("",100);
        assertEquals("",obstacle.getName());
    }

    @Test
    public void givenNameExplorer_thenGetNameCalled_returnExplorer(){
        Obstacle obstacle = new Obstacle("Explorer",100);
        assertEquals("Explorer",obstacle.getName());
    }
    @Test
    public void givenNameExplorerSpace_thenGetNameCalled_returnExplorer(){
        Obstacle obstacle = new Obstacle("  Explorer  ",100);
        assertEquals("Explorer",obstacle.getName());
    }

    @Test
    public void givenDamageMinusOne_thenThrowsInvalidDamageException(){
        assertThrows(Obstacle.InvalidDamageException.class,
                () -> new Obstacle("name",-1),
                "Health should be between 0 to 100");
    }

    @Test
    public void givenDamage101_thenThrowsInvalidDamageException(){
        assertThrows(Obstacle.InvalidDamageException.class,
                () -> new Obstacle("name",101),
                "Health should be between 0 to 100");
    }
    @Test
    public void given10_thenGetDamageCalled_return10(){
        Obstacle obstacle = new Obstacle("Explorer",10);
        assertEquals(10,obstacle.getDamage());
    }
    @Test
    public void given20_thenGetDamageCalled_return20(){
        Obstacle obstacle = new Obstacle("Explorer",20);
        assertEquals(20,obstacle.getDamage());
    }
}
