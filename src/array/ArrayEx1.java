package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = new int[] {90, 80, 70, 60, 50};

        int total = 0;
        for (int student : students) {
            total = total + student;
        }

        double average = (double) total / 5;

        System.out.println(total);
        System.out.println(average);
    }
}
