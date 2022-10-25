import javax.swing.*;
import java.util.Scanner;

public class Picture
{
    Picture(String path) {
        JFrame f = new JFrame("Add an image to JFrame");
        ImageIcon icon = new ImageIcon("/Users/sherri/IdeaProjects/JavaFirstMirea/Lab5/src/" + path);
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        String path;
        Scanner in = new Scanner(System.in);
        path = in.nextLine();
        new Picture(path);
    }
}