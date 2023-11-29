import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class App {
   public static void main(String args[]) throws InterruptedException  {

   BoyFriend b1=new BoyFriend(1);
   Thread th1=new Thread(b1);
   th1.start(); 
   Thread.sleep(500);
    BoyFriend b2=new BoyFriend(2);
   Thread th2=new Thread(b2);
   th2.start(); 
}
  }