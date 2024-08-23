import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class TIMEFRAMER{
   public static void main(String [] args){

    Timer timer = new Timer();

    TimerTask TASK = new TimerTask() {
      int counter = 10;
      @Override
       public void run(){
        if(counter>0){
          System.out.println(counter +" seconds");
          counter--;

        }
        else{
        System.out.println(" haoppy new year");
        timer.cancel();
        }
       }

     
     };
   // timer.schedule(TASK, 7000);
   //if we want a code to run in future we can use a calender to d do,as it's allows us to set a time for a specific day

   Calendar date =  Calendar.getInstance();
   date.set(Calendar.YEAR,2024);
   date.set(Calendar.MONTH,Calendar.AUGUST);
   date.set(Calendar.DAY_OF_MONTH,19);
   date.set(Calendar.HOUR_OF_DAY,22);
   date.set(Calendar.MINUTE,23);
   date.set(Calendar.SECOND,0);
   date.set(Calendar.MILLISECOND,0);

  // timer.schedule(TASK, date.getTime());
  timer.scheduleAtFixedRate(TASK,date.getTime(), 0);

  }


}
