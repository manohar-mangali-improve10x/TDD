package powercalculate;

public class Power {
    public int find(int a, int b) {
        int value = a *b;
        if (value >= 0){
            return value;
        }else {
            return -1;
        }
    }
}
