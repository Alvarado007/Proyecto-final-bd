package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Proveedoresbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerProveedores() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Proveedores");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getString("nit"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("tel"),
                        rs.getString("nombreContacto")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarProveedores(String nit) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Proveedores WHERE nit = ?");
            ps.setString(1, nit);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("nit"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("tel"),
                        rs.getString("nombreContacto")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarProveedor(String nit, String nombre, String direccion, String tel, String nombreContacto) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Proveedores (NIT, Nombre, Direccion, Tel, NombreContacto) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, nit);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setString(4, tel);
            ps.setString(5, nombreContacto);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarProveedor(String nit, String nombre, String direccion, String tel, String nombreContacto) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Proveedores SET Nombre = ?, Direccion = ?, Tel = ?, NombreContacto = ? WHERE Nit = ?");
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setString(3, tel);
            ps.setString(4, nombreContacto);
            ps.setString(5, nit);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Suministra(String[] materias, String nit) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Suministra (NIT_Proveedor, codigo_materia) VALUES (?, ?)");
            for (String materia : materias) {
                int materiaInt = Integer.parseInt(materia);
                ps.setString(1, nit);
                ps.setInt(2, materiaInt);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
