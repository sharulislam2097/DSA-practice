import java.util.*;
public class input_output_array {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int marks[]= new int [100];

        marks[0]= sc.nextInt(); //marks 1
        marks[1]= sc.nextInt(); //marks 2
        marks[2]= sc.nextInt(); //marks 3
        marks[3]= sc.nextInt(); //marks 4

        System.out.println("marks 1 :"+marks[0]);  //treat marks[]  as a variable 
        System.out.println("marks 2 :"+marks[1]);
        System.out.println("marks 3 :"+marks[2]);
        System.out.println("marks 4 :"+marks[3]);



        sc.close();
    }
    
}
