import java.util.Scanner;
import javax.swing.*;

public class cody {

    public static void main(String [] args){
        Scanner me = new Scanner(System.in);

         String [] service ={ " 1.oil change ", "2.tire rotation", "3. battery check ", "4. brake inspection"};
        int [] price ={ 25 , 22, 15,5};
         String [] comfirm ={"1. yes to purchase", "2. no  to stop the prcess", "3.cancel to terminate"};

         String servince =JOptionPane.showInputDialog(service);
        
        switch(servince){
        case "1":
                JOptionPane.showMessageDialog(null,service[0] + " costs  $" + price[0]  + " type"  );
                JOptionPane.showMessageDialog(null, comfirm);
                 String x =JOptionPane.showInputDialog(" enter your option");

                 if(x.equals("yes")){ 
                    
                 System.out.println("your are more than welcome ....just park at   the garage ");
                }
                 else if (x.equals("no")) {
                   System.out.println("thanks for visiting") ;
                  
                 }else{
                    System.out.println("come back next time");
                 }
                break;

        case "2": 
                JOptionPane.showMessageDialog(null,service[1] + " costs  $" + price[1]  + " type"  );
                   JOptionPane.showMessageDialog(null, comfirm);
                String z =JOptionPane.showInputDialog(" enter your option");

                 if(z.equals("yes")){ 
             
                 System.out.println("your are more than welcome ....just park at   the garage ");
               }
               else if (z.equals("no")) {
               System.out.println("thanks for visiting") ;
          
               }else{
                  System.out.println("come back next time");
               }
               break;
        case "3":
               JOptionPane.showMessageDialog(null,service[2] + " costs  $" + price[2]  + " type"  );
                JOptionPane.showMessageDialog(null, comfirm);
                String y =JOptionPane.showInputDialog(" enter your option");

               if(y.equals("yes")){ 
            
                  System.out.println("your are more than welcome ....just park at   the garage ");
                }
              else if (y.equals("no")) {
               System.out.println("thanks for visiting") ;
          
                }else{
              System.out.println("come back next time");
              }break;
      case "4":
            JOptionPane.showMessageDialog(null,service[3] + " costs  $" + price[3]  + " type"  );
            JOptionPane.showMessageDialog(null, comfirm);
            String h =JOptionPane.showInputDialog(" enter your option");

            if(h.equals("yes")){ 
          
            System.out.println("your are more than welcome ....just park at   the garage ");
            }
             else if (h.equals("no")) {
             System.out.println("thanks for visiting") ;
        
            }else{
            System.out.println("come back next time");
          }
           break;                                                                                                                                                                                                                                                      
    } }
    
}
