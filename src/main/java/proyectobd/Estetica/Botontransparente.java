package proyectobd.Estetica;
import javax.swing.*;
import java.awt.*;

public class Botontransparente extends JButton {

    public Botontransparente(String text) {
        super(text);

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(255, 255, 255, 180)); // blanco transparente
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        g2.dispose();
        super.paintComponent(g);
    }
}
