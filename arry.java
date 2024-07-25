

public class arry {

    public static void main(String [] args){
   int arrays[][]={ { 8,3,9, 0,10},{ 3,5,17,1,13},{2,8,6,23,13,},{15,7,3,2,9},{ 6,14,2,6,0} };

    int[] row_sum ={30,27,40,36,28};
    int [ ] column_sum={34,37,37,32,21};



  for(int i =0;i<arrays.length;i++){
    //System.out.print(" the row sum is " + row_sum[i]);
     for(int k=0;k<arrays.length;k++){
        System.out.println(arrays[i][k]  +"  ");
       //System.out.println(" the columns sum is" + column_sum[k]);
       //System.out.print(" the row sum is " + row_sum[i]);
     }


  }



    }
    
}
