
import java.util.Scanner;


public class swit{
  public static void main(String[] args) {

       Scanner big = new Scanner(System.in);
       System.out.println("enter the cas number"  + "      ");;
       int time =big.nextInt();


         switch(time){
         case 6:
          System.out.println("  take a bath bro");
          break;
         case 9:
         System.out.println("  watch a movie bro .....like before your sleep");
        break;

        case 8:
        System.out.println(" just cook some food bro");
        break;

        case 7:
        System.out.println(" just watch cartoons bro");
        break;


        case 10:
        System.out.println(8);
        break;
        default:
        System.out.println(" see your tommorow bitch");

         }



      
  }

/* we can use the switch to save time if we have a bunch of statements that wants to be executed today */

}