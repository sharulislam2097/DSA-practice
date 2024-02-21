// Heirarchial Inheritance
public class Inheritance3 {

    public static void main(String[] args){

        Fish3 fishy = new Fish3();
        Bird birdy = new Bird();
        Mammal3 human = new Mammal3();

        fishy.eat();
        birdy.breathe();
        human.walk();
        human.breathe();

    }
    
}

// base class 
class Animal3{
    String color ;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish3 extends Animal3{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal3{
    void fly(){
        System.out.println("flies");
    }
}

class Mammal3 extends Animal3{
    void walk(){
        System.out.println("walks");
    }
}
