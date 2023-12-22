package exam_07_10_09_Collention_Framwork_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex05 {
    public static void main(String[] args) {
        Map<String, String> members = new TreeMap<>();
        // TreeMap 을 넣을경우 키값에 대한 정렬
        members.put("user03", "123456");
        members.put("user04", "123456");
        members.put("user01", "123456");
        members.put("user02", "123456");
        members.put("user05", "123456");

        for (Map.Entry<String, String> entry : members.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("key=%s, value=%s%n", key, value);
        }
        // members.entrySet 사용도 높음

    }
}