
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
    ImageIcon plyrImage;

    Player(){
        this.setVisible(true);
        this.setOpaque(true);
        this.setBackground(Main.playerColor);
        this.setBounds(100, 100, 50, 50);
        setClr(Main.jop2);

        plyrImage = new ImageIcon("scratch-mascot_75x76_49x50.png");
        this.setIcon(plyrImage);
        this.setText(Main.username);
        this.setForeground(Color.white);
        
        
    }
    
public void setClr(String color){
    if (color.equals("red")){
        this.setBackground(Color.red);
    }
    if (color.equals("blue")){
        this.setBackground(Color.blue);
    }
    if (color.equals("green")){
        this.setBackground(Color.green);
    }
    if (color.equals("black")){
        this.setBackground(Color.black);
    }
    if (color.equals("pink")){
        this.setBackground(Color.pink);
    }
    if (color.equals("clear")){
        this.setBackground(Color.white);
        this.setForeground(Color.black);
    }
    if (color.equals("none")){
        this.setBackground(null);
    }
}
}