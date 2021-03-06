package week11.band;

import week11.animal.Animal;
import week11.animal.Cat;
import week11.animal.Dog;
import week11.animal.Elephant;

import java.util.ArrayList;
import java.util.List;

public class AnimalBand {
    List<Animal> animals = new ArrayList<>();

    public void play() {
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        AnimalBand band = new AnimalBand();
        Dog dog1 = new Dog();
        band.animals.add(dog1);
        Dog dog32 = new Dog();
        band.animals.add(dog32);
        Cat cat = new Cat();
        band.animals.add(cat);
        Elephant elephant = new Elephant();
        band.animals.add(elephant);

//        Animal animal = new Animal();
        band.play();

    }
}
