import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C simpleGui3C=new SimpleGui3C();
        simpleGui3C.go();
    }
    public void go(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("нажми кномку");
        button.addActionListener(this);

        MyDrawPanel myDrawPanel=new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
