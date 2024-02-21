public class Interfaces {
public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
    Rook r = new Rook();
    r.moves();
    King k= new King();
    k.moves();
    
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

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down, left, right , diagonal by 1 step");
    }
}