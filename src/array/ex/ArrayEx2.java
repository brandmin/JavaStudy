package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 내가 풀었던 풀이과정들
//        Scanner scanner = new Scanner(System.in);
//
//        int[] number = new int[5];
//        for(int i=0; i<number.length; i++) {
//            System.out.print("5개의 정수를 입력하세요:");
//            int num = scanner.nextInt();
//            if(i<number.length -1) {
//                System.out.print(",");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i<numbers.length - 1) {
                System.out.print(",");
            }
        }


    }
}
