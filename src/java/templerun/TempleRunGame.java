package templerun;

import java.util.Random;

public class TempleRunGame {
    public static void main(String[] args) {
        Player player = new Player("adventure",100);
        int[] coinValues = {10,20,30,40,50,60};
        boolean isGameBegin = true;
        Random random = new Random();
        System.out.println("Welcome to Temple run...!");
        while (isGameBegin){
            player.run();
            int obstacleType = random.nextInt(3);
            if (obstacleType == 1){
                FireBall fireBall = new FireBall(random.nextInt(30)+ 10);
                fireBall.roll();
                fireBall.collide(player);
            } else if (obstacleType == 2) {
                SpikePit spikePit = new SpikePit(random.nextInt(10) +5);
                spikePit.trap(player);
            }else {
                int randomIndexValue = random.nextInt();
                Coin coin = new Coin(coinValues[randomIndexValue]);
                player.collectCoin(coin);
            }
        }
        if (player.getHealth()<=0){
            System.out.println("game Over..!" + player.getScore());
            isGameBegin = false;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
