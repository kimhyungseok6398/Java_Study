package exam_0629_10_object_interface_5;

public class Ex02 {
    public static void main(String[] args) {
        /**Animal[] animals = new Animal[3];
         animals[0] = new Human();
         animals[1] = new Dog();
         animals[2] = new Bird();
         */
        Animal[] animals = {
                new Human(),
                new Dog(),
                new Bird()
                // 한꺼번에 선언도 가능
        };
        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();

            }
        }
        }
    }
