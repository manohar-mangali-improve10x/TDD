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
}
