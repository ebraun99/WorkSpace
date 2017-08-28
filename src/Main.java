import java.util.regex.*;

public class Main
{

    public static void main(String[] args)
    {
        int[][] array = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        String longString = " Eric Braun ND 58104 MN (612)555-3948 johnsmith";
        String strageString = " 1Z aaa **** *** {{{ {{ { ";

        // word that is 2 to 20 characters in length

        // [A-Za-z]{2,20} \\w{2,20}

        regexChecker("\\s[A-Za-z]{2,20}\\s", longString);



    }

    public static void regexChecker(String theRegex, String str2Check){

        Pattern checkRegex = Pattern.compile(theRegex);
    }


}
