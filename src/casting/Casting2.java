package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생(타입)
        intValue = (int) doubleValue; // int형으로 형변환
        System.out.println(intValue);
    }
}
