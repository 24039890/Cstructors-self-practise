

import java.awt.Color;
import javax.swing.*;
class me{


private int a = Integer.parseInt(JOptionPane.showInputDialog(" enter your lucky number"));

void seta(int i){
    a=i;
}
   int geta(){
    return a;
}

}
 class privateac {

    public static void main(String []args){



    me tb = new me();
    System.out.println(tb.geta());

   // JButton my =


 JFrame mt = new JFrame();
 mt.setBackground(Color.CYAN);
 mt.setSize(500,400);
 mt.setTitle(" THE billooner");
 mt.setBounds(200, 200, 200, 200);
 mt.setVisible(true);
 //mt.add(mf);
 
 }

 }