package exam_0704_09_java.lang.object_1;

import java.lang.reflect.*;

public class Ex01 {
    public static void main(String[] args) {
      Class cls = Book.class;
      // 클래스 클래스는 객체 정보가 담겨있는 객체
        Field[] fields = cls.getFields();
        Constructor[] constructors = cls.getConstructors();
        Method[] method = cls.getMethods();

        System.out.println("-----Field-----");
        for (Field field : fields){
            System.out.println(field);

            System.out.println("----Constructor-----");
            for (Constructor constructor : constructors){
                System.out.println(constructor);
            }
        }
    }
}
