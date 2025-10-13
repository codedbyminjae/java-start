package loop;

public class NestedEx2 {
    public static void main (String[] args) {
        int row = 100;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
