package Multithreading;

import java.util.stream.IntStream;

public class RaceCondition
{
    public static void main(String[] args)
    {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {
            IntStream.range(0,1_000).forEach(n->longWrapper.incrementValue());
        };

        Thread[] threads = new Thread[1_000];

        for (int i = 0; i<threads.length; i++)
        {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for(int i = 0; i<threads.length;i++)
        {   try {
            threads[i].join();
        }
        catch (InterruptedException ex)
        {
            System.out.println("exception");
        }
        }

        System.out.println("Value = " + longWrapper.getValue());
    }
}
