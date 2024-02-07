public class shortest_path {

    public static float shortestPath(String path){
        int x1=0 , y1=0 ,x2 =0 ,y2 =0;

        for(int i=0 ; i<path.length() ; i++){
            char direction = path.charAt(i);

            if(direction =='N'){
                y2++;
            }
            else if(direction == 'S'){
                y2--;
            }
            else if(direction == 'E'){
                x2++;
            }
            else{
                x2--;
            }
        }

        int x =(x2-x1)*(x2-x1);
        int y=(y2-y1)*(y2-y1);

        return (float)Math.sqrt(x+y);


        
        
    }

    

    public static void main(String[] args){

        String path = "WNEENESENNN";

        System.out.println(shortestPath(path));
      

    }
}