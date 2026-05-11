public class Queen extends Piece {

    public boolean isValidMove(Position newPosition) {

        // 2. Calcul des deltas
        int differenceColum = Math.abs(newPosition.column - this.column);
        int differenceRow = Math.abs(newPosition.row - this.row);

        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        } else if (differenceColum == differenceRow) {
            return true;
        }

        // 3. Retourne vrai si mouvement de Tour (ligne/col égale)
        // OU mouvement de Fou (diagonale)
        return false;
    }
}