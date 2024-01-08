package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 금액은 " + balance + "원 입니다.");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔약: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            int menuNum = scanner.nextInt();
            int amount;

            if(menuNum == 1) {
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance += deposit(balance, amount);
            } else if(menuNum == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance -= withdraw(balance, amount);
            } else if(menuNum == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if(menuNum == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }
}
