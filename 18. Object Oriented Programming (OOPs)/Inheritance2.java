// multi level inheritance

public class Inheritance2 {
    public static void main(String[] args) {

        Dog2 dobby = new Dog2();

        dobby.eat();
        dobby.legs=4;

        System.out.println(dobby.legs );
        
    }
    
}

//base class

class Animal2{
    String color ;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal2 extends Animal2{
    int legs;
}

class Dog2 extends Mammal2{
    String breed;
}
