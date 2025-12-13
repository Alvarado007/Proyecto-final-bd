package proyectobd.Estetica;
import javax.swing.*;
import java.awt.*;

public class Campotextotransparente extends JTextField {

    public Campotextotransparente(int columns) {
        super(columns);

        setOpaque(false);              // clave
        setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        setCaretColor(Color.BLACK);    // cursor visible
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(255, 255, 255, 180)); // blanco transparente
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

        g2.dispose();
        super.paintComponent(g);
    }
}
