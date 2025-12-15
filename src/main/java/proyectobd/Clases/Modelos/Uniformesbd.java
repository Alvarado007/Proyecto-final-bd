package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Uniformesbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> obtenerUniformes() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Uniforme");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codUniforme"),
                        rs.getString("tipo"),
                        rs.getString("color"),
                        rs.getString("tipoTela"),
                        rs.getString("bordadoNombre"),
                        rs.getString("escudo"),
                        rs.getInt("id_Colegio")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> BuscarUniforme(int codUniforme) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Uniforme WHERE codUniforme = ?");
            ps.setInt(1, codUniforme);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                        rs.getInt("codUniforme"),
                        rs.getString("tipo"),
                        rs.getString("color"),
                        rs.getString("tipoTela"),
                        rs.getString("bordadoNombre"),
                        rs.getString("escudo"),
                        rs.getInt("id_Colegio")
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public void agregarUniforme(int codUniforme, String tipo, String color, String tipoTela, String bordadoNombre, String escudo, int id_Colegio) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO Uniforme (codUniforme,tipo,color,tipoTela,bordadoNombre, escudo, id_Colegio) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, codUniforme);
            ps.setString(2, tipo);
            ps.setString(3, color);
            ps.setString(4, tipoTela);
            ps.setString(5, bordadoNombre);
            ps.setString(6, escudo);
            ps.setInt(7, id_Colegio);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarUniforme(int codUniforme, String tipo, String color, String tipoTela, String bordadoNombre, String escudo, int id_Colegio) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE Uniforme SET tipo = ?, color = ?, tipoTela = ?, bordadoNombre = ?, escudo = ?, id_Colegio = ?  WHERE codUniforme = ?");
            ps.setString(1, tipo);
            ps.setString(2, color);
            ps.setString(3, tipoTela);
            ps.setString(4, bordadoNombre);
            ps.setString(5, escudo);
            ps.setInt(6, id_Colegio);
            ps.setInt(7, codUniforme);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Producto_uniforme(int uniforme, String [] terminados){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("INSERT INTO producto_uniforme (codigoproductoterminado, codproductouniforme) VALUES (?, ?)");
            for (String Prima : terminados) {
                int materiaprima = Integer.parseInt(Prima);
                ps.setInt(1,materiaprima );
                ps.setInt(2, uniforme);
                ps.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
