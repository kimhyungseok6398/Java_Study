package exam14_object_extends_3;

import exam13_object_extends_2.D;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Human(); // Animal animal[0] = new Human();
        animals[1] = new Dog(); // Animal animal[1] = new Dog();
        animals[2] = new Bird();// Animal animals[2] = new Bird();

        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            }else if (animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.bark();
            }


        }
    }
}