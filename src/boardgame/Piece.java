
package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Não é necessário colocar, pois se não se atribui o Java já atribui null.
    }

    protected Board getBoard() {
        return board;
    }

    
}
