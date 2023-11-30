package exam_07_05_Class_class_1;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException{
        // 예외전가
       /**
        Class cls1 = Book.class;

        Book book = new Book();
        Class cls2 = book.getClass();
        */

       Class.forName("exam01.Book");

    }
}
