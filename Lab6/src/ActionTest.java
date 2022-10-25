import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActionTest extends JFrame {
    JLabel n = new JLabel("NORTH", JLabel.CENTER);
    JLabel s = new JLabel("SOUTH", JLabel.CENTER);
    JLabel c = new JLabel("CENTER", JLabel.CENTER);
    JLabel e = new JLabel("EAST", JLabel.CENTER);
    JLabel w = new JLabel("WEST", JLabel.CENTER);

    public ActionTest () {
        setSize(300, 300);
        setLayout(new BorderLayout());
        add(n, BorderLayout.NORTH);
        add(c, BorderLayout.CENTER);
        add(s, BorderLayout.SOUTH);
        add(w, BorderLayout.WEST);
        add(e, BorderLayout.EAST);
        n.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Унайза");
            }
        });
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Медина");
            }
        });
        s.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }
        });
        w.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }
        });
        e.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ActionTest().setVisible(true);
    }
}