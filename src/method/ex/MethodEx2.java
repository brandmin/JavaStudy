package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        loop("Hello, World!", 3);
        loop("Hello, World!", 5);
        loop("Hello, World!", 7);

    }

    public static void loop(String message, int num) {
        for(int i=0; i<num; i++) {
            System.out.println(message);
        }

    }

}
