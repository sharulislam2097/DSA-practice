// Heirarchial Inheritance
public class Inheritance3 {

    public static void main(String[] args){

        Fish fishy = new Fish();
        Bird birdy = new Bird();
        Mammal human = new Mammal();

        fishy.eat();
        birdy.breathe();
        human.walk();
        human.breathe();

    }
    
}

// base class 
class Animals{
    String color ;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animals{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("flies");
    }
}

class Mammal extends Animals{
    void walk(){
        System.out.println("walks");
    }
}
