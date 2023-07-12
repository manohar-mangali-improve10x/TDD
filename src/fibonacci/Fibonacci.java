package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int num = fibonacci.find(7);
       System.out.println(num);
    }
    public  int find(int n) {
        if (n < 0) {
            return -1;
        } else if (n<=0) {
            return 0;
    } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }else {
            return find(n-1) + find(n-2);
        }
    }
    }
//    0,1,1,2,3,5,8,13,21
