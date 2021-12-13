import java.util.stream.*;

import java.util.Arrays;
class java8Programs{
public static void main(String[] args){

   //1.find the missing number in array using java 8

   int[] arr={1,2,3,5};
   int N=5;
   int grandSum=(N*(N+1))/2;
   int sum=Arrays.stream(arr).sum();
   
   System.out.println("Missing number---"+(grandSum-sum));
   //int missingNum=grandSum-sum;
   //System.out.println("Missed Number:"+(missingNum));	

}
}