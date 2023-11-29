import java.util.concurrent.Callable;


public class BoyFriend implements Runnable{
    public int name;
 private static  GirlFriend gFriend = new GirlFriend();// phải static để luôn cùng 1 object

    BoyFriend(int n){
    name=n; 
    }
    @Override
    public void run() {
       try {
        if (name==1){
        gFriend.meet(this);
   // gFriend.messeage(this);
        }
        else {
             gFriend.messeage(this);
            // gFriend.meet(this);
        }
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
