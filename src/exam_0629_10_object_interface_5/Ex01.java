package exam_0629_10_object_interface_5;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human. Animal
        human.move();

        Animal dog = new Dog(); // dog, animal
        dog.move();

        Animal bird = new Bird(); // bird, animal
        bird.move();
    }
}
