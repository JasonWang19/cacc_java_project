package week13.animal;

import week13.interfaces.Movable;

public abstract class Animal implements Movable {
    private float weight;
    private int age;
    private String name;

    public static int count=0;

    public void eat() {
        System.out.println("animal is eating");
    }

    public void makeSound() {
        System.out.println("animal is make sound");
    }

    public abstract void drink(String abc);

    public static class Leg {
        private int weight;

        public int getWeight() {
            return weight;
        }

        public Leg(int weight) {
            this.weight = weight;
        }
    }

}