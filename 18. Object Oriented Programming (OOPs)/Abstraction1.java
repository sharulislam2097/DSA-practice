//How to create abstract class, abstract methods

public class Abstraction1 {

    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);

        Mustang m = new Mustang();
        //animal -> horse -> mustang
    }

}

abstract class Animal {
    String color;
    //constractor 
    Animal(){
        System.out.println("animal constructor called");
    }


    // non abstract method
    void eat() {
        System.out.println("eats");
    }

    // abstract method only declare no implement
    abstract void walk();

}

// sub class
class Horse extends Animal {
    //constructor
    Horse(){
        System.out.println("horse constructor called");
    }

    void changeColor(){
        color ="dark brown";
    }
    // sub class implements the walk
    void walk() {
        System.out.println("walks on four legs");
    }

}
// sub class of horse
class Mustang extends Horse{

    //constructor
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

// sub class
class Chicken extends Animal {

    void changeColor(){
        color = "yellow";
        
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}
