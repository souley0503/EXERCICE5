public class Rock extends Piece{
   public boolean isValidMove(Position newPosition){
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}