import java.util.concurrent.Callable;

public  class GirlFriend {
    private static Object a= new Object();
    public  void meet(BoyFriend b) throws InterruptedException{
      synchronized(this){
 System.out.println("Start meeting with "+b.name);
        Thread.sleep(2000);
        System.out.println("Finish meeting with "+b.name);
         synchronized(a){
           System.out.println("Start Messagee with "+b.name);
          Thread.sleep(2000);
        System.out.println("Finish Messagee with "+b.name);}
      }
        
    }
    public  void messeage(BoyFriend b) throws InterruptedException {
        synchronized(a){
           System.out.println("Start Messagee with "+b.name);
          Thread.sleep(2000);
        System.out.println("Finish Messagee with "+b.name);
                synchronized(this){
 System.out.println("Start meeting with "+b.name);
        Thread.sleep(2000);
        System.out.println("Finish meeting with "+b.name);
      }
        }


    }
}
