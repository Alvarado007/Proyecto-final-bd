package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
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

    public void agregarPedido(int numpedido, String fechaencargo, String fechaentrega, int abono, String anotacion, String dni_cliente) {
        try {
            LocalDate fechaencargodate = LocalDate.parse(fechaencargo);
            LocalDate entregaDate = LocalDate.parse(fechaentrega);
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Pedido (numpedido, fechaencargo, fechaentrega, abono, anotacion, dni_cliente) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, numpedido);
            ps.setObject(2,fechaencargodate);
            ps.setObject(3, entregaDate);
            ps.setInt(4, abono);
            ps.setString(5, anotacion);
            ps.setString(6, dni_cliente);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarPedido(int numpedido, String fechaencargo, String fechaentrega, int abono,  String anotacion, String dni_cliente) {
        try {
            LocalDate fechaencargodate = LocalDate.parse(fechaencargo);
            LocalDate entregaDate = LocalDate.parse(fechaentrega);
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Pedido SET fechaencargo = ?, fechaentrega = ?, abono = ?, anotacion = ?, dni_cliente = ? WHERE numpedido = ?");
            ps.setObject(1,fechaencargodate);
            ps.setObject(2, entregaDate);
            ps.setInt(3, abono);
            ps.setString(4, anotacion);
            ps.setString(5, dni_cliente);
            ps.setInt(6, numpedido);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarPedido(int numpedido) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("DELETE FROM Pedido WHERE numpedido = ?");
            ps.setInt(1, numpedido);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
