import java.util.*;
import java.util.function.*;

public class PredicateMain {
   public static void main(String args[]) {
      List<Integer> numList = new ArrayList<>();
      numList.add(5);
	  numList.add(4);
      numList.add(10);
      Predicate<Integer> pred = i -> i > 5;
	  Predicate<Integer> evenPred = i -> i %2==0;
      numList.stream().filter(pred).forEach(i -> System.out.println("List values that are greater than 5:"+i));
	  numList.stream().filter(evenPred).forEach(i -> System.out.println("List values that are even:"+i));
	  
	  List<Integer> numList2 = new ArrayList<>();
      numList2.add(78);
      numList2.add(10);
      Function<Integer, Integer> fun = i -> i / 2;
      numList2.stream().map(fun).forEach(System.out::println); 
   }
}