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
            PreparedStatement ps = con.prepareStatement("SELECT C.ID_COLEGIO, C.NOMBRE, U.TIPO, U.COLOR, U.TIPOTELA, U.BORDADONOMBRE, U.ESCUDO\r\n" + //
                                "FROM COLEGIO C INNER JOIN UNIFORME U ON C.ID_COLEGIO = U.ID_COLEGIO\r\n" + //
                                "WHERE C.ID_COLEGIO = ?");
            ps.setInt(1, idcolegio);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("id_colegio"),
                    rs.getString("nombre"),
                    rs.getString("tipo"),
                    rs.getString("color"),
                    rs.getString("tipotela"),
                    rs.getString("bordadonombre"),
                    rs.getString("escudo"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporteaux() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT C.ID_COLEGIO, C.NOMBRE, U.TIPO, U.COLOR, U.TIPOTELA, U.BORDADONOMBRE, U.ESCUDO\r\n" + //
                                "FROM COLEGIO C INNER JOIN UNIFORME U ON C.ID_COLEGIO = U.ID_COLEGIO");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("ID_COLEGIO"),
                    rs.getString("NOMBRE"),
                    rs.getString("TIPO"),
                    rs.getString("COLOR"),
                    rs.getString("TIPOTELA"),
                    rs.getString("BORDADONOMBRE"),
                    rs.getString("ESCUDO"),
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
            PreparedStatement ps = con.prepareStatement("SELECT C.NOMBRE, COUNT(PT.CODIGO)\r\n" + //
                                "FROM COLEGIO C INNER JOIN UNIFORME U ON C.ID_COLEGIO = U.ID_COLEGIO\r\n" + //
                                "INNER JOIN PRODUCTO_UNIFORME PU ON U.CODUNIFORME = PU.CODPRODUCTOUNIFORME\r\n" + //
                                "INNER JOIN PRODUCTOS_TERMINADOS PT ON PU.CODIGOPRODUCTOTERMINADO = PT.CODIGO\r\n" + //
                                "WHERE PT.NUMPEDIDO IS NOT NULL\r\n" + //
                                "GROUP BY C.NOMBRE\r\n" + //
                                "ORDER BY count(PT.CODIGO) DESC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("NOMBRE"),
                    rs.getInt("count"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte7() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT  SUM(Total)\r\n" + //
                                "FROM FACTURA\r\n" + //
                                "WHERE Estado ILIKE '%PAGADA%'");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("sum"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte8() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT C.NOMBRE, P.NUMPEDIDO, F.TOTAL TOTAL_FACTURA, P.ABONO ,(F.TOTAL - P.ABONO) AS SALDO_PENDIENTE\r\n" + //
                                "FROM CLIENTE C INNER JOIN PEDIDO P ON C.DNI = P.DNI_CLIENTE \r\n" + //
                                "INNER JOIN FACTURA F ON P.NUMPEDIDO = F.NUMPEDIDO\r\n" + //
                                "WHERE (F.TOTAL - P.ABONO) > 0\r\n" + //
                                "ORDER BY C.NOMBRE ASC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getString("NOMBRE"),
                    rs.getInt("NUMPEDIDO"),
                    rs.getInt("TOTAL_FACTURA"),
                    rs.getInt("ABONO"),
                    rs.getInt("SALDO_PENDIENTE"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Object[]> Reporte9() {
        List<Object[]> datos = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT P.NUMPEDIDO, C.NOMBRE, P.FECHAENCARGO,\r\n" + //
                                "       CURRENT_DATE - P.FECHAENCARGO AS DIAS_ATRASO, Current_date as FECHASISTEMA\r\n" + //
                                "FROM PEDIDO P \r\n" + //
                                "INNER JOIN CLIENTE C ON P.DNI_CLIENTE = C.DNI\r\n" + //
                                "WHERE P.FECHAENTREGA IS NULL \r\n" + //
                                "AND P.FECHAENCARGO < CURRENT_DATE\r\n" + //
                                "ORDER BY C.NOMBRE ASC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos.add(new Object[]{
                    rs.getInt("NUMPEDIDO"),
                    rs.getString("NOMBRE"),
                    rs.getString("FECHAENCARGO"),
                    rs.getInt("DIAS_ATRASO"),
                    rs.getString("FECHASISTEMA"),
                });
            }

            return datos;
        } catch (Exception e) {
            return null;
        }
    }

}