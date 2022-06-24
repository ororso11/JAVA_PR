import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args) {

        // 홀수 짝수 판별
        int sec = LocalDateTime.now().getSecond();

        if( sec % 2 == 0 ) {
            System.out.println(sec + "는 짝수 입니다.");
        } else {
            System.out.println(sec + "는 홀수 입니다.");
        }

        // 계절 판별

        int month = LocalDateTime.now().getMonthValue();

        if( 3 <= month && month <= 5 ) {
            System.out.println(month + "월은 봄 입니다.");
        } else if( 6 <= month && month <= 8 ) {
            System.out.println(month + "월은 여름 입니다.");
        } else if( 9 <= month && month <= 11 ) {
            System.out.println(month + "월은 가을 입니다.");
        } else {
            System.out.println(month + "월은 겨울 입니다.");
        }

        // 계절 판별

        Month montn = LocalDateTime.now().getMonth();

        switch (montn) {
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(montn + "는 봄이다.");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(montn + "는 여름이다");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(montn + "는 가을이다.");
                break;
            default:
                System.out.println(montn + "는 겨울이다.");
                break;
        }

        // 1~10까지의 합
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i + "번쨰" + sum);
        }

        // for-each
        int[] numbres = {1,1,2,3,5,8,13,21};
        for(int numbers : numbres) {
            System.out.println(numbers);
        }

        // 둘다 조건이 일치할경우에만 실시된다
        // do-while : 적어도 조건을 한번 실행하는경우, while이 주로 많이쓰인다.
        Scanner in = new Scanner(System.in);
        System.out.println("암호를 입력해주세요");
        // nextLine == 문자열을 입력받아 리턴
        String str = in.nextLine();
        while (!str.equals("abc")) {
            System.out.println("암호가 틀립니다");
            str = in.nextLine();
        }

        System.out.println("OK");

    }
}
