
import java.util.stream.*; 
import java.util.function.Function;
import java.util.*;
import java.util.stream.Collectors; 
import java.util.Map;
import java.util.List;

import java.util.stream.Stream;


import java.io.BufferedReader;    
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CharCountStream{

static void segregate0and1(int arr[]) {
        int type0 = 0;
        int type1 = arr.length - 1;
         

	while(type0<type1){

	if(arr[type0]==1){
	//swap
	arr[type1]=arr[type1]+arr[type0];
	arr[type0]=arr[type1]-arr[type0];
	arr[type1]=arr[type1]-arr[type0];
	type1--;
}else{
type0++;
}

}

        /*while (type0 < type1) {
            if (arr[type0] == 1) {
                // swap
                arr[type1] = arr[type1]+ arr[type0];
                arr[type0] = arr[type1]-arr[type0];
                arr[type1] = arr[type1]-arr[type0];
                type1--;
            } else {
                type0++;
            }
        }*/
 
    }

public static void main(String[] args) throws FileNotFoundException{

int[] array = {0, 1, 0, 1, 1, 1};
         
  segregate0and1(array);
         
  for(int a : array){
     System.out.print(a+" ");
        }

String ss = "abc aba abcd";
Map<Character,Integer> frequencies = ss.chars().boxed().
					collect(Collectors.toMap(
					 k->Character.valueOf((char)k.intValue()),					    
					 v->1,Integer::sum));

System.out.println("Frequencies:\n" + frequencies);
//List<Integer> ll= IntStream.rangeClosed(1, 10).forEach(System.out::println);
List<Integer> ll= IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList()); // range from 1 to 100

ll.stream().forEach(System.out::print);
ll.parallelStream().forEach(System.out::println);

//System.out.println(ll);

// find word count using stream

//String str="hello my name is Sateesh and my age is in your mind";

String str="aa bb c d aa f";

List <String> list = Arrays.asList("hello", "bye", "ciao", "bye", "ciao"); 

System.out.println("\noriginal list------"+list);


Map<String,Integer> counts3=Arrays.stream(str.split(" ")).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

System.out.println("String word counts using toMap---"+counts3);
String method="toMap";
//groupingBy
//toConcurrentMap
//groupingByConcurrent

if (method.equals("toMap"))
        {
            Map<String, Integer> counts =
                list.stream().collect(
                    Collectors.toMap(
                        w -> w, w -> 1, Integer::sum));
            System.out.println("using toMap---"+counts);
        }
        else if (method.equals("toConcurrentMap"))
        {
            Map<String, Integer> counts =
                list.parallelStream().collect(
                    Collectors.toConcurrentMap(
                        w -> w, w -> 1, Integer::sum));
            System.out.println("using toConcurrentMap---"+counts);
        }
        else if (method.equals("groupingBy"))
        {
            Map<String, Long> counts =
                list.stream().collect(
                    Collectors.groupingBy(
                        Function.identity(), Collectors.<String>counting()));
            System.out.println("using groupingBy---"+counts);
        }
        else if (method.equals("groupingByConcurrent"))
        {
            Map<String, Long> counts =
                list.parallelStream().collect(
                    Collectors.groupingByConcurrent(
                        Function.identity(), Collectors.<String> counting()));
            System.out.println("using groupingByConcurrent---"+counts);
        }
/*  Count Manually using java7 methods
String line, word = "";    
        int count = 0, maxCount = 0;    
        ArrayList<String> words = new ArrayList<String>();    
            
        //Opens file in read mode    
        FileReader file = new FileReader("data.txt ");    
        BufferedReader br = new BufferedReader(file);  

// Reads each line from file
    
        while((line = br.readLine()) != null) {    
            String string[] = line.toLowerCase().split("([,.\\s]+) ");    
            //Adding all words generated in previous step into words    
            for(String s : string){    
                words.add(s);    
            }    
        }    
            
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j))){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word = words.get(i);    
            }    
        }    
*/


List<String> strList=Arrays.asList("Sateesh","Santhosh","Sateesh","Ramesh","Harish","Santhosh");

strList.stream().distinct().sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);



	
Map<String,Integer> strMap=new HashMap<>();

for(String st:strList){
strMap.put(st,strMap.containsKey(st)?(strMap.get(st)+1) :1);
}

Map<String,Long> resList= strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

Map<String,Long> resList1=Arrays.asList("one o'clock two o'clock three o'clock rock".split(" "))
        .stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

System.out.println(resList);
//System.out.println(strMap);

List<String> newList=Arrays.asList("Sateesh","Santhosh","Sateesh","Ramesh","Harish","Santhosh");

Set<String> sc=newList.stream().filter(i -> Collections.frequency(newList, i) > 1)
                .collect(Collectors.toSet());

System.out.println(sc);


}
}

//Collections.sort(al,new NameComparator());  
