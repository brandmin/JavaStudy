package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productsName = new String[maxProducts];
        int[] productsPrice = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택해주세요");
            int menuNum = scanner.nextInt();
            // 문자열 입력받는 코드가 없었음.
            scanner.nextLine();

            if(menuNum == 1) {
                if(productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                productsName[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요");
                productsPrice[productCount] = scanner.nextInt();
                // 카운트 수를 증가하는 코드가 없었음
                productCount++;
            } else if(menuNum == 2) {
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i=0; i<productCount; i++) {
                    System.out.println(productsName[i] + ": " + productsPrice[i] +"원");
                }
            } else if(menuNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴번호를 입력하였습니다.");
            }
        }
    }
}
