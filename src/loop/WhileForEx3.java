package loop;

public class WhileForEx3 {
    public static void main (String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        sum = 0;

        for (int j = 1; j <= max; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

    }
}
