


import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;
import java.math.BigInteger;


public class StreamEvenNumbers{

public static void main(String[] args){
//----------------------------------------------------------------------------------------------------------------------------------------------------------

// 1.Given a list of integers, find out all the even numbers exist in the list using Stream functions?
int[] arr={1,2,3,4,5,6,7,8,11};
List<Integer> al=Arrays.asList(10,11,30,141,52,166,10,52);
System.out.println("Original ArrayList"+al);
Arrays.stream(arr).filter(i->(i%2==0)).forEach(System.out::println);

al.stream().filter(i->i%2==0).forEach(System.out::println);
List<Integer> ll= al.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println("preserving even numbers result for array list:"+ll);

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//2.Given a list of integers, find out all the even numbers exist in the list using Stream functions?
al.stream().map(s->s+"").filter(i->i.startsWith("1")).forEach(i->System.out.println("inside streams printing:"+i));

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//3.How to find duplicate elements in a given integers list in java using Stream functions?
Set<Integer> ss=new HashSet<Integer>();
al.stream().filter(n->!ss.add(n)).forEach(System.out::println);
//3.1 How to remove duplicate elements in a given integers list in java using Stream functions?
al.stream().distinct().forEach(i->System.out.println("after removing duplicates:"+i));
al.stream().collect(Collectors.toSet()).forEach(i->System.out.println("after removing duplicates using set type2:"+i));

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//4.Given the list of integers, find the first element of the list using Stream functions?
al.stream().findFirst().ifPresent(i->System.out.println("first Element in array List:"+i));

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//5.Given a list of integers, find the total number of elements present in the list using Stream functions?
long count= al.stream().count();
System.out.println("Number of elements in array List:"+count);

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//6.Given a list of integers, find the maximum value element present in it using Stream functions?
int maximum=al.stream().max(Integer::compare).get();
System.out.println("Maximum element in array List:"+maximum);

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//7.Given a String, find the first non-repeated character in it using Stream functions?
//String input = "Java Hu/ngry Blog Alive is Awesome";
String input = "wbubbling------not because of not hearing well";

Character result=input.chars()
		 .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(entry->entry.getValue()==1L)
		 .map(entry->entry.getKey())
		 .findFirst()
		 .get();
            System.out.println("first non-repeated character in String:"+result);    

//----------------------------------------------------------------------------------------------------------------------------------------------------------
//8 Given a String, find the first repeated character in it using Stream functions?

Character result_2=input.chars()
		 .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(entry->entry.getValue()>1L)
		 .map(entry->entry.getKey())
		 .findFirst()
		 .get();
System.out.println("first repeated character in String:"+result_2);
//----------------------------------------------------------------------------------------------------------------------------------------------------------
//9.Given a list of integers, sort all the values present in it using Stream functions?

List<Integer> sortedArray=al.stream().distinct().sorted().collect(Collectors.toList());
System.out.println("Sorting Array in Ascending order:"+sortedArray);

//----------------------------------------------------------------------------------------------------------------------------------------------------------
//10 Given a list of integers, sort all the values present in it in descending order using Stream functions?

List<Integer> descendingOrderArray=al.stream().distinct().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
System.out.println("Sorting Array in Descending order:"+descendingOrderArray);

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//How to Print range using Streams
System.out.println("printing 1 to 10 values");
IntStream.rangeClosed(1, 10).forEach(val -> System.out.println(val));
//FloatStream.range(1.5,10.5).forEach(val -> System.out.println(val));
//----------------------------------------------------------------------------------------------------------------------------------------------------------

// Print Prime numbers in the range using java8 Stream
//long primeCount = Stream.iterate(0, n -> n + 1)
//                .limit(1000)
//                .filter(TestPrime::isPrime)
//                .peek(x -> System.out.format("%s\t", x))
//                .count();

       System.out.println("-----------------------");
Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
			.limit(10)
			.forEach(x -> System.out.format("%s\t", x));

       System.out.println("-----------------------");
//----------------------------------------------------------------------------------------------------------------------------------------------------------

List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
IntSummaryStatistics stats = primes.stream().mapToInt((x)-> x).summaryStatistics();

System.out.println("Find min,max,count,average of nums in array IntSummaryStatistics:"+stats);


//----------------------------------------------------------------------------------------------------------------------------------------------------------



}

public static boolean isPrime(int number) {

        if (number <= 1) return false; // 1 is not prime and also not composite

        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}