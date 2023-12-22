package exam_07_07_10_Collention_Framwork_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<>();
       //LinkedList<String> names = new LinkedList<>();
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>(names);
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        /*
        for (int i = 0;i < names.size();i++){
            names.remove(i);
        }

         */
        for(int i = names.size() - 1; i >= 0;i--){
           String name =  names.remove(i);
           System.out.println(name);
        }
        for (int i = 0;i < names.size();i++){
            //현재 담겨있는 요소의 개수
            String name = names.get(i);
            System.out.println(name);
        }

        //System.out.println(names);
    }
}
