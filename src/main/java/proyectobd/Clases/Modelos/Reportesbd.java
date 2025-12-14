package proyectobd.Clases.Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Reportesbd {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public List<Object[]> Reporte1() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT PT.CODIGO, PT.DESCRIPCION, P.FECHAENCARGO\r\n" + //
                                "FROM PRODUCTOS_TERMINADOS PT INNER JOIN PEDIDO P ON PT.NUMPEDIDO = P.NUMPEDIDO\r\n" + //
                                "WHERE P.FECHAENTREGA IS NULL \r\n" + //
                                "ORDER BY P.FECHAENCARGO ASC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("CODIGO"),
                    rs.getString("DESCRIPCION"),
                    rs.getString("FECHAENCARGO"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> ReporteBusqueda(int idcolegio) {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Colegio WHERE id_colegio = ?");
            ps.setInt(1, idcolegio);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("id_colegio"),
                    rs.getString("nombre"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte2() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT C.NOMBRE, PT.CODIGO, PT.DESCRIPCION, P.FECHAENCARGO\r\n" + //
                                "FROM PRODUCTOS_TERMINADOS PT INNER JOIN PEDIDO P ON PT.NUMPEDIDO = P.NUMPEDIDO\r\n" + //
                                "INNER JOIN CLIENTE C ON C.DNI = P.DNI_CLIENTE\r\n" + //
                                "WHERE P.FECHAENTREGA IS NULL \r\n" + //
                                "ORDER BY C.NOMBRE ASC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("NOMBRE"),
                    rs.getInt("CODIGO"),
                    rs.getString("DESCRIPCION"),
                    rs.getString("FECHAENCARGO"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }
    public List<Object[]> Reporte3() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT PT.DESCRIPCION, COUNT(*)\r\n" + //
                                "FROM PRODUCTOS_TERMINADOS PT \r\n" + //
                                "WHERE PT.NUMPEDIDO IS NULL\r\n" + //
                                "GROUP BY PT.DESCRIPCION\r\n" + //
                                "ORDER BY PT.DESCRIPCION ASC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("DESCRIPCION"),
                    rs.getInt("count"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte4() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT DISTINCT C.Nombre \r\n" + //
                                "FROM COLEGIO C INNER JOIN UNIFORME U ON C.Id_Colegio = U.Id_Colegio");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("Nombre"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte6() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Colegio");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("id_colegio"),
                    rs.getString("nombre"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

}