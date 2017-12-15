import java.util.*;
import java.util.stream.Stream;

public class GettingTheDigits
{
    private static final String numberWord = "OZONETOWER";
    private static HashMap<Character, Integer> stringMap = new HashMap<>();
    private static ArrayList<Integer> integers = new ArrayList<>();
    private static LinkedHashMap<String, String> newMap = new LinkedHashMap<>();

    public static void main(String[] args)
    {
        assignUniqueValues();
        createInitialMap(numberWord);
        checkUniques();
        System.out.println(integers);
    }

    private static void assignUniqueValues()
    {
        newMap.put("X6","SIX");
        newMap.put("Z0","ZERO");
        newMap.put("G8","EIGHT");
        newMap.put("W2","TWO");
        newMap.put("U4","FOUR");
        newMap.put("O1","ONE");
        newMap.put("F5","FIVE");
        newMap.put("V7","SEVEN");
        newMap.put("H3","THREE");
        newMap.put("N9","NINE");
    }

    private static void createInitialMap(String word)
    {

        for (Character c : word.toCharArray())
        {
            if(!stringMap.containsKey(c))
            {
                stringMap.put(c,1);
            }

            else
            {
                stringMap.replace(c,stringMap.get(c)+1);
            }
        }
    }

    private static void checkUniques()
    {
        for (Map.Entry<String,String> entry : newMap.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            while(checkMapForLetter(key.charAt(0),stringMap))
            {
                removeLetterFromMap(value);
                integers.add(Integer.parseInt(key.substring(1,2)));
            }

        }
        Collections.sort(integers);

//        while (checkMapForLetter('Z',stringMap))
//        {
//            removeLetterFromMap("ZERO");
//
//            integers.add(0);
//        }
//
//        while (checkMapForLetter('X',stringMap))
//        {
//            removeLetterFromMap("SIX");
//
//            integers.add(6);
//        }
//
//        while (checkMapForLetter('G',stringMap))
//        {
//            removeLetterFromMap("EIGHT");
//            integers.add(8);
//        }
//
//        while (checkMapForLetter('W',stringMap))
//        {
//            removeLetterFromMap("TWO");
//            integers.add(2);
//        }
//
//        while (checkMapForLetter('U',stringMap))
//        {
//            removeLetterFromMap("FOUR");
//            integers.add(4);
//        }
    }

    private static Boolean checkMapForLetter(Character c,HashMap<Character,Integer> stringMap)
    {
        return stringMap.containsKey(c) && stringMap.get(c)!=0;
    }

    private static void decrementLetter(Character c)
    {
        stringMap.replace(c,stringMap.get(c)-1);
    }

    private static void removeLetterFromMap(String s)
    {
        Stream<Character> characterStream = s.chars().mapToObj(i->(char)i);
        characterStream.forEach(c->decrementLetter(c));
    }
}
