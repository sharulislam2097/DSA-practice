public class binary_search {

    public static int binarySearch(int numbers[] ,int key){ int start =0;
        int end = numbers.length-1;

        while (start <= end){
            int mid =(start+end)/2; 

            //comparison
            if(numbers[mid]==key){  //found
                return mid;
            }
            if(numbers[mid]<key){  //right portion
                start = mid+1;
            }
            else{
                end = mid-1;  // left portion
            }
        }

        return -1;

    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14};
        int key = 8;

        int index =binarySearch(numbers, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("index for index is : "+index);
        }


        
    }
}
