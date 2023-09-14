// Abstract class Animal
abstract class Animal {
    abstract void makeSound();
}


// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Haav!");
    }
}


// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Myauu!");
    }
}


// Subclass Cow
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow says: Muu!");
    }
}


public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog();
        dog.makeSound();


        Animal cat = new Cat();
        cat.makeSound();


        Animal cow = new Cow();
        cow.makeSound();
    }
}



