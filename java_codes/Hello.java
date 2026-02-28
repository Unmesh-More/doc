public class Hello {
    public static void main(String[] args) {

        if (args.length >= 2) {
            String name = args[0];
            String age = args[1];

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Please provide 2 inputs");
        }
    }
}