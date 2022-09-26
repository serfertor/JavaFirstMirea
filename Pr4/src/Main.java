import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Panel extends JFrame
{
    int a = 0,b = 0;
    String winner = "DRAW";
    String lastScore = "N/A";
    JLabel result = new JLabel("Last scorer: " + lastScore,JLabel.CENTER);
    JLabel lastScoreText = new JLabel("Result: " + a +" X " + b,JLabel.CENTER);
    JLabel winnerRes = new JLabel("Winner: " + winner,JLabel.CENTER);
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonReal = new JButton("Real Madrid");

    public Panel ()
    {
        setSize(300,300);
        setLayout(new BorderLayout());
        add(result,BorderLayout.NORTH);
        add(winnerRes,BorderLayout.CENTER);
        add(lastScoreText,BorderLayout.SOUTH);
        add(buttonMilan, BorderLayout.WEST);
        add(buttonReal, BorderLayout.EAST);
        buttonMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               a++;
               lastScore = "Milan";
               result.setText("Last scorer: " + lastScore);
               lastScoreText.setText("Result: " + a +" X " + b);
               if (a>b){
                   winner = "Milan";
                   winnerRes.setText("Winner: " + winner);
               } else if (a == b) {
                   winner = "N/A";
                   winnerRes.setText("Winner: " + winner);
               }

            }

        });
        buttonReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b++;
                lastScore = "Real Madrid";
                result.setText("Last scorer: " + lastScore);
                lastScoreText.setText("Result: " + a +" X " + b);
                if (a<b){
                    winner = "Real Madrid";
                    winnerRes.setText("Winner: " + winner);
                } else if (a == b) {
                    winner = "N/A";
                    winnerRes.setText("Winner: " + winner);
                }
            }
        });

    }
    public static void main(String[]args)
    {
        new Panel().setVisible(true);
    }
}