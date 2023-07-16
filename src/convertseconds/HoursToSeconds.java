package convertseconds;

public class HoursToSeconds {
    public int findSeconds(int hour, int min) {
        int result = 0;
        result = hour * 60 * 60 + min * 60;
        return result;
    }
}
