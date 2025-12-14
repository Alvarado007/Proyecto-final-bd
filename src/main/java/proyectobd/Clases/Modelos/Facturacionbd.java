package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Facturacionbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerFacturacion() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Factura");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("idfactura"),
                    rs.getString("estado"),
                    rs.getInt("total"),
                    rs.getInt("numpedido"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarFactura(int idfactura) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Factura WHERE idfactura = ?");
            ps.setInt(1, idfactura);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("idfactura"),
                    rs.getString("estado"),
                    rs.getInt("total"),
                    rs.getInt("numpedido"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarFactura(int idfactura, String estado, int total, int numpedido) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Factura (idfactura, estado, total, numpedido) VALUES (?, ?, ?, ?)");
            ps.setInt(1, idfactura);
            ps.setString(2, estado);
            ps.setInt(3, total);
            ps.setInt(4, numpedido);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarFactura(int idfactura, String estado, int total, int numpedido) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Factura SET estado = ?, total = ?, numpedido = ? WHERE idfactura = ?");
            ps.setString(1, estado);
            ps.setInt(2, total);
            ps.setInt(3, numpedido);
            ps.setInt(4, idfactura);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

