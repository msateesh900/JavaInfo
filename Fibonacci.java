


// 1 1 2 3 5 8 13


class Fibonacci
{
	public static void main(String args[])
	{
		int i=0,j=1,k;
		k=i+j;
		System.out.println(k);
		for(int n=0;n<=5;n++){
			System.out.println(k);
			i=j;
			j=k;
			k=i+j;
		}
		
	}
}