package cond;

public class GradeSwitchEx {
    public static void main (String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("탁월한 성과 입니다.");
                break;
            case 'B':
                System.out.println("좋은 성과 입니다.");
                break;
            case 'C':
                System.out.println("준수한 성과 입니다.");
                break;
        }
    }
}
