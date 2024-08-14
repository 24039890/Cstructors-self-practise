
class over{
double sal,profit,cost;

 over(){
    for(int i=0;i<40;i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
 }

    over(double sal, double profit, double cost) {
        this.sal = sal;
        this.profit = profit;
        this.cost = cost;
    }
 over(int x,int y,int b){
    profit=x;
    sal=y;
    cost=b;
     System.out.println("nul");
 }

  double vol(){
   return cost*profit*sal;
  }
 int vol(int x){
    return  (int)4.6;
 }
 boolean vol( boolean tru, boolean fals){
    return true;
 }


}

public class overloadingmc {
    public static void main(String [] args ){
   over me = new over();
   System.out.println(me);
   System.out.println(me.vol());

   over me1 = new over(2,2,2);
   System.out.println(me1);
   System.out.println(me1.vol(5));

   over me2 =new over(3.3,33,3);
   System.out.println(me2);
    }

    
}
