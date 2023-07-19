package factorial;

public class Factorial {
    public int findFactorial(int number) {
        int fact = 1;
        if (number < 0) {
            return -1;
        } else if (number > 1) {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
}
