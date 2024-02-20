//How to create abstract class, abstract methods

public class Abstraction1 {

    public static void main(String[] args){

        Horse h = new Horse();
        h.eat();
        h.walk();
        

        Chicken c= new Chicken();
        c.eat();
        c.walk();

        

    }
    
}

abstract class Animal{
    String color;
    //constructor
    Animal(){
        System.out.println("animal constructor called");
    }
    //non abstract method 
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("horse constructor called");
    }

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks like horse");
    }

}

class Chicken extends Animal {
    Chicken(){
        System.out.println("chicken constructor called");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
