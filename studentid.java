 import java.util.Scanner;
 
 
 class humid{
 double height,weight ,size;

   
  humid(double v,double x ,double y){
   height=v;
   weight =x;
   size=y;
  }

 double vol1(){
  return height*weight*size;
  }


}
class studentid{
  public static void main(String[] args) {
  Scanner new4 = new Scanner(System.in);
  humid new1= new humid( new4.nextDouble(),new4.nextDouble(),new4.nextDouble());
  humid new2 = new humid(new4.nextDouble(),new4.nextDouble(),new4.nextDouble());


  double vol=new1.vol1();
  System.out.println(vol);

  
  double vol2=new2.vol1();
  System.out.println(vol2);
      
  }

}