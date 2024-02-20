public class Inheritance1 {

    public static void main(String[] args) {
        Fish shark =new Fish();

        shark.eat();

    }
}

// base class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
