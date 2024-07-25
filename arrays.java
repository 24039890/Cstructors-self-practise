 
 import java.util.Scanner;
 
 public class arrays{
  public static void main(String[] args){
      Scanner big = new Scanner(System.in);
      System.out.println(" enter the number to be tested");
     int num =big.nextInt();


      //write a code that will  search for reapeatation  and if there is a reapeatation print(yes);
     // step 1 declare an array which will store the averange numbers 
      int[] put = new int[10];
    

     //step 2 create a loop that will search for numbers which are reapeating
    
     int x;

     while(num>0){

       x=num%10;
     if(put[x]==1)
       break;
        put[x]=1;
        num=num/10;
      }
     
      //step 3 create the if statement that will allow the program to say yes if the reapeeatation is found or print no if repeataion is not found  
    
     if(num>0){
        System.out.println("yes");

     }else{

        System.out.println("no");
     }

    }
}