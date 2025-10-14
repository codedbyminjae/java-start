package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int num = sc.nextInt();

        String a;
        if (num % 2 == 0) {
            a = "짝수";
        } else {
            a = "홀수";
        }

        System.out.println("입력한 숫자 " + num + "는 " + a + "입니다.");
    }
}
