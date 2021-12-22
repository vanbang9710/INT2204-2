import java.util.ArrayList;

public class Game {
    private final ArrayList<Move> moveHistory = new ArrayList<>();
    private Board board;

    /**
     * A.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * A.
     */
    public static void main(String[] args) {
        Board board = new Board();
        Piece r1 = new Rook(2, 3, "white");
        board.addPiece(r1);
        Piece r2 = new Rook(6, 3, "white");
        board.addPiece(r2);
        System.out.println(r1.canMove(board, 1, 3));
        Game game = new Game(board);
        game.movePiece(r1, 6, 3);
        for (Move move : game.getMoveHistory()) {
            System.out.print(move.toString() + " ");
        }
    }

    /**
     * A.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece killedPiece = board.getAt(x, y);
            if (killedPiece != null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece, killedPiece));
                board.removeAt(x, y);
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece));
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    /**
     * A.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * A.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * A.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
