
import java.util.*;
import java.util.stream.*;

public class MapExamples{

	public static void main(String[] args){
	Map<String,Integer> mm=new HashMap<>();
	mm.put("A",10);
	mm.put("B",40);
	mm.put("F",4);
	mm.put("G",100);
	
	//System.out.println(mm);
		System.out.println("------------Before Java 8 Iterations--------------");
		for(Map.Entry<String,Integer> entry:mm.entrySet()){
		System.out.println("key is:"+entry.getKey()+" Value is:"+entry.getValue());
		}
		System.out.println("--------------In Java 8 Iterations----------------");
		mm.forEach((k,v)->System.out.println("Key:"+k+" Value :"+v));
		Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
		  // keep order, it is always a,b,c,1,2,3
		  s.parallel().forEachOrdered(x -> System.out.println(x));


	
	// finding character count 
	String str="mmmssjjkk";
	Map<Character,Integer> mcc=new HashMap<>();
	for(int i=0;i<=str.length()-1;i++){
	if(mcc.containsKey(str.charAt(i))){
		int count=mcc.get(str.charAt(i));
		mcc.put(str.charAt(i),++count);
		}
	else{
		mcc.put(str.charAt(i),1);
		}
	}
	System.out.println(mcc);


	}

}