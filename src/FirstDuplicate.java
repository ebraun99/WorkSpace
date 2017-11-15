import java.util.HashSet;

public class FirstDuplicate
{
    public static int firstDuplicate(int[] a)
    {
        for(int i=0;i<a.length;i++)
            if(a[Math.abs(a[i])-1]<0)
                return Math.abs(a[i]);
            else {
                a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
            }
        return -1;
    }

    public static int firstDuplicateTwo(int[] a)
    {
        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<a.length;i++)
            if(!(s.add(a[i])))
                return a[i];
        return -1;
    }


    public static void main(String[] args)
    {
        int[] array = new int[]{
                2,3,3,1,5,2
        };

        int[] array2 = new int[]{
                2,4,3,5,1
        };

        System.out.println(firstDuplicate(array2));
    }
}
