
public class creating_array {


    public static void main(String args[]){

        int marks[] = new int[50];

        int numbers[] = {95,76,98};

        String name[] = {"shejan" , "sharul", "Araff"};

        for(int i=0 ; i<name.length; i++){
            System.out.println(name[i]);
            System.out.println(numbers[i]);
        }

        // if array size declared and if there is no value in array then all values will be filled with zero in java
        for(int i=0 ; i<marks.length; i++){
            System.out.print(marks[i]);
        }

       
    }

    
}