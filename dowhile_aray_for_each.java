
import java.io.IOException;
import java.util.Scanner;


  public class dowhile_aray_for_each {
  
    public static void  main(String args[]) throws  IOException {
       Scanner Big= new Scanner(System.in);
      // int x1  = Big.nextInt();
       
     

     System.out.println(" welcome to a vodacom app!!   dial the keynumbers to recieve our service  ");
       char choice;
        String x=Big.nextLine();
    if( x .equals( *100#")){ 
        String arr[]={ "0.balance" ," 1. buy data bundle" ," 2.advance airtime "," 3. buy voice-voice   " ," 4.vodacom shake every dAY", "5. service"};
      do{
            for( String x : arr){
                System.out.println(x);
                }
           
          choice =(char)System.in.read();
       
         } while(choice ==arr.length+1);
      
          System.out.println(" /n");
    
      switch(choice){ 

        case '0':
          System.out.println(" your have 100 MB bundles ,R65 airtime ,10 all network ,o night shift bundle");
          break;

        case '1':
               int choice2;
               String array2[]={"1. 420 MB for R5.67 3 days  " ,"2. 250Mb for R5  for today   " , "3. 1GB for R20 7 days ","4. 7GB for R88 30 DAYS" };
              do{
             
                  for(String bundle:array2 ){
                  System.out.println(bundle);
                  }

                  choice2=(int)Big.nextInt(); 
             
               } while(choice2> array2.length);

               System.out.println("/n");

               switch(choice2){
                 case 1:
                       char choice3;
                       System.out.println(" do your really want to purchase " + array2[0]+ " to purchase type 1");
                        String array3[] ={" 1.comfirm purchase" , " 2.cancel"};
                     do { 
                        for (String y :array3){
                        System.out.println(y);
                       }
                        choice3=(char)System.in.read();
                     
                     } while (choice3==array3.length);
                      
                     if(choice3=='1'){
                     System.out.println("  your have succefully purchase th data!! wwe wish your luck ");
                     }else{
                      System.out.println(" thank your for using our vodacom  ");

                     }
                     break;

                case 2:
                System.out.println(" do your really want to purchase " + array2[1]+ " to purchase type 1");
                    String array4[] ={" 1.comfirm purchase" , " 2.cancel"};
                  do { 
                    for (String y :array4){
                        System.out.println(y);
                    }
                    choice3=(char)System.in.read();
                     
                  } while (choice3==array4.length);
                  
                   if(choice3=='1'){
                    System.out.println("  your have succefully purchase the data!! ");
                   }else{
                      System.out.println(" thank your for using our vodacom  ");

                    }
                    break;
                
                case 3:
                System.out.println(" do your really want to purchase " + array2[2]+ " to purchase type 1");
                  String array5[] ={" 1.comfirm purchase" , " 2.cancel"};
                  do { 
                    for (String y :array5){
                        System.out.println(y);
                    }
                    choice3=(char)System.in.read();
                     
                  } while (choice3==array5.length);
                  
                   if(choice3=='1'){
                    System.out.println("  your have succefully purchase th data!! ");
                   }else{
                      System.out.println(" thank your for using our vodacom  ");

                    }
                    break;    

                case 4:
                System.out.println(" do your really want to purchase " + array2[3]+ " to purchase type 1");
                   String array6[] ={" 1.comfirm purchase" , " 2.cancel"};
                  do { 
                     for (String y :array6){
                      System.out.println(y);
                    }
                    choice3=(char)System.in.read();
                   
                   } while (choice3==array6.length);
                
                   if(choice3=='1'){
                  System.out.println("  your have succefully purchase th data!! ");
                  }else{
                    System.out.println(" thank your for using our vodacom  ");

                  }
                 break;
               }
        case '2':
            int choice4;
            String arr11[]={"1.data","2.artime","3.voice- voice"};
           System.out.println(" your have R20 airtime available for advance");
           do { 
            for(String ser :arr11){
                System.out.println(ser);
            }
            choice4=Big.nextInt(); 

            } while (choice4==arr11.length+1);

           switch(choice4) {
               case 1:
                   char choice5;
                   String arr2[] = {"1. 100mb for R10 for 2 days", "2.320 mb for R15 for 2 days ", "3.500mb for R20 for 7days "};
                   do {
                       for (String ser : arr2) {
                           System.out.println(ser);
                       }
                       choice5 = (char)System.in.read();

                   } while (choice5 == arr2.length);
                   switch (choice5) {
                       case 1:
                           char choice6;
                           System.out.println(" do your really want to purchase " + arr2[1] + " to purchase type 1");
                           String arr3[] = {" 1.comfirm purchase", "2. cancel"};
                           do {
                               for (String ser : arr3) {
                                   System.out.println(ser);
                               }
                               choice6 =(char) System.in.read();

                           } while (choice6 > arr3.length);

                           if (choice6 == 1) {
                               System.out.println("  your have succefully purchase th airtime!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           break;
                       case 2:
                           char choice7;
                           System.out.println(" do your really want to purchase " + arr2[2] + " to purchase type 1");
                           String arr4[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr4) {
                                   System.out.println(ser);
                               }
                               choice7 = (char)System.in.read();

                           } while (choice7 == arr4.length);

                           if (choice7 == '1') {
                               System.out.println("  your have succefully purchase th airtime!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           break;

                       case 3:
                           char choice8;
                           System.out.println(" do your really want to purchase " + arr2[3] + " to purchase type 1");
                           String arr5[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr5) {
                                   System.out.println(ser);
                               }
                               choice8 = (char) System.in.read();

                           } while (choice8 == arr5.length);

                           if (choice8 == '1') {
                               System.out.println("  your have succefully purchase th airtime!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           
                       }

                       
                       break;

               case 2:
                   int choice9;
                   String arr7[] = {"0.R5 Airtime","1.R10  airtime ","2.R15 airtime"," 3.R20 airtime"};
                   do {
                       for (String ser : arr7) {
                           System.out.println(ser);
                       }
                       choice9 = Big.nextInt();

                   } while (choice9 == arr7.length+1);
                   switch (choice9) {
                       case 1:
                           int choice6;
                           System.out.println(" do your really want to purchase " + arr7[1] + " to purchase type 1");
                           String arr3[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr3) {
                                   System.out.println(ser);
                               }
                               choice6 = Big.nextInt();

                           } while (choice6 == arr3.length+1);

                           if (choice6 == 1) {
                               System.out.println("  your have succefully purchase th data!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           break;
                       case 2:
                           char choice7;
                           System.out.println(" do your really want to purchase " + arr7[2] + " to purchase type 1");
                           String arr4[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr4) {
                                   System.out.println(ser);
                               }
                               choice7 = (char) System.in.read();

                           } while (choice7 == arr4.length);

                           if (choice7 == '1') {
                               System.out.println("  your have succefully purchase th data!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           break;

                       case 3:
                           int choice8;
                           System.out.println(" do your really want to purchase " + arr7[3] + " to purchase type 1");
                           String arr5[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr5) {
                                   System.out.println(ser);
                               }
                               choice8 = (char) System.in.read();

                           } while (choice8 == arr5.length);

                           if (choice8 == '1') {
                               System.out.println("  your have succefully purchase th data!! ");
                           } else {
                               System.out.println(" go back to the main menu ");

                           }
                           break;
                       case 4:
                           int choice10;
                           System.out.println(" do your really want to purchase " + arr7[4] + " to purchase type 1");
                           String arr6[] = {" 1.comfirm purchase", " cancel"};
                           do {
                               for (String ser : arr6) {
                                   System.out.println(ser);
                               }
                               choice10 = (char) System.in.read();

                           } while (choice10 > arr6.length);

                           if (choice10 == '1') {
                               System.out.println("  your have succefully purchase th data!! ");
                           } else {
                               System.out.println(" thank your for using our vodacom  ");

                           }
                           
                       }break;

                case 3:

                int choice7;
                String arr6[] = {"0. R5.74 airtime for voda minutes", "1. R10.55 airtime for 10 all network minutes ", "2.R19.57 airtime for 10 all network minutes + 15 voda minutes "};
                do {
                    for (String ser : arr6) {
                        System.out.println(ser);
                    }
                    choice7 = Big.nextInt();

                } while (choice7 == arr6.length+1);
                switch (choice7) {
                    case 0:
                        char choice6;
                        System.out.println(" do your really want to purchase " + arr6[0] + " to purchase type 1");
                        String arr3[] = {" 1.comfirm purchase", "2. cancel"};
                        do {
                            for (String ser : arr3) {
                                System.out.println(ser);
                            }
                            choice6 =(char) System.in.read();

                        } while (choice6 > arr3.length);

                        if (choice6 == 1) {
                            System.out.println("  your have succefully purchase th airtime!! ");
                        } else {
                            System.out.println(" thank your for using our vodacom  ");

                        }
                        break;
                    case 1:
                        char choice11;
                        System.out.println(" do your really want to purchase " + arr6[1] + " to purchase type 1");
                        String arr4[] = {" 1.comfirm purchase", " cancel"};
                        do {
                            for (String ser : arr4) {
                                System.out.println(ser);
                            }
                            choice11= (char)System.in.read();

                        } while (choice11 == arr4.length);

                        if (choice11== '1') {
                            System.out.println("  your have succefully purchase th airtime!! ");
                        } else {
                            System.out.println(" thank your for using our vodacom  ");

                        }
                        break;

                    case 2:
                        char choice8;
                        System.out.println(" do your really want to purchase " + arr6[2] + " to purchase type 1");
                        String arr5[] = {" 1.comfirm purchase", " cancel"};
                        do {
                            for (String ser : arr5) {
                                System.out.println(ser);
                            }
                            choice8 = (char) System.in.read();

                        } while (choice8 == arr5.length);

                        if (choice8 == '1') {
                            System.out.println("  your have succefully purchase th airtime!! ");
                        } else {
                            System.out.println(" thank your for using our vodacom  ");

                        }
                        
                    }
                    break;
                    
        case '3':          
         
               int choice12;
               String arr8[] = {"0. R5.74 airtime for voda minutes", "1. R10.55 airtime for 10 all network minutes ", "2.R19.57 airtime for 10 all network minutes + 15 voda minutes "};
            do {
              for (String ser : arr8) {
                System.out.println(ser);
               }
               choice12 = Big.nextInt();

               } while (choice12 == arr8.length+1);
               switch (choice12) {
               case 0:
                    char choice6;
                     System.out.println(" do your really want to purchase " + arr8[0] + " to purchase type 1");
                    String arr3[] = {" 1.comfirm purchase", "2. cancel"};
                    do {
                      for (String ser : arr3) {
                        System.out.println(ser);
                      }
                     choice6 =(char) System.in.read();

                    } while (choice6 > arr3.length);

                    if (choice6 == 1) {
                    System.out.println("  your have succefully purchase th airtime!! ");
                    } else {
                    System.out.println(" thank your for using our vodacom  ");

                   }
                   break;
               case 1:
                  char choice11;
                  System.out.println(" do your really want to purchase " + arr8[1] + " to purchase type 1");
                  String arr4[] = {" 1.comfirm purchase", " cancel"};
                  do {
                    for (String ser : arr4) {
                        System.out.println(ser);
                    }
                    choice11= (char)System.in.read();

                  } while (choice11 == arr4.length);

                   if (choice11== '1') {
                    System.out.println("  your have succefully purchase th airtime!! ");
                  } else {
                    System.out.println(" thank your for using our vodacom  ");

                 }
                 break;

            case 2:
                 char choice8;
                 System.out.println(" do your really want to purchase " + arr8[2] + " to purchase type 1");
                 String arr5[] = {" 1.comfirm purchase", " cancel"};
                 do {
                     for (String ser : arr5) {
                        System.out.println(ser);
                     }
                     choice8 = (char) System.in.read();

                    } while (choice8 == arr5.length);

                 if (choice8 == '1') {
                    System.out.println("  your have succefully purchase th airtime!! ");
                 } else {
                    System.out.println(" thank your for using our vodacom  ");

                 }
                
             }
             break;
            
        case '4':
               char choice13;
               String arr9[]= {" 1.summer shake","2.shake everyday","3.back"};
        
               do { 
                 for(String x:arr9){
                 System.out.println(x);
                 }
                 choice13 =(char)System.in.read();
               
                } while (choice13 == arr9.length+1);
          
                switch(choice13){
            case 1:
                char choi1;   
                String arra[]={"1.summer shake", " back"}; 
                do { 
                    for(String v:arra){
                    System.out.println(v);
                    }
                    choi1=(char)System.in.read();
                } while (choi1==arra.length+1);
                       switch(choi1){

                       case 1:
                          System.out.println("well shake!!!  your have won 200MB  for today");
                        break;
                       case 2:
                          for(String x:arr9){
                            System.out.println(x);
                            }
                         } break;
            case 2:          
                char choi11;   
                String arra1[]={"1.summer shake", " back"}; 
              do { 
                  for(String v:arra1){
                  System.out.println(v);
                  }
                  choi11=(char)System.in.read();
                } while (choi11==arra1.length+1);
                   switch(choi11){

                   case 1:
                      System.out.println("well shake!!!  your have won 200MB  for today");
                    break;
                   case 2:
                      for(String x:arr9){
                        System.out.println(x);
                        }
                     } break;
                    
                  
                     
            case 3:
            for( String x : arr){
                System.out.println(x);
                }
            
                }break;
            
                



      }
    }
        
    }
  }

            

        
    



    

    

