package wafair;

public class fibonacci {

	public static void main(String[] args) {
		int num = 3;
		//System.out.println(fibo(num));
		//System.out.println(fiborec(num));
		//System.out.println(fib(num));
		// System.out.println(fibeasy(num));
	
	    //System.out.println(findRoots(3,101));
		
		for(int i=0;i<6;i=i+2)
		{
			
		}
	
	}

	private static int findRoots(int i, int j) {
		// TODO Auto-generated method stub
		
		if(i<0||j<0||(i>j))
			return 0;
		//if()
		
		
		
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		
		int a = 1, b = 1, c, i;

	if( n == 1){
		return a;
	}
   if(n==2) {return b;}

		for (i = 3; i <= n; i++)

		{

			c = a + b;
	
			a = b;
	
			b = c;

		}

		return b;
		
		
	}

	private static int fiborec(int num) {
		// TODO Auto-generated method stub
		if(num<0)
			return 0;
		if (num == 1 || num == 2)
			return 1;
		return fibo(num - 1) + fibo(num - 2);

	}

	private static int fibo(int num) {
		// TODO Auto-generated method stub
		if (num <= 0)
			return 0;
		int[] arr = new int[num+1];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i <=num; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[num];

	}

}
