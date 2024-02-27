import java.util.concurrent.TimeUnit;

public class TickTack implements Runnable {
    private final String name;
    private final long rateInMillis;

    public TickTack(String name, long rateInMillis) {
        this.name = name;
        this.rateInMillis = rateInMillis;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(name + ": Tick");
                TimeUnit.MILLISECONDS.sleep(rateInMillis);
                System.out.println(name + ": Tack");
                TimeUnit.MILLISECONDS.sleep(rateInMillis);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Create two clocks with different names and ticking rates
        TickTack seikoClock = new TickTack("Seiko", 600); // 600 ms rate
        TickTack casioClock = new TickTack("Casio", 400); // 400 ms rate

        // Run the clocks in separate threads
        Thread seikoThread = new Thread(seikoClock);
        Thread casioThread = new Thread(casioClock);

        seikoThread.start();
        casioThread.start();
    }
}
