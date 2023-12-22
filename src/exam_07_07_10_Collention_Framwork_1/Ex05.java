package exam_07_07_10_Collention_Framwork_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i <=10; i++){
            names.add("이름 +1");
        }
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }
    }
}
