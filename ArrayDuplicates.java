
import java.util.stream.*;
import java.util.*;

class ArrayDuplicates{

public static void partition(int[] a){
int Pindex=0;
for(int i=0;i<a.length;i++){
	if(a[i]<0){
	swap(a,i,Pindex);
	Pindex++;
	}	
}
}

private static void swap(int[] a, int i, int j){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}

public static void main(String[] args){

List<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,2,6,2));
System.out.println("Original Array----"+numbers);
Set<Integer> getDupSet= new HashSet<Integer>();

Set<Integer> DupSet=numbers.stream().filter(i->!getDupSet.add(i)).collect(Collectors.toSet());

Set<Integer> DistinctNumbers=numbers.stream().distinct().collect(Collectors.toSet());


System.out.println("Duplicates:"+DupSet);

System.out.println("DistinctNumbers:"+DistinctNumbers);

int[] a = { 9, -3, 5, -2, -8, -6, 1, 3 };
 
        partition(a);

System.out.println("Negative and Positive Numbers:"+Arrays.toString(a));
}
}