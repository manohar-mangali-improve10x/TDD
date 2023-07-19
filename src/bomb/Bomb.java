package bomb;

public class Bomb {
    public static void main(String[] args) {
        String name = find("");
        System.out.println(name);
    }
    public static String find(String text) {
        String result = "";
        if (text == null){
            return "null";
        }
        if (text == ""){
            return "";
        }
        if (text.toLowerCase().contains("bomb")){
            result = "Duck";
        }else {
            result = "relax ,there is no bomb";
        }
            return result;
        }

    }
