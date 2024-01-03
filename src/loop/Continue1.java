package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i=1,2,3
        while(i <= 5) {
            if(i == 3) {
                i++;
                continue; // 조건식으로 이동하면 아래 코드는 무시되고 위의 while문으로 이동한다.
            }
            System.out.println(i);
            i++;
        }
    }
}
