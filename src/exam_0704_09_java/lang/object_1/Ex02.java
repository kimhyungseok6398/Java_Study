package exam_0704_09_java.lang.object_1;

public class Ex02 extends Object {
    public static void main(String[] args) {
        Book book = new Book("책1", "저자1", "출판사1");
        System.out.println(book); // book.toString()
        // Book에서 tostring메서드를 정의했기에
        // 객체 주소값에서 Book{title='책1', author='저자1', publisher='출판사1'}로 출력
    }
}
