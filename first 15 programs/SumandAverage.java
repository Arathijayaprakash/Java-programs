import java.util.Scanner;
public class SumandAverage{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 no.s:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int num4=s.nextInt();
		int num5=s.nextInt();
		int sum,avg;
		sum=num1+num2+num3+num4+num5;
		avg=sum/5;
		System.out.println("Sum ="+sum);
		System.out.println("Average ="+avg);
			
	}
}