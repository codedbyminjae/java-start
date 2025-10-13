package loop;

public class WhileForEx2 {
    public static void main (String[] args) {
        int num = 0;

        while (num < 20) {
            num = num + 2;
            System.out.println(num);
        }

        for (int i = 1; i <= 20; i++) {
            i = i + 1;
            System.out.println(i);
        }
    }
}
