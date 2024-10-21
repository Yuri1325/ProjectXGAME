
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {
    static JButton jb;
    static int questionNumber;
    static String username;
    static JLabel jl;
    public MyPanel() {
        questionNumber = 1;
this.setPreferredSize(new Dimension(500,100));
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setLocation(0, 0);
         //JBUTTON
         jb = new JButton("Submit");
         jb.setVisible(true);
         jb.addActionListener(this);
         //JLABEL
         jl = new JLabel();
        jl.setVisible(true);
         switch (MyPanel.questionNumber){
            case 1: jl.setText("USERNAME:");
            this.updateUI();
            break;
            case 2:jl.setText("PASSWORD:");
            this.updateUI();
           }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (questionNumber==1){
        if(e.getSource().equals(jb)){
        username = Main.jtf.getText();
        questionNumber++;
        System.out.println(username);
        System.out.println(questionNumber);
        
        }
       }
    }
    
}
