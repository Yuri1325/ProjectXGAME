


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener
 {
    ImageIcon image1;
    Jp jp;
    TextThingy txtPnl;
    Player playerCharacter;
    int playerVelocity;

       GameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.setSize(500,500);
        this.setTitle("ProjectX");
        this.setLayout(null);
        image1 = new ImageIcon("ツ Tsu Kanji Symbol Smile Japan Face Wall And Art Print _ Kawaii.jpg");
        this.setIconImage(image1.getImage());
        playerCharacter = new Player();
        this.add(playerCharacter);
        this.addKeyListener(this);
        txtPnl = new TextThingy();
        jp = new Jp();
        this.add(jp);
        
        
        
        
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='a'){
            playerVelocity++;
            playerCharacter.setLocation(playerCharacter.getX()-playerVelocity, playerCharacter.getY());
        }else if(e.getKeyChar()=='d'){
            playerVelocity++;
            playerCharacter.setLocation(playerCharacter.getX()+playerVelocity, playerCharacter.getY());
        }else if(e.getKeyChar()=='w'){
            playerVelocity++;
            playerCharacter.setLocation(playerCharacter.getX(), playerCharacter.getY()-playerVelocity);
        }else if(e.getKeyChar()=='s'){
            playerVelocity++;
            playerCharacter.setLocation(playerCharacter.getX(), playerCharacter.getY()+playerVelocity);
        }

       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a': playerVelocity = 0;
            break;
            case 'd':playerVelocity = 0;
            break;
            case 'w':playerVelocity = 0;
            break;
            case 's':playerVelocity = 0;
            break;
            
        }
    }
}

   