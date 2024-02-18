public class oop1 {

    public static void main(String[] args){

        // created object using Pen class
        Pen p1 = new Pen();

        p1.setColor("BLUE");
        p1.setTip(6);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }

    
}


// a blueprint of a pen / it is like template
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}