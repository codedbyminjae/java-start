package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int total = 0;
        double average;

        System.out.println(n +"개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        average = (double) total / n;

        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
