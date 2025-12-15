package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
public class ProductosTerminadosbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerProductosTerminados() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Productos_Terminados");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codigo"),
                        rs.getString("descripcion"),
                        rs.getString("talla"),
                        rs.getString("sexo"),
                        rs.getBigDecimal("precio"),
                        rs.getInt("numPedido")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarProductosTerminados(int codigo) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Productos_Terminados WHERE codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codigo"),
                        rs.getString("descripcion"),
                        rs.getString("talla"),
                        rs.getString("sexo"),
                        rs.getBigDecimal("precio"),
                        rs.getInt("numPedido")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarProductosTerminados(int codigo, String descripcion, String talla, String sexo, BigDecimal precio, int numPedido) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Productos_Terminados (codigo, descripcion, talla, sexo, precio, numPedido) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, codigo);
            ps.setString(2, descripcion);
            ps.setString(3, talla);
            ps.setString(4, sexo);
            ps.setBigDecimal(5, precio);
            ps.setInt(6, numPedido);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarProductosTerminados(int codigo, String descripcion, String talla, String sexo, BigDecimal precio, int numPedido) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Productos_Terminados SET descripcion = ?, talla = ?, sexo = ?, precio = ?, numPedido = ? WHERE codigo = ?");
            ps.setString(1, descripcion);
            ps.setString(2, talla);
            ps.setString(3, sexo);
            ps.setBigDecimal(4, precio);
            ps.setInt(5, numPedido);
            ps.setInt(6, codigo);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Es_hecho (int codigo_terminado, String [] Materias_Primas){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Es_hecho (codigoproductoterminado, codigo_materia) VALUES (?, ?)");
            for (String Prima : Materias_Primas) {
                int materiaprima = Integer.parseInt(Prima);
                ps.setInt(1, codigo_terminado);
                ps.setInt(2, materiaprima);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Producto_uniforme(int codigo_terminado, String [] uniforme){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO producto_uniforme (codigoproductoterminado, codproductouniforme) VALUES (?, ?)");
            for (String Prima : uniforme) {
                int materiaprima = Integer.parseInt(Prima);
                ps.setInt(1, codigo_terminado);
                ps.setInt(2, materiaprima);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
