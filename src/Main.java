import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    private static String input = "0,1,2,3,4;5";
    private static int semicolon;
    private static int sum;
    private static ArrayList<String> arrayList;

    public static void main(String[] args)
    {
        //find the index of semicolon
        semicolon = input.indexOf(";");

        //create int with the sum
        sum = Integer.parseInt(input.substring(semicolon + 1,semicolon+2));

        //remove commas
        input = input.substring(0,semicolon);
        input = input.replace(",","");

        //change into int array
        char[] charArray = input.toCharArray();

        int[] num1intarray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++){
            num1intarray[i] = Character.getNumericValue(charArray[i]);
        }




        for (int i = 0; i <num1intarray.length; i++)
        {
            for (int j = i + 1; j <num1intarray.length; j++) {
                if(num1intarray[i] + num1intarray[j] == sum)
                {
                    arrayList.add(num1intarray[i] + "+" + num1intarray[j]);
                }
            }
        }

        System.out.println(arrayList);



    }




//    public static String string = "5; 1,3,4,5,1";
//    public static int currentValue;
//    public static HashSet<Integer> set = new HashSet<Integer>();
//    public static String newString;
//
//    public static void main(String[] args)
//    {
//        replaceSpecialCharacters();
//        getCurrentValue();
//    }
//
//    public static String replaceSpecialCharacters()
//    {
//        newString = string.replace(",","");
//        newString = newString.replace(";","");
//        newString = newString.replace(" ","");
//        newString = newString.substring(1);
//
//        return newString;
//    }
//
//    public static void getCurrentValue()
//    {
//        for (int i = 0; i <newString.length() ; i++)
//        {
//            currentValue = Character.getNumericValue(newString.charAt(i));
//
//            if(checkDuplicate())
//            {
//                System.out.println(currentValue);
//            }
//        }
//    }
//
//    public static boolean checkDuplicate(){
//        if(!set.add(currentValue))
//        {
//            return true;
//        }
//
//        else
//            return false;
//    }
}
