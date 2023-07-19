package convertseconds;

public class HoursToSeconds {
    public int findSeconds(int hour, int min) {
        int result = 0;
        if (hour>=0 && min>=0){
            result = hour * 60 * 60 + min * 60;
        }else {
            return -1;
        }

        return result;
    }
}
