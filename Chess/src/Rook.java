public class Rook extends Piece {
    /**
     * A.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * A.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * A.
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * A.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        int x1 = getCoordinatesX();
        int y1 = getCoordinatesY();
        int x2 = x;
        int y2 = y;
        if (x1 != x && y1 != y) {
            return false;
        }
        if (x1 == x) {
            --x1;
            ++x2;
            if (y1 > y2) {
                y1 = y1 ^ y2;
                y2 = y1 ^ y2;
                y1 = y1 ^ y2;
            }
        } else if (y1 == y) {
            --y1;
            ++y2;
            if (x1 > x2) {
                x1 = x1 ^ x2;
                x2 = x1 ^ x2;
                x1 = x1 ^ x2;
            }
        }
        for (int x3 = x1 + 1; x3 < x2; ++x3) {
            for (int y3 = y1 + 1; y3 < y2; ++y3) {
                if (board.getAt(x3, y3) != null) {
                    return false;
                }
            }
        }
        Piece piece = board.getAt(x, y);
        if (piece != null) {
            return !getColor().equals(piece.getColor());
        } else {
            return true;
        }
    }
}
