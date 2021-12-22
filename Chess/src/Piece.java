public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * A.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * A.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * A.
     */
    public abstract String getSymbol();

    /**
     * A.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * A.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * A.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * A.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * A.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * A.
     */
    public String getColor() {
        return color;
    }

    /**
     * A.
     */
    public void setColor(String color) {
        this.color = color;
    }

}
