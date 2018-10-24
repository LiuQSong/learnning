import java.util.Timer;
import java.util.TimerTask;

public class TimerCount {
    int count=0;
    Timer timer=new Timer();
    public  TimerCount(){
        Timer testTimer = new Timer();
        testTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                add();
            }
        }, 0, 1000);
    }
    public int add(){
        count++;
        return count;
    }

}
