import javax.swing.JOptionPane;

public class DIpslay {
    public static  void main(String []args){
    String name =JOptionPane.showInputDialog(" enter your surname");
    
    JOptionPane.showMessageDialog(null, " hello  " + name);
    int age = Integer.parseInt(JOptionPane.showInputDialog(" enter yyour age "));

    JOptionPane.showMessageDialog(null,    "hello   "  + name + "   your are " + age  +"  years  old");

    double height= Double.parseDouble( JOptionPane.showInputDialog("enter your height "));
    JOptionPane.showMessageDialog(null, " your are " + height + " tall");
    
    }
}

