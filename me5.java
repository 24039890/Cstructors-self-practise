
public class me6{
    public static void main(String [] args ){

     me5 me2 = new me5();

     System.out.println(" the factorial of 2 is " + me2.fact(2));

    }
}

    public class me5{

        int fact (int n){
            int result;
    
            if(n==1)return 1;
            result=fact(n-1)*n;
            return result;
    
    
        }
    
    }


