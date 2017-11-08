
public class Main
{
    public static void main(String[] args)
    {
        int currentTime = 0;
        int[] arrivalTime = {3,3,9};
        int[] serviceTime = {2,15,14};
        int currentMax = -1;
        int wait = 0;


        for (int i=0;i<serviceTime.length;i++)
        {
            wait = Math.max(currentTime, arrivalTime[i]);
            currentMax = Math.max(currentMax, wait - arrivalTime[i]);
            currentTime = wait + serviceTime[i];
        }

        System.out.println("Current Max is: " + currentMax);
    }
}
