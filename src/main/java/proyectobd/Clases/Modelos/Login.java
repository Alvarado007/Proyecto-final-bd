package proyectobd.Clases.Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    private String url = "jdbc:postgresql://localhost:5432/pruebaproyecto";
    private String user = "postgres";
    private String password = "1234";

    public String verificarCredenciales(int usuario, String contraseña) {
        // Lógica para verificar las credenciales del usuario
        // Esto podría incluir una consulta a la base de datos utilizando los atributos url, user y password
         try {
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
                stmt.setInt(1, usuario);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    String storedPassword = rs.getString("contraseña");
                    if (storedPassword.equals(contraseña)){
                        String cargo = rs.getString("cargo");
                        con.close();
                        return cargo;
                    }
                    con.close();
                    return null;
                }
                con.close();
                return null;
                
            } catch (Exception e) {
                return null;
            }
    }
}
