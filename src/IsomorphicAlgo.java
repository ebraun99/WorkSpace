import java.util.HashMap;

public class IsomorphicAlgo
{
    public static void isIsomorphic(String one, String two)
    {

        boolean answer = true;

        if(one.length()!=two.length())
    {
        answer = false;
    }
        if(one==null || two==null)
    {
        answer= false;
    }

    HashMap<Character,Character> map = new HashMap<>();

        for (int i = 0; i < one.length() ; i++)
    {
        char c1 = one.charAt(i);
        char c2 = two.charAt(i);

        if(map.containsKey(c1))
        {
            if(map.get(c1)!=c2)
            {
                answer = false;
            }
        }
        else
        {
            if(map.containsValue(c2))
            {
                answer = false;
            }
            map.put(c1,c2);
        }
    }

        System.out.println(answer);
}

    public static void main(String[] args)
    {
        isIsomorphic("egg", "add");
    }
}
