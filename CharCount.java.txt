
import java.util.*;
import java.util.stream.*;

class CharCount{

//1.Occurance of each character using HashMap,
//2.Removing duplicates from array using stream by distinct()
//3.Removing duplicates from array using stream by Collectors.toSet()
//4.Sorting(Default Ascending) the elements in array using stream by sorted()
//5.Sorting Descending the elements in array using stream by sorted(comparator)) (i1,i2)->i2.compareTo(i1)
//6.Adding data in String using StringBuilder append and insert methods

public static void main(String[] args){
	StringBuilder str=new StringBuilder("Hello ");  //6
	str.append("Sateesh");//6
	str.insert(6,"Java");//6
System.out.println(str);//6
	//String str="Sateesh";// s->2,e->2,ath->3
ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(1,2,3,12,3,4,5,2,3,12,5));
System.out.println("Original Array:"+ar);

List<Integer> m=ar.stream().distinct().collect(Collectors.toList());//2
System.out.println("After removing duplicates:"+m);//2

Set<Integer> s=ar.stream().collect(Collectors.toSet());//3
System.out.println("After removing duplicates using set:"+s);//3

m.stream().sorted().forEach(System.out::println);//4

m.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);//5

//1. Occurance of Character start

 HashMap<Character,Integer> hs=new HashMap<>();
for(int i=0;i<=str.length()-1;i++){
   if(hs.containsKey(str.charAt(i))){
    int count=hs.get(str.charAt(i));
    hs.put(str.charAt(i),++count);
   }else{
	hs.put(str.charAt(i),1);
	}
  }
System.out.println(hs);
// 1.Occurance of character end
 }

}