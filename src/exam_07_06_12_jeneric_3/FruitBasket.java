package exam_07_06_12_jeneric_3;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket<T> {
    private List<T> items = new ArrayList<>();
    // 곧 컬렉션 프레임 워크 배움

    public void add(T item){
        items.add(item);

    }
    public List<T> gets(){
        return items;
    }
}
