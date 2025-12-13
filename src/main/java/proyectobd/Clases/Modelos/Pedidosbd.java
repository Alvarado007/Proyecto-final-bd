package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Pedidosbd  {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerPedidos() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Pedido");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("numpedido"),
                    rs.getString("fechaencargo"),
                    rs.getString("fechaentrega"),
                    rs.getInt("abono"),
                    rs.getString("anotacion"),
                    rs.getString("dni_cliente"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarPedido(int numpedido) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Pedido WHERE numpedido = ?");
            ps.setInt(1, numpedido);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("numpedido"),
                    rs.getString("fechaencargo"),
                    rs.getString("fechaentrega"),
                    rs.getInt("abono"),
                    rs.getString("anotacion"),
                    rs.getString("dni_cliente"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }
}
