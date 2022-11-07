import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("/Users/sherri/IdeaProjects/JavaFirstMirea/Lab8/src/text.txt", true)) {
                String input;
                Scanner in = new Scanner(System.in);
                input = in.nextLine();
                writer.append('\n');
                writer.write(input);
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }
}
