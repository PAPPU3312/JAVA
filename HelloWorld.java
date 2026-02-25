public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Nice to meet you, " + name + "!");
        } else {
            System.out.println("No name provided!");
        }
    }
}
