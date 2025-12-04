package proyectobd;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConexion {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
        String user = "postgres";
        String password = "1234";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Conexión exitosa a PostgreSQL sin errores.");
            con.close();
            Mostrarusers mu = new Mostrarusers();
            mu.mostrar();
        } catch (Exception e) {
            System.out.println("❌ Error conectando:");
            e.printStackTrace();
        }
    }
}

