package reminder;

public class Reminder {
    public static void main(String[] args) {
        findDivision(22, 5);
    }

    public static int findDivision(int a, int b) {
        int value = a % b;
        return value;
    }
}
