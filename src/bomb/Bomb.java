package bomb;

public class Bomb {
    public static void main(String[] args) {
        String name = find("there is Manohar ");
        System.out.println(name);
    }
    public static String find(String text) {
        if (text.contains("Bomb")){
            return "Duck";
        }else if (text.contains("Manohar")){
            return "Manu";
        }
        return "relax ,there is no bomb";
    }
}
