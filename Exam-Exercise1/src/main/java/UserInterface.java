import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Plane plane;
    private Seat seats;
    private Passenger passenger;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Ingrese la cantidad de filas:");
            int rows = Integer.valueOf(this.scanner.nextLine());
            System.out.println("Ingrese la cantidad de columnas:");
            int cols = Integer.valueOf(this.scanner.nextLine());
            if (rows <= 20) {
                this.plane.setRows(rows);           // pending
            }
            if (cols <= 8) {
                this.plane.setCols(cols);
            }
            for (int i = 0; i < rows; i++) {
                System.out.println(this.plane);
                for (int j = 0; j < cols; j++) {
                    System.out.println(this.seats.getCol());
                }
            }
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            System.out.print("Ingrese la opción: ");
            int number = Integer.valueOf(this.scanner.nextLine());
            if (number == 1) {
                System.out.println("Ingrese un pasajero:");
                System.out.print("Ingrese el nombre del pasajero: ");
                String name = String.valueOf(this.scanner.nextLine());
                this.passenger.setName(name);
                System.out.print("Ingrese el apellido del pasajero: ");
                String lastname = String.valueOf(this.scanner.nextLine());
                this.passenger.setLastname(lastname);
                System.out.print("Ingrese la fila del asiento: ");
                int row = Integer.valueOf(this.scanner.nextLine());
                this.seats.setRow(row);
                System.out.print("Ingrese la columna del asiento: ");
                String col = String.valueOf(this.scanner.nextLine());
                this.seats.setCol(col);
                System.out.println("¡Pasajero ingresado!");
                
            } else if (number == 2) {
                System.out.println("Consulta de asiento.");
                System.out.print("Ingrese la fila del asiento: ");
                int row = Integer.valueOf(this.scanner.nextLine());
                System.out.println("Ingrese la columna del asiento: ");
                String col = String.valueOf(this.scanner.nextLine());
                if (seats.equals(row)) {
                    if (seats.equals(col)) {
                        System.out.println(seats);
                    }
                }
                System.out.println(seats);
            } else if (number == 3) {
                System.out.println("Consulta de pasajero.");
                System.out.print("Ingrese el nombre del pasajero: ");
                String name = String.valueOf(this.scanner.nextLine());
                System.out.print("Ingrese el apellido del pasajero: ");
                String lastname = String.valueOf(this.scanner.nextLine());
                if (passenger.equals(name)) {
                    if (passenger.equals(lastname)) {
                        System.out.println("El pasajero se encuentra en el asiento: "
                        + this.seats.getRow() + this.seats.getCol());
                    }
                } else {
                    System.out.println("El pasajero no se encuentra en el avión.");
                }
            }
        }
    }
}
