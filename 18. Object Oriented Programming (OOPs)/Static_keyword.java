public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVMC";

        Student s2 = new Student();

        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "Mula";
        System.out.println(s2.schoolName);


    }
}

class Student {
    String name;
    int roll;

    //static function
    static int percentageCal(int phy, int math, int chem) {
        return (phy + math + chem) / 3;
    }


    //Static school name for all student.
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}

