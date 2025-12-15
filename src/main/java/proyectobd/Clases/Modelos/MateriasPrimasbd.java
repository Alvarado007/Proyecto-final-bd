package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class MateriasPrimasbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerMateriasPrimas() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Materias_Primas");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codigo"),
                        rs.getString("tipo"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad"),
                        rs.getString("unidadMedida"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarMateriasPrimas(int codigo) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Materias_Primas WHERE codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codigo"),
                        rs.getString("tipo"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad"),
                        rs.getString("unidadMedida"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarMateriasPrimas(int codigo, String tipo, String descripcion, int cantidad, String unidadMedida) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Materias_Primas (codigo, tipo, descripcion, cantidad, unidadMedida) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, codigo);
            ps.setString(2, tipo);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setString(5, unidadMedida);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarMateriasPrimas(int codigo, String tipo, String descripcion, int cantidad, String unidadMedida) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Materias_Primas SET tipo = ?, descripcion = ?, cantidad = ?, unidadMedida = ? WHERE codigo = ?");
            ps.setString(1, tipo);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setString(4, unidadMedida);
            ps.setInt(5, codigo);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Suministra (String [] nit, int materias){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Suministra (NIT_Proveedor, codigo_materia) VALUES (?, ?)");
            for (String proveedor : nit) {
                ps.setString(1, proveedor);
                ps.setInt(2, materias);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Es_hecho (int materias, String [] codigo_terminados){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Es_hecho (codigoproductoterminado, codigo_materia) VALUES (?, ?)");
            for (String terminado : codigo_terminados) {
                int terminadoInt = Integer.parseInt(terminado);
                ps.setInt(1, terminadoInt);
                ps.setInt(2, materias);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}