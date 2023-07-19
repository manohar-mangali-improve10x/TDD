package namegreeting;

public class Greeting {
    public String helloName(String name) {
        String nameGreetings = "";
        if(name == null) {
            return null;
        }
        if(name.trim() == "") {
            return "";
        } else {
            String nameGreeting = "Hello " + name + "!";
            return nameGreeting;
        }
    }

}
