package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력해주세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        System.out.println(count + "개의 정수를 입력하세요:");
        int total = 0;
        for(int i=0; i<numbers.length; i++) {
            // 사용자로부터 입력받은 데이터 속성을 추가하지 않음.
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double average = total / numbers.length;
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
