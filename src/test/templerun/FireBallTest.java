package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FireBallTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenMinusOne_thenThrowsInvalidFireBallException(){
        assertThrows(FireBall.InvalidFireBallException.class,
                () -> new FireBall(-1),
                "FireBall speed between 0 to 100");
    }

    @Test
    public void given101_thenThrowsInvalidFireBallException(){
        assertThrows(FireBall.InvalidFireBallException.class,
                () -> new FireBall(-1),
                "FireBall speed between 0 to 100");
    }
    @Test
    public void given0_thenGetSpeedCalled_thenReturn0(){
       assertEquals(0,new FireBall(0).getSpeed());
    }

    @Test
    public void given10_thenGetSpeedCalled_thenReturn10(){
        assertEquals(10,new FireBall(10).getSpeed());
    }
    @Test
    public void given100_thenGetSpeedCalled_thenReturn100(){
        assertEquals(100,new FireBall(100).getSpeed());
    }
}
