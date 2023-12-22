package exam_07_10_09_Collention_Framwork_2;

import java.util.HashMap;
import java.util.Map;

public class Ex03 { // 추가
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01" ,"123456");
        members.put("user02" ,"123456");
        members.put("user03" ,"123456");
        // 키는 값을 찾기 위한

        members.put("user02","234567");
        members.remove("user02");
        // 추가 : 키값이 하나밖에 없다보니까 벨류값이 변경
        // 삭제
        String password = members.get("user02");
        System.out.println(password);

    }
}
