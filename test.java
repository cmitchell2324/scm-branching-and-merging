public class test {
    public static void main(String[] args) {
        System.out.println("Hello from main");
        int num = 22;
        System.out.println("The value of the num is: " + num);
        newMethod();
    }

    public static void testMethod() {
        System.out.println("Testing some code for the main branch");
        System.out.println("Testing some more code");
        double val = 3.2434;
        System.out.println("The value of val is: " + val);
    }

    public static void experimentalMethod() {
        System.out.println("This is some code I did in the test-branch.");
        System.out.println("I'm trying some stuff out here");
        boolean isTrue = true;
        System.out.println(isTrue);
    }
    
    public static void anotherMethod() {
        System.out.println("This is another commit");
        System.out.println("I definetely do not like like this");
    }

    public static void newMethod() {
        System.out.println("Hello there");
        int num = 34;
        System.out.println(num);
    }
}
