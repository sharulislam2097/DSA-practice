public class Interfaces {
public static void main(String[] args) {
    
}
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right,diagonal (in all four)");
    }
}