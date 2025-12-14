package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Clientesbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerUsuarios() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Cliente");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("dni"),
                    rs.getString("nombre"),
                    rs.getString("tel"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarCliente(String dni) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Cliente WHERE dni = ?");
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("dni"),
                    rs.getString("nombre"),
                    rs.getString("tel"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarCliente(String dni, String nombre, String tel) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Cliente (dni, nombre, tel) VALUES (?, ?, ?)");
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, tel);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarCliente(String dni, String nombre, String tel) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Cliente SET nombre = ?, tel = ? WHERE dni = ?");
            ps.setString(1, nombre);
            ps.setString(2, tel);
            ps.setString(3, dni);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarCliente(String dni) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("DELETE FROM Cliente WHERE dni = ?");
            ps.setString(1, dni);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
