import java.util.HashSet;

public class Main
{
    public static String string = "5; 1,3,4,5,1";
    public static int currentValue;
    public static HashSet<Integer> set = new HashSet<Integer>();
    public static String newString;

    public static void main(String[] args)
    {
        replaceSpecialCharacters();
        getCurrentValue();
    }

    public static String replaceSpecialCharacters()
    {
        newString = string.replace(",","");
        newString = newString.replace(";","");
        newString = newString.replace(" ","");
        newString = newString.substring(1);

        return newString;
    }

    public static void getCurrentValue()
    {
        for (int i = 0; i <newString.length() ; i++)
        {
            currentValue = Character.getNumericValue(newString.charAt(i));

            if(checkDuplicate())
            {
                System.out.println(currentValue);
            }
        }
    }

    public static boolean checkDuplicate(){
        if(!set.add(currentValue))
        {
            return true;
        }

        else
            return false;
    }
}
