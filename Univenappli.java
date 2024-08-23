
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Univenappli {
  Scanner me = new Scanner(System.in);
    public static void main(String[] args) {
       Scanner me = new Scanner(System.in);

       String surname =JOptionPane.showInputDialog(" enter your surname");
        String name =JOptionPane.showInputDialog(" ENTER YOUR NAME " + surname);
        String Id =JOptionPane.showInputDialog("enter your id " + surname +" "+name);
       int age = Integer.parseInt(JOptionPane.showInputDialog(" enter age"));

        date_of_birth();
       subjects_learned();
        car_choices();
       
        
    } 
     static void   date_of_birth(){
        
         String month =JOptionPane.showInputDialog(" enter your month of birth");
        int year = Integer.parseInt(JOptionPane.showInputDialog(" enter year of birth"));
        int date =Integer.parseInt(JOptionPane.showInputDialog(" enter the date of birth"));
        String me = year + " " + month + " "+ date;
        JOptionPane.showMessageDialog(null, " date of birth : " +me);
    }

    static  double subjects_learned(){
      Scanner me = new Scanner(System.in);
      int number= Integer.parseInt(JOptionPane.showInputDialog("how many subject do your learn"));
      String [] arr =new String[number];
      Double [] arr1= new Double[number];
   
    

        for(int i =0;i<arr.length;i++){
            
          arr[i]=JOptionPane.showInputDialog(" list the subject number " + i + " here");
         }
    
    
        int average_marks=0;
        
        
         for(int i =0;i<arr.length;i++){
          
         arr1[i]=me.nextDouble();
         
          average_marks +=arr1[i];
         }
    
      
  
      for(int i =0;i<number;i++){
       JOptionPane.showMessageDialog(null, arr[i] + "  "  +arr1[i]);

       }


       JOptionPane.showMessageDialog(null, " your average is " , " average marks", average_marks);
        
        ImageIcon Icon = new ImageIcon(" smile.png");

         if(average_marks < (double)50){
          JOptionPane.showMessageDialog(null, " your don't meet the requirements  ", " ADMISSION ", average_marks, Icon );
            while( average_marks<50){
              JOptionPane.showMessageDialog(null, " try again next time", " APPLICATION UNSUCCESFULL", JOptionPane.WARNING_MESSAGE);
            }
           
        } else{
          JOptionPane.showConfirmDialog(null, " PRESS YES TO CONTINUE WITH THE APPLICATTION", " APPLICATION ADMISION", JOptionPane.YES_NO_CANCEL_OPTION);
            }

         
     return 0;

      
    }
  static void car_choices(){
   JOptionPane.showMessageDialog(null, " YOUR ARE REQUIRED TO CHOOSE 3 CARREER CHOICES");
    String choi[] = new String[3];

    for(int i = 0;i<=choi.length;++i){
    choi[i]=JOptionPane.showInputDialog(" enter  your carreer " +i);

   }

  }


    
}
