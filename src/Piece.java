public abstract class Piece {
    public int row;
    public int column;
    public boolean isValidMove(Position newPosition){
        if (newPosition.row >= 1 && newPosition.row <= 8 &&
                newPosition.column >= 1 && newPosition.column <= 8) {
            return true;
        }else {
            return false;
        }
    }}