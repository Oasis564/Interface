import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait(); // wait if buffer is full
        }
        list.add(value);
        System.out.println("Producer produced: " + value);
        notify(); // notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait(); // wait if buffer is empty
        }
        int value = list.removeFirst();
        System.out.println("Consumer consumed: " + value);
        notify(); // notify producer
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.produce(value++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
