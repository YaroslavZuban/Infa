import javax.swing.*;

public class SipleGuil {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton button=new JButton("Ура родился Андрюха!=)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
