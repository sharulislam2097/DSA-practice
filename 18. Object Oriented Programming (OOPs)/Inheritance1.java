public class Inheritance1 {

    public static void main(String[] args) {
        Fish1 shark =new Fish1();

        shark.eat();

    }
}

// base class
class Animal1 {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//derived class
class Fish1 extends Animal1{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
