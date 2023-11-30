import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumerExample {

    private static final int BUFFER_SIZE = 10;

    private static Queue<Integer> queue = new ArrayDeque<>(BUFFER_SIZE);

    public static void main(String[] args) throws InterruptedException {

        Thread producerThread = new Thread(new Runnable() {
        
            @Override
            public void run() {
                    for (int i = 0; i < 100; i++) {
                    while (queue.size() == BUFFER_SIZE) {
                        Thread.yield();
                    }
                    queue.add(i);
                    System.out.println("Producer: " + i);
                
            }
            }
        });

        Thread consumerThread = new Thread(new Runnable() 
         {
            @Override
            public void run() {
                while (true){
                    while (queue.isEmpty()) {
                        Thread.yield();
                    }
                    int data = queue.poll();
                    System.out.println("Consumer: " + data);
            }
            }
        });
        producerThread.setPriority(2);
         producerThread.start();
        consumerThread.start();
    }
}
