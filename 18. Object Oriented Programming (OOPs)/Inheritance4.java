//Hybrid Inheritance
public class Inheritance4 {

    

    public static void main(String[] args) {

        Shark sk = new Shark();

        sk.swim();
        
    }
    
}

// base class
class Animal4{
    String color ; 

    void eat(){
        System.out.println("eats");
    }
    void sleeps(){
        System.out.println("Sleeps");
    }
}

class Fish4 extends Animal4{

    void swim(){
        System.out.println("swims");
    }
}

class Tuna extends Fish4{
    String type;
}

class Shark extends Fish4{

    void attaks(){
        System.out.println("attacks");
    }
}

class Bird extends Animal4{

    void fly(){
        System.out.println("flies");
    }
}

class Peacock extends Bird{
    String feather ;
}

class Mamal4 extends Animal4{

    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mamal4{
    String breed ;
}

class Cat extends Mamal4 {

    void scratch(){
        System.out.println("cat scratches");
    }
}

class Human extends Mamal4{

    void fights(){
        System.out.println("human fights");
    }
}
