public class getter_setters {

    public static void main(String[] args) {

        // created object using Pen class
        Pen p1 = new Pen();

        p1.setColor("BLUE");
        p1.setTip(6);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

}

// a blueprint of a pen / it is like template
class Pen {
    private String color;
    private int tip;

    // works as a getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // works as setters
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
