package fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        String name = find(-1);
        System.out.println(name);
    }
    public static String find(int i) {
        if (i>0) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else {
                System.out.println(i);
            }
        }
        return i + "";
    }
}