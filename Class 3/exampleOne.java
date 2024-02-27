public class exampleOne{
public static void main(String[] args){
ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup parentGroup;
        while ((parentGroup = rootGroup.getParent()) != null) {
        rootGroup = parentGroup;
        }

        Thread[] threads = new Thread[rootGroup.activeCount()];
        while (rootGroup.enumerate(threads, true) == threads.length) {
        threads = new Thread[threads.length * 2];
        }

        for (int i = 0; i < threads.length; i++) {
        Thread thread = threads[i];
        if (thread != null) {
        System.out.println("Name: " + thread.getName());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("Is Alive: " + thread.isAlive());
        System.out.println("Thread Declaration: Name - " + thread.getName() + ", Priority - " + thread.getPriority() + ", Group - " + thread.getThreadGroup().getName());

        if (thread.getPriority() < Thread.MAX_PRIORITY) {
        thread.setPriority(thread.getPriority() + 1);
        System.out.println("New Priority: " + thread.getPriority());
        }
        }
        }
}
}
