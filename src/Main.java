import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner teclat = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("que quieres ahacer: ");
            System.out.println("1.Introducir persona");
            System.out.println("2.salir ");

            String opcio = teclat.nextLine();
            if (opcio.equals("1")){

                Persona p = new Persona (teclat.nextLine(),teclat.nextInt());
                //para evitar los lios de los intros
                teclat.nextLine();
                try {
                    Bbbd.insert(p);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            } else if (opcio.equals("2")) {
                exit = true;
            }


        }
    }
}
