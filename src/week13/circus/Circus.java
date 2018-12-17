package week13.circus;

//import week13.animal.Animal;
//import week13.vehicle.Vehicle;
import week13.animal.Cat;
import week13.actor.Clown;
import week13.animal.Dog;
import week13.animal.Elephant;
import week13.interfaces.Movable;
import week13.vehicle.Motocycle;


import java.util.ArrayList;
import java.util.List;

public class Circus {
//    List<Vehicle> vehicles = new ArrayList<>();
//    List<Animal> animals = new ArrayList<>();
//    List <Actor> actors

    List<Movable> performers = new ArrayList<>();

    List<Movable> performer2 = new ArrayList<Movable>();

    public void performTogether() {
//        for(Vehicle vehicle : vehicles) {
//            vehicle.move();
//        }
//        for (Animal animal : animals) {
//            animal.move();
//        }

        for (Movable performer : performers) {
            performer.move();
        }
    }

    public static void main(String[] args) {
        Circus circus = new Circus();
//        circus.animals.add(new Dog());
//        circus.animals.add(new Cat());
//        circus.vehicles.add(new Motocycle());

        circus.performers.add(new Dog());
        circus.performers.add(new Motocycle());
        circus.performers.add(new Elephant());
        circus.performers.add(new Clown());
        circus.performers.add(new Cat());
        circus.performTogether();
    }
}
