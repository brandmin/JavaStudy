package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최곳값
        long maxIntOver = 2147483648L; // int 최곳값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환. 위의 maxIntOver 숫자 크기를 늘리면 작은 범위의 값부터 다시 시작. (오버플로우)
        System.out.println("maxIntOver casting = " + intValue);
    }
}
