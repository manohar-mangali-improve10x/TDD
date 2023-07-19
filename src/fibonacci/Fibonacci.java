package fibonacci;

public class Fibonacci {
    public int find(int number) {
        if (number<0){
            return -1;
        } else if (number == 0) {
            return -1;
        } else if (number == 1) {
          return 0;
        }
        return number;
    }
}
