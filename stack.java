 class  appst{
  int stackarr[] = new int[7];
  int tos;
      appst(){

     tos=-1;
      }
      //this method pushes a numbers
    void push(int item){

      if(tos==6){
        System.out.println(" the stack is full ");
     }else{
        stackarr[++tos]= item;
     }
   }
   
   int pop(){
         if(tos<0){
            System.out.println(" the stack is on the underflow ");
            return 0;
         }else{

            return stackarr[--tos];
         }
        
    
   }

}
 
 public class stack {
    public static void main(String[]args ){

   appst me = new appst();
   appst me2 = new appst();


   for(int i = 0;i<7;i++){
    me.push(i);
    me2.push(i);
   }
    for(int x : me.stackarr)System.out.println("     " + x + "      ");
   
   for(int z=0; z <7 ;z++){
        System.out.println( me.pop());
   }
   

    }

    
}
