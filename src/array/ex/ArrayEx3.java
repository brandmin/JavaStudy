package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        // 역순이기에 4,3,2,1,0 인덱스 사용해야함. 총 5개. 배열이기에 0을 포함해야 한다.
        for(int i=numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]);
            if(i > 0) {
                System.out.print(",");
            }
        }
    }
}
