package exam_0703_12_try_catch_3;

public class Ex02 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Obbject
        Object obj1 = human;

        Bird bird = new Bird(); // Bird, Object
        Object obj2 = bird;

        Object[] objs = new Object[2];
        objs[0] = obj1;
        objs[1] = obj2;

    }
}
