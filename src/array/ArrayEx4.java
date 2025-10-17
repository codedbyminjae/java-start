package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        int total = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            total = total + numbers[i];
        }

        double average = (double) total / 5;

        System.out.println(total);
        System.out.println(average);


    }
}
