package utility;

// This is web utility  whre frequently used classes

public class WebUtility extends BaseMain {
    public static void sleepTimer(int sleepTime){
        try {
            Thread.sleep(sleepTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
