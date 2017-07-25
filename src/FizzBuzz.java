/**
 * Created by Eric.Braun on 7/17/2017.
 */
public class FizzBuzz {
    public String evaluate(int number) {
        if(number%3==0 && number%5==0)
            return "FizzBuzz";
        if(number % 3 == 0)
            return "Fizz";
        else if (number%5==0)
            return "Buzz";
        else
        return String.valueOf(number);
    }
}
