package Multithreading;

public class FirstRunnable
{
    public static void main(String[] args)
    {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");

        //start
        t.start();
    }
}
