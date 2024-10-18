
import java.awt.Color;
import javax.swing.JPanel;

public class Jp extends JPanel {
    TextThingy textThingy;
    Jp(){
        this.setVisible(true);
        textThingy = new TextThingy();
        this.add(textThingy);
        this.setBackground(Color.black);
        this.setBounds(0, 0, 500, 200);

    }
}
