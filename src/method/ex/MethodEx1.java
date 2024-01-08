package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        System.out.println("1번 자료의 평균값은 " + average(1,2,3));
        System.out.println("1번 자료의 평균값은 " + average(15,25,35));
    }

    public static double average(int a, int b, int c) {
        int sum = a+b+c;
        return sum/3.0;
        // 리턴형을 아래에 적는 것보단 위에 적자.
        //return average;
    }
}
