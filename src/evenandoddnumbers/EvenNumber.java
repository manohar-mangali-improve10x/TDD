package evenandoddnumbers;

public class EvenNumber {
    public static void main(String[] args) {
        boolean v = find(2);
        System.out.println(v);
    }
    public static boolean find(int i) {
        if (i % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
