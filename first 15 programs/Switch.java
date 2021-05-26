import java.util.Scanner;
public class Switch{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("\n\t29\n\t42\n\t44\n\t48\n");
		System.out.println("Enter a size:");
		int ch=s.nextInt();
		switch(ch){
			case 29:System.out.println("Small");
				break;
			case 42:System.out.println("Medium");
				break;
			case 44:System.out.println("large");
				break;
			case 48:System.out.println("Extra large");
				break;
			default:System.out.println("Unknown");
		}
			
	}
}