package example4;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import example4.Graficadora;
/**
 *
 * @author jorge
 */
public class Ventana extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),-0.2,2,-15,-200,200);
    }
}
