import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
public class TextoParpadeante {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("UPLA - Texto Parpadeante");
            frame.setSize(400, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel("PANZON",
SwingConstants.CENTER);
label.setFont(new Font("Arial", Font.BOLD, 28));
frame.add(label);
frame.setVisible(true);
Timer timer = new Timer(500, e -> {
    label.setVisible(!label.isVisible());
    });
    timer.start();
    });
    }
    }