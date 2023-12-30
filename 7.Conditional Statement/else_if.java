public class else_if {
    public static void main(String[] args){

        int age =23;

        if(age>=18){
            System.out.println("adult and give vote");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenage");
        }
        else{
            System.out.println("you are still baby");
        }
    }
}
