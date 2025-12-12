package proyectobd;
import proyectobd.*;
import proyectobd.Clases.Modelos.Login;
import proyectobd.Clases.Vistas.VentanaLogin_copy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Login l = new Login();
        VentanaLogin_copy vl = new VentanaLogin_copy(l);
        vl.setVisible(true);
    }
}
