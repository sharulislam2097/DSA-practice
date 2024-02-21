import com.sun.security.jgss.AuthorizationDataEntry;

public class Super_keyword {
    public static void main(String[] args) {
        Horse5 h = new Horse5();
        System.out.println(h.color);
    }

}

class Animal5 {
    String color;

    Animal5() {
        System.out.println("animal constructor is called");
    }


}

class Horse5 extends Animal5 {
    Horse5() {
        super.color = "black";
        System.out.println("Horse constructor called");
    }


}


