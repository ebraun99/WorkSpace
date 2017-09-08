package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Test {

    public static void main(String... args)
    {
        //custom functional interface
        AdditionFI additionFI = (a,b)->a+b;

        System.out.println(additionFI.add(1,2));


        IntStream();

        method2();


        //fizzBuzz Method
        Function<Integer, String> fizzBuzz1 = (n) -> (n % 15 == 0 ? "FizzBuzz": n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n));

        System.out.println(fizzBuzz(5,fizzBuzz1));


    }

    private static void IntStream()
    {
        //method 1
        FizzBuzz fizzBuzz = (n)-> (n % 15 == 0 ? "FizzBuzz": n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n));

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

    private static void method2()
    {
        //method 2
        BiFunction<Integer, Integer,String> biFunction = (s,t) -> "Multiply: " + s * t;

        System.out.println(biFunction.apply(5,6));

        Function<Integer, String> fizzBuzz1 = (n) -> (n % 15 == 0 ? "FizzBuzz": n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n));

        IntStream.rangeClosed(1,100)
                .mapToObj(fizzBuzz1::apply)
                .forEach(System.out::println);
    }

    private static String fizzBuzz(int n, Function<Integer,String> function)
    {
        return (function.apply(n));
    }


}
