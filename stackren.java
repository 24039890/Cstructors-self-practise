
import java.util.*;

public class stackren {


    public static void main(String [] args){
    Stack me = new Stack();
    me.push(5);

        
        


   }
    
 }
class stack{

    Scanner me = new Scanner(System.in);
  int [] num;
  int tops ;

   stack(){
    num= new int[5];
    tops=-1;

  }
    void push(int item){
      
     if( tops< 0){

       ++tops;
       System.out.println(" insert the data");
       num[tops]=me.nextInt();

       while(tops<num.length){
          ++tops;
          if(tops==num.length){
             break;
          }
         else{ System.out.println(" insert the data");
        
             num[tops]=me.nextInt();
          }
     }
   }else if(tops>=0 && tops<num.length){

        System.out.println(" insert the data");
        num[tops]=me.nextInt();

       while(tops<num.length){
          if(tops==num.length){
            break;
          }
         else{ System.out.println(" insert the data");
          ++tops;
          num[tops]=me.nextInt();
        }
      }

    }else{

        System.out.println(" stack is full.......        overflow");
    }

    //System.out.println(" the collected data :");

     for(int x : num){

     System.out.print(x  + "  ");
    }



 }
   

}
