package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent (String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent (Student student) {
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }

    // java에서 new는 항상 “새로운 힙 메모리 공간”을 만들어주고,
    // 그 공간의 주소값이 매번 달라진다.
}
