package ref;

public class MethodChange2 {

    public static void main (String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(dataA.value);
        changeReference(dataA);
        System.out.println(dataA.value);
    }

    static void changeReference (Data dataX) {
        dataX.value = 20;
    }

    // 기본형은 원본 불변, 참조형은 내부 변경 가능이라는 결과.
}
