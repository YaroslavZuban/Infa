import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {

    public  void paintComponent(Graphics g){
     g.setColor(Color.blue);
     //g.fillOval(x,y,40,40);
       //==================================================================================================
       /*int red=(int)(Math.random()*255);
       int blue=(int)(Math.random()*255);
       int green=(int)(Math.random()*255);

       Color startColor=new Color(red,green,blue);

       red=(int)(Math.random()*255);
       blue=(int)(Math.random()*255);
       green=(int)(Math.random()*255);

       Color endColor=new Color(red,green,blue);

        GradientPaint gradientPaint1=new GradientPaint(70,70,startColor,150,150,endColor);

        b.setPaint(gradientPaint1);

        b.fillOval(70,70,100,100);*/
        //тоже самое что и выше
    }
}
