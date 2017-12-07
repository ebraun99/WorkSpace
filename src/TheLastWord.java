import java.util.LinkedList;

public class TheLastWord
{
    public static void main(String[] args)
    {
        System.out.println(theLastWord("ZXCASDQWE"));
    }

    private static LinkedList theLastWord(String initialWord)
    {
        char[] charArray = initialWord.toCharArray();
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        characterLinkedList.add(charArray[0]);

        for (int i = 1; i <charArray.length ; i++)
        {
            if (charArray[i]>=characterLinkedList.getFirst())
            {
                characterLinkedList.offerFirst(charArray[i]);
            }
            else
            {
                characterLinkedList.offerLast(charArray[i]);
            }
        }

        return characterLinkedList;
    }
}
