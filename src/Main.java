import java.util.HashMap;
import java.util.HashSet;

public class Main
{

    public static char firstDuplicate(String s)
    {
        char c = '_';
        HashSet<Character> set = new HashSet<>();


        for (int i = 0; i <s.length() ; i++)
        {
            if(set.add(s.charAt(i)))
            {

                if (i != s.length() - 1) {
                    if (s.indexOf(s.charAt(i), i + 1) == -1) {
                        c = s.charAt(i);
                    }
                }
//                else {
//                    if (s.lastIndexOf(s.charAt(i)) != i) {
//                        c = s.charAt(i);
//                    }
//                }
            }

        }

        return c;
    }

    public static void main(String[] args)
    {
        String s = "abacabaabacaba";

        System.out.println(firstDuplicate(s));
    }
}
