import java.awt.Color;
import javax.swing.*;

public class frame {
    public static void main(String [] args){


        JFrame frame = new JFrame(" be my gues");
        
        frame.setSize(400, 600);
        frame.setBackground(Color.lightGray);
        frame.setTitle(" THE AVERAGE MARKS");
        
        JButton button = new JButton(" click to this panel");
        button.setBackground(Color.magenta);
        button.setBounds(200,300,300,233);

        ImageIcon me = new ImageIcon();
        frame.add(button);
        frame.setVisible(true);
          
        
        


    }
    
}
