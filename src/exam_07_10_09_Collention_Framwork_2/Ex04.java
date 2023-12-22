package exam_07_10_09_Collention_Framwork_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01" ,"123456");
        members.put("user02" ,"123456");
        members.put("user03" ,"123456");
        members.put("user04" ,"123456");
        members.put("user05" ,"123456");

        /**
        Set<String> keys = members.keySet();
        for (String key : keys){
            String value = members.get(key);
            System.out.printf("key=%s, value=%s%n" , key, value);
        }
         */

        Set<Map.Entry<String, String>> entries = members.entrySet();
        for (Map.Entry<String, String> entry : entries){
            // 안에 들어있는 키 벨류 값을  쌍으로 가져오는것
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key,value);
        // 이 방식이 더 많이 쓰인다고 함
        }
    }
}
