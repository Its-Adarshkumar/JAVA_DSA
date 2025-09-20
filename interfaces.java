public class interfaces {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left(in all 4 dirns)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left(in all 4 dirns)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}