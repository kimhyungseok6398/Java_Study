package exam_07_06_11_jeneric_2;

public class Box <T>{ // 타입이 들어옴
    private T item;
    public void put(T item){
        this.item = item;
    }
    public T get(){
        return item;

    }
}
