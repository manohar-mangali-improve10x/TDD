package twoMakesTen;

public class Numbers {
    public static void main(String[] args) {
     boolean value = findValue(6,3);
        System.out.printf(String.valueOf(value));
    }

    public static boolean findValue(int a, int b) {
        if (a == 10 || b == 10){
            return true;
        } else if (a+b == 10) {
            return true;
        }

        return false;
    }
}
