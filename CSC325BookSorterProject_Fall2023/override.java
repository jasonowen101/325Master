package CSC325BookSorterProject_Fall2023;
// In this example, we have an abstract class Animal with an 
// abstract method makeSound() that must be overridden by its 
// concrete subclasses (Dog and Cat). We also have a concrete 
// method sleep() in the Animal class.
// We have an interface Edible with a single method eat(), 
// which is implemented by the Fruit class.
// Finally, in the Main class, we create instances of Dog, 
// Cat, and Fruit, and demonstrate how to use overridden methods 
// and the interface method.

// Abstract class
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method that must be overridden by subclasses
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Interface
interface Edible {
    void eat();
}

// Concrete class implementing the interface
class Fruit implements Edible {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name);
    }
}

// Concrete subclass of Animal
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}

// Concrete subclass of Animal
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Edible apple = new Fruit("Apple");

        // Using overridden methods
        dog.makeSound();
        cat.makeSound();
        dog.sleep();
        cat.sleep();
        apple.eat();
    }
}
