package twoMakesTen;

public class Numbers {
    public static void main(String[] args) {
     boolean value = findValue(6,4);
        System.out.printf(String.valueOf(value));
    }

    public static boolean findValue(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10){
            return true;
        } else if (a+b == 10) {
            return true;
        } else if (a<0 && b<0 && a+b <0) {
            return false;
        }
        return result;
    }
}
