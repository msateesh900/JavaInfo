import java.util.function.*;
class Java8Test1{
	public static void main(String[] args){
		Function<Integer,Integer> f=(i)->i*i;
		Predicate<Integer> p=i->i%2==0;
		System.out.println("Square of 4 is:"+f.apply(4));
		System.out.println("Square of 7 is:"+f.apply(7));
		
		System.out.println("4 is even t/f?"+p.test(4));
		System.out.println("7 is even t/f?"+p.test(7));
	}
}


