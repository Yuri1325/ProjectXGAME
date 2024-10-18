
import java.awt.Color;
import javax.swing.JOptionPane;


public class Main {
    static String username;
    static boolean gameStarted = false;
    static Color playerColor;
    static String jop2;
    public static void main (String[]args){

        int jop;
        while (!(gameStarted)){
            username = JOptionPane.showInputDialog("Insert a username");

            jop2 = JOptionPane.showInputDialog("Character Color?");
            
                
            jop =JOptionPane.showConfirmDialog(null, "Would you like to start?");
            switch  (jop){
                case 0: gameStarted=true;
                break;
                case 1:gameStarted = false;
                break;
                case 2:gameStarted = false;
                break;

            }

        }
         
        GameFrame gameFrame = new GameFrame();
       
    }
    
    }
    
