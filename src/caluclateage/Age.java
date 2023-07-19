package caluclateage;

public class Age {
    public int caluculateAge(int age) {
        int value = -1;
        if (age == 0){
            value = 0;
        } else if (age >0){
            value = age * 365;
        }
        return value;
    }
}
