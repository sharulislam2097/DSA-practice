//Hybrid Inheritance
public class Inheritance4 {

    

    public static void main(String[] args) {

        Shark sk = new Shark();

        sk.swim();
        
    }
    
}

// base class
class Animals{
    String color ; 

    void eat(){
        System.out.println("eats");
    }
    void sleeps(){
        System.out.println("Sleeps");
    }
}

class Fish extends Animals{

    void swim(){
        System.out.println("swims");
    }
}

class Tuna extends Fish{
    String type;
}

class Shark extends Fish{

    void attaks(){
        System.out.println("attacks");
    }
}

class Bird extends Animals{

    void fly(){
        System.out.println("flies");
    }
}

class Peacock extends Bird{
    String feather ;
}

class Mamal extends Animals{

    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mamal{
    String breed ;
}

class Cat extends Mamal {

    void scratch(){
        System.out.println("cat scratches");
    }
}

class Human extends Mamal{

    void fights(){
        System.out.println("human fights");
    }
}
