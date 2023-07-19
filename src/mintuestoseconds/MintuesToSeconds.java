package mintuestoseconds;

public class MintuesToSeconds {
    public int findSeconds(int min) {
        int value = 0;
        if (min>=0){
            value = min * 60;
        }else {
            value = -1;
        }
        return value;
    }
}
