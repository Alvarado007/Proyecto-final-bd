package proyectobd;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Mostrarusers {
    String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    String user = "postgres";
    String password = "1234";

    void mostrar() {
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") + ", Email: " + rs.getString("correo"));
                }
                con.close();
            } catch (Exception e) {
                System.out.println("❌ Error conectando:");
                e.printStackTrace();
            }
        }

}

