
public class Seat {

    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public boolean isFree() {
        if (this.passenger == null) {
            return true;
        }
        return false;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public int getRow() {
        return this.row;
    }

    public String getCol() {
        return this.col;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    @Override
    public String toString() {
        if (this.isFree()) {
            return "Asiento: " + this.row + this.col + ", libre.";       // pending
        }
        return "Asiento: " + this.row + this.col + ", ocupado." + " Pasajero: "
                + this.passenger;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (compared instanceof Seat) {
            return true;
        }
        return false;
    }
}
