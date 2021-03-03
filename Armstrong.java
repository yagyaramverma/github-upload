//find the no is armstrong is or not
import  java.util.Scanner;
class Armstrong{
	
	static int check(int n)
	{
		int mod=n%10;
		if(n>=1){
			return (mod*mod*mod)+check(n/10);
		}
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the value:");
		int no=input.nextInt();
	//	System.out.println(check(no));
		if (check(no)==no)
			System.out.println("no is armstrong:");
		else
			System.out.println("not an armstrong:");32
	}
}