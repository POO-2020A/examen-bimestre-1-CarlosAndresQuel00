import java.util.HashMap;

public class Plane {
    private HashMap<Seat, Seat> seats;
    private int rows;
    private int cols;
    private int count;

    public Plane(int rows, int cols) {
        this.seats = new HashMap<>(rows, cols);
        this.count = 0;
    }

    public HashMap<Seat, Seat> getSeats() {
        return this.seats;
    }
    
    public int getRows() {
        return this.rows;
    }
    
    public int getCols() {
        return this.cols;
    }
    
    public void setRows(int rows) {
        this.rows = rows;
    }
    
    public void setCols(int cols) {
        this.cols = cols;
    }
    
    @Override
    public String toString() {
        return this.seats.get(this.rows) + " " + this.seats.get(this.cols);                           // pending
    }
}
