import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bbbd {
    public static void insert(Persona persona) throws SQLException {
        ////CONNECTION
        //Especificas lo que quieres que connectar (tipo de base // el host  o la ip //y la base ),root y contrseña
        String url = "jdbc:mysql://172.16.129.248:3306/dawent";
        Connection con= null;
        //En caso de que de un error saltara al catch
        try {
             con = DriverManager.getConnection(url,"root","");
        } catch (SQLException e) {
            System.out.println("Connection error: "+e.getMessage());
        }

        //STATEMENT para enviar varias cosas a la vece
        Statement st = null;
        try{
            st= con.createStatement();
        } catch (SQLException e){
             System.out.println("Statement error: "+e.getMessage());
        }
       //AHORA PARA
       String query ="INSERT INTO persona VALUES ('" +persona.getNom() +"'," +persona.getAny()+");";
                try{
                    st.executeUpdate(query);
                } catch (SQLException e) {
                    System.out.println("Query error: "+e.getMessage());
                }

    }
}
