public class MessageGenerator {
    public static void main(String[] args) {
        MessageGenerator hello = new MessageGenerator();
        System.out.println(hello.sayWelcome());
    }
    String sayWelcome() {
        return "welcome";
    }
}

