package endswith;

public class EndsWith {
    public boolean find(String name, String key) {
        boolean result = false;
        if (name.endsWith(key)) {
            result = true;
        }
        return result;
    }
}
