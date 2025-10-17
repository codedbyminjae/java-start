package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers =  new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number + " ");
        }
        
        // iter 사기 단축키

        // for - each를 사용할 수 없는 경우, 증가하는 index값이 필요한 경우에는 사용할 수 없다.
        // 이미 증가되는 순회하는 반복문이 만들어져 있는 경우나, 리스트, 배열을 순회하는 경우에만 사용.

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
