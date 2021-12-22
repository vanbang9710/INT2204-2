import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * A.
     */
    public Board() {

    }

    /**
     * A.
     */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == piece.getCoordinatesX()
                    && p.getCoordinatesY() == piece.getCoordinatesY()) {
                return;
            }
        }
        pieces.add(piece);
    }

    /**
     * A.
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT);
    }

    /**
     * A.
     */
    public void removeAt(int x, int y) {
        Piece piece = getAt(x, y);
        if (piece != null) {
            pieces.remove(piece);
        }
    }

    /**
     * A.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * A.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * A.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
