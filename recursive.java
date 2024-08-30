class fact{


    int voi(int n){
    int results;

    if(n==1)return 1;
        results =voi(n-1)*n;
    
        return results;
    }

}
public class recursive {
    public static void main(String [] args ){

        fact me = new  fact();
       System.out.println( me.voi(3));
       System.out.println( me.voi(4));
       System.out.println( me.voi(5));
    }
    
}
