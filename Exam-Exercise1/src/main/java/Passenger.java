
public class Passenger {
    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.lastname;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (compared instanceof Passenger) {
            return true;
        }
        return false;
    }
}
