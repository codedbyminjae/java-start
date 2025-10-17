package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("출력");

        int count = 0;
        for (int number : numbers) {
            System.out.print(number);
            if (count != numbers.length - 1) {
                System.out.print(", ");
            }
            count++;
        }
    }
}
