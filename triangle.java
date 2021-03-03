import java.util.Scanner;
class Triagle{
	
	void pattern(int n)
	{
		int m=n%10;
		if (n>=1)
		{	return pattern(n-1);
			while(n>=1){
		
			System.out.print("*");
			n--;
			}
		System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the size patter:");
		int no=input.nextInt();
		Triagle ob=new Triagle();
		ob.pattern(no);
	}	
}