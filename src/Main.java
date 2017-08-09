

public class Main
{

    public static void main(String[] args)
    {
//        There are N children standing in a line. Each child is assigned a rating value.
//        You are giving candies to these children subjected to the following requirements:
//
//        1. Each child must have at least one candy.
//        2. Children with a higher rating get more candies than their neighbors.
//
//            What is the minimum candies you must give?
//
//            Analysis
//
//        This problem can be solved in O(n) time.

        int[] ratings = new int[]{
                1,2,3,2,3,7,2,1
        };

        System.out.println(candyMan(ratings));


    }

    public static int candyMan(int[] ratings)
    {
        int length = ratings.length;
        int[] passThrough = new int[length];
        int[] passThrough2 = new int[length];

        int candyCount = 0;



        passThrough[0] = 1;
        passThrough2[length-1] = 1;

        for(int i=1;i<length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                passThrough[i] = passThrough[i-1] + 1;
            }

            else
            {
                passThrough[i] = 1;
            }

            if(ratings[length - i -1]>ratings[length - i])
            {
                passThrough2[length - i - 1] = passThrough2[length - i] + 1;
            }

            else
            {
                passThrough2[length - i - 1] = 1;
            }
        }

        for(int i=0;i<length;i++)
        {
            candyCount+= Math.max(passThrough[i],passThrough2[i]);
        }

        return candyCount;
    }
}
