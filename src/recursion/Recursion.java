package recursion;

public class Recursion {
    public static void main(String[] args) {
        int num = calculate(5);
        System.out.println(num);
    }
    public static int calculate(int i) {
        int value = 0;
        if (i == 1){
            return 1;
        }else {
            value = i + calculate(i-1);
        }
        return value;
    }
}
