package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;
        System.out.println("입금 금액: " + deposit(balance, 1000) + "원");
        System.out.println("출금 금액: " + withdraw(balance, 2000) + "원");

        System.out.println("최종 잔액: " + balance + "원");

    }


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
}

