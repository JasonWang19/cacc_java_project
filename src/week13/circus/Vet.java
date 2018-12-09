package week13.circus;

import week13.animal.Animal;

public class Vet {
    public void check(Animal.Leg leg) {
        System.out.print(leg.getWeight());
    }

    public static void main(String[] args) {
        int weight = 10;
        Animal.Leg leg = new Animal.Leg(weight);
        Vet vet = new Vet();
        vet.check(leg);
    }
}
