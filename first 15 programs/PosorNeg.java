import java.util.Scanner;
public class PosorNeg{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=s.nextInt();
		if(a>=0){
			System.out.println("The no. is Positive");
		}
		else{
			System.out.println("The no. is Negative");
		}
		
	}
}