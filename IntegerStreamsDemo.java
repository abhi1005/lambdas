package assignment7.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreamsDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for(int i=0;i<=4096;i++){
            integerList.add(i);
        }

        System.out.println("printing the integers ...");

        List<Integer> oddIntegers = integerList.stream().filter(num -> num < 100 && num%2 != 0).collect(Collectors.toList());
        List<Integer> evenIntegers = integerList.stream().filter(num -> num < 100 && num%2 == 0).collect(Collectors.toList());
        List<Integer> powerOfTwoIntegers = integerList.stream().filter(num ->  num > 0 && ((num & num-1) == 0)).collect(Collectors.toList());

        System.out.println(oddIntegers);
        System.out.println(evenIntegers);
        System.out.println(powerOfTwoIntegers);
    }
}
