public class Constructors {
    public static void main(String[] args) {
        //objects
        // Student s1 = new Student();
        Student s2= new Student ("sharul");
        Student s3= new Student(546);

        System.out.println(s2.name);
        System.out.println(s3.roll);

    }

    // class

    static class Student {
        String name;
        int roll;

        // non parameterized constructor
        Student() {   //s1
            System.out.println("constructor is called");
        }
        // parameterized constructor
        Student(String name) {  //s2
            this.name = name;
        }
        Student(int roll){  //s3
            this.roll =roll;
        }
    }
}
