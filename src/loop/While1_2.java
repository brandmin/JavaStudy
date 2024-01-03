package loop;

public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

        // count 값이 3일때 while문이 종료된다.
        while(count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는:" + count);
        }
    }
}
