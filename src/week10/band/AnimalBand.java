package week10.band;

import week10.animal.Animal;
import week10.animal.Cat;
import week10.animal.Dog;

public class AnimalBand {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Animal a1 = new Animal();

        a1.makeSound();
        dog1.makeSound();
        cat1.makeSound();
        dog1.move();

        System.out.print(cat1 instanceof Animal);
        System.out.println(a1 instanceof Dog);
    }

}
