public class remove_duplicate_in_string {
    public static void removeDuplicate(String Str , int idx , StringBuilder newStr, boolean[] map ){
        //basecase
        if(idx == Str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char curChar = Str.charAt(idx);
        if(map[curChar - 'a']){
            //found duplicate
            removeDuplicate(Str , idx+1 , newStr , map);
        }else{
            // not duplicate
            map[curChar-'a']=true;
            removeDuplicate(Str , idx+1 , newStr.append(curChar), map);
        }

    }
    public static void main(String[] args){

        String Str = "appnnacollege";
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26];

        removeDuplicate(Str , 0,newStr, map );


    }
}
