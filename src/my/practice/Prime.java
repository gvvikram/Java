package my.practice;

import java.util.Scanner;

public class Prime {

	public static boolean isArmStrong(int x){
		int cd=countDigits(x);
		int original=x;
		int sum=0;
		while(x!=0){
			int rem=x%10;
			x=x/10;
			sum=sum+pavu(rem,cd);
		}
		return sum==original;
	}
	public static int countDigits(int x){
		int c=0;
		while(x!=0){
			x/=10;
			c++;
		}
		return c;
	}
	public static int pavu(int x,int p){
		int m=1;
		for(int i=1;i<=p;i++){
			m=m*x;
		}
		return m;
	}
	public static boolean isPrime(int a) {
		if (a == 1 || a == 2)
			return true;
		if (a % 2 == 0)
			return false;
		for (int i = 3; i * i <= a; i += 2) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		*/
		int num=37;
		
		// checking prime working or not
		if (isPrime(num)) {
			System.out.println(num+ " is a prime");
		} else {

			System.out.println(num + " is not a prime");
		}
		
		// checking count function working or not
		
		System.out.println(countDigits(45)); 

		// checking whether power function working or  not
		System.out.println(pavu(6,3));
		System.out.println(pavu(9,4));
		
		// checking armstrong numbers working
		
		System.out.println(isArmStrong(371));
		
		// All primes in a range
		for(int i=1000000;i<=50000000;i++)
		{
			if(isArmStrong(i)){
				System.out.print(i+" - ");
			}
		}
		
	}
}