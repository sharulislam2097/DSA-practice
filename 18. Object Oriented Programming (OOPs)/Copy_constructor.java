public class Copy_constructor {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Jonh doe";
        s1.roll = 89;
        s1.password = "bj69";
        s1.marks[0]= 100;
        s1.marks[1] =95;
        s1.marks[2]=91;
        s1.marks[2]=80; //make new changes

        // copy all property of s1
        Student s2 = new Student(s1);
        s2.password = "ly97";
       //print value of marks in s2 object to see any changes happens or not
        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }

    }

    // class

    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        // making constructor for coping property form s1 to s2
        //shallow copy constructor
        // Student(Student s1) {
        //     marks = new int [3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks =s1.marks;

        // }

        //Deep copy constructor for s2
        Student(Student s1){
            marks = new int[3];
            this.name =s1.name;
            this.roll =s1.roll;
            for(int i=0 ; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }
        }

        // non parameterized constructor
        Student() {
            marks = new int [3];
            System.out.println("constructor is called");
        }

        // parameterized constructor
        Student(String name) {
            marks = new int [3];
            this.name = name;
        }

        Student(int roll) {
            marks = new int [3];
            this.roll = roll;
        }
    }
}
