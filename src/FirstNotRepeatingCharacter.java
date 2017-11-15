import java.util.ArrayList;
import java.util.List;

public class FirstNotRepeatingCharacter
{
    public static char firstNotRepeatingCharacter(String s)
    {
        List<Character> charList = new ArrayList<>();
        for(Character c : s.toCharArray())
        {
            charList.add(c);
        }

        for(Character c : charList)
        {
            if(charList.indexOf(c) == charList.lastIndexOf(c))
            {
                return c;
            }
        }

        return '_';
    }

    public static char firstNotRepeatingCharacterTwo(String s)
    {
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';
    }

    public static void main(String[] args) {
        firstNotRepeatingCharacter("abacabad");
    }
}
