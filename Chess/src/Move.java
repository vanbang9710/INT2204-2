public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * A.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * A.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * A.
     */
    public String toString() {
        return movedPiece.getColor() + '-' + movedPiece.getSymbol()
                + (char) ('a' - 1 + endX) + endY;
    }

    /**
     * A.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * A.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * A.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * A.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * A.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * A.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * A.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * A.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * A.
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * A.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * A.
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * A.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
