package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args)
    {
        AdditionFI additionFI = (a,b)->a+b;

        System.out.println(additionFI.add(1,2));

        FizzBuzz fizzBuzz = (a)-> (a % 15 == 0 ? "FizzBuzz": a % 5 == 0 ? "Buzz" : a % 3 == 0 ? "Fizz" : Integer.toString(a));

        System.out.println(fizzBuzz.fizzBuzz(3));

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(3);

        integers.stream()
                .mapToInt(Integer::intValue)
                .mapToObj(fizzBuzz::fizzBuzz)
                .forEach(System.out::println);

        IntStream.rangeClosed(1,100)
                .mapToObj(fizzBuzz::fizzBuzz)
                .forEach(System.out::println);



    }
}
