import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;


public class collect {
    public static void  main(String [] args){
    
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> studnm = new ArrayList<Integer>();
     int student =Integer.parseInt(JOptionPane.showInputDialog("enter the number of application"));

     do { 
        for(int i =0;i<student;i++){
          names.add(JOptionPane.showInputDialog("enter the names  for stundent " + i));
          studnm.add(Integer.parseInt(JOptionPane.showInputDialog(" enter their stundent numbers for student number" + i)));
        } 
         
     } while (student<student-1);
        
     for(int c =0; c <names.size();c++){
        System.out.println(names.get(c) +" " +" " +  studnm.get(c));
     }
      names.set(0, "tsetselelo");
      

      Collections.sort(names);
      System.out.println();
      
      for(int c =0; c <names.size();c++){
        System.out.println(names.get(c) +" " +" " +  studnm.get(c));
     }
      
     System.out.println(names.size());
    names.remove("peace");
    for(int c =0; c <names.size();c++){
        System.out.println(names.get(c) +" " +" " +  studnm.get(c));
     }
     names.clear();
     System.out.println("//**********");
     for(int c =0; c <names.size();c++){
        System.out.println(names.get(c) +" " +" " +  studnm.get(c));
     
    }
}  
}
