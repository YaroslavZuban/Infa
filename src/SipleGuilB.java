import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SipleGuilB implements ActionListener {
    JButton jButton;
    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setText("Поздравляю!");
    }

    public static void main(String[] args) {
        SipleGuilB sg=new SipleGuilB();
        sg.go();

    }

    public void go(){
        JFrame frame=new JFrame();
        jButton=new JButton("Урааааа, родился Андрюха");

        jButton.addActionListener(this);

        frame.getContentPane().add(jButton);
        frame.getContentPane().add(jButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,620);
        frame.setVisible(true);
    }
}
