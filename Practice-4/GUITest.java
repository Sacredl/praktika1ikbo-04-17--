import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class GUITest extends JFrame
{
    JButton acmilan = new JButton("AC Milan");
    JButton rmadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("result");
    JLabel last_score = new JLabel("score");
    Label winner = new Label("win");
    private int ac_score = 0;
    private int rmadrid_score;

    public GUITest()
    {
        super("futbool");

        setSize(400,400);
        setLayout(new BorderLayout());
        add(acmilan, BorderLayout.WEST);
        add(rmadrid, BorderLayout.EAST);
        add(result, BorderLayout.NORTH);
        add(last_score, BorderLayout.SOUTH);
        add(winner, BorderLayout.CENTER);
        acmilan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ac_score++;
                result.setText(String.valueOf(ac_score) + " ac vs rm "+ rmadrid_score);
                result.updateUI();
                last_score.setText("Last Score - AC Milan");
                last_score.updateUI();
                if(rmadrid_score > ac_score) {
                    winner.setText("Winner - Real Madrid");
                }
                else if (rmadrid_score < ac_score){
                    winner.setText("Winner - AC Milan");
                }
                else {
                    winner.setText("Draw");
                }

            }
        });
        rmadrid.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rmadrid_score++;
                result.setText(ac_score + " ac vs rm "+ String.valueOf(rmadrid_score));
                result.updateUI();
                last_score.setText("Last Score - Real Madrid");
                last_score.updateUI();
                if(rmadrid_score > ac_score) {
                    winner.setText("Winner - Real Madrid");
                }
                else if (rmadrid_score < ac_score){
                    winner.setText("Winner - AC Milan");
                }
                else {
                    winner.setText("Draw");
                }

            }
        });
    }
}
