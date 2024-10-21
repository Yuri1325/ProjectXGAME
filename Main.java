
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;





public class Main  {
     static JFrame jf;
    static MyPanel mp;
     
     
     static JTextField jtf;
    public static void main (String[]args){
        //JFRAME
        jf = new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLayout(new GridLayout());
        jf.setResizable(false);
        
        jf.setBounds(100, 100, 1000, 1000);
        //JLABEL
       
       
        
        

        //JPANEL
        mp = new MyPanel();


        

        jtf = new JTextField();
        jtf.setVisible(true);
        jtf.setColumns(15);
    jf.add(mp);
    
    mp.add(mp.jl);
    mp.add(jtf);
    mp.add(mp.jb);

     mp.updateUI();
     jf.pack();   
         

         
       
        
       
    }

    
    }
    
    
    
