import java.util.Scanner;
public class Greatest{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 no.s:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();

		if(num1>num2){
			if(num1>num3){
				System.out.println(num1+" is Greatest");
			}
			else{
				System.out.println(num3+" is Greatest");
			}
		}
		else{
			if(num2>num3){
				System.out.println(num2+" is Greatest");
			}
			else{
				System.out.println(num3+" is Greatest");
			}
		}
	
	}
}