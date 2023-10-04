package moduloTres;

public class GetState implements Runnable {

    @Override
    public void run() {
        // returns the state of the thread
        Thread.State state = Thread.currentThread().getState();
        System.out.println("Running thread name: "+ Thread.currentThread().getName());
        System.out.println("State of thread: " + state);
    }

    public static void main(String[] args) {
        GetState getState = new GetState();
        Thread t1 = new Thread(getState);
        Thread t2 = new Thread(getState);
        t1.start();
        t2.start();
    }
}
