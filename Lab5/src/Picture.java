import javax.swing.*;
import java.util.Scanner;

public class Picture extends JFrame {
    Picture(String path) {
        JFrame f = new JFrame("PicTest");
        ImageIcon icon = new ImageIcon("/Users/sherri/IdeaProjects/JavaFirstMirea/Lab5/src/" + path);
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        String path;
        Scanner in = new Scanner(System.in);
        path = in.nextLine();
        new Picture(path);
    }
}