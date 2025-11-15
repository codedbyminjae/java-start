package constructor.ex;

public class BookMain {
    public static void main(String[] args) {
        // basic constructor
        Book book1 = new Book();
        book1.displayInfo();

        // title, author
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        // all field
        Book book3 = new Book("JPA 프로그래밍", "KIM", 800);
        book3.displayInfo();
    }
}

//필드 = 객체가 들고 다니는 변수
//매개변수 = 메서드 호출할 때 전달하는 변수
//지역변수 = 메서드 안에서 잠깐 쓰이는 변수