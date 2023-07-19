package divisiblebyfive;

public class Divisible {
    public static void main(String[] args) {
        boolean result = findDivisible(-10);
        System.out.println(result);
    }
    public static boolean findDivisible(int a) {
    if (a % 5 == 0){
        return true;
    }else {
        return false;
    }
    }
}
