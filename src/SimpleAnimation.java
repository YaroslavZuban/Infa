import javax.swing.*;
import java.awt.*;

class SimpleAnimation {
    private int x = 70;
    private int y = 70;

    public static void main(String[] args) {
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MiDrawPanel miDrawPanel = new MiDrawPanel();
        frame.getContentPane().add(miDrawPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        for (int i = 0; i < 300; i++) {
            x++;
            y++;

            miDrawPanel.repaint();

            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
        }

    }


    class MiDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillOval(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.blue);
            g.fillOval(x, y, 50, 50);
        }
    }
}
